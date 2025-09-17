package com.weave.service;


import com.weave.cache.Cache;
import com.weave.cache.PokemonCache;
import com.weave.exceptions.PokemonNotFoundException;
import com.weave.model.Pokemon;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PokemonService {

    private final Cache<String, Pokemon> pokemonCache;

    // Inject your cache via constructor
    public PokemonService(Cache<String, Pokemon> pokemonCache) {
        this.pokemonCache = pokemonCache;
    }

    public Pokemon getPokemonByName(final String name) {
        try {
            return pokemonCache.get(name);

        } catch (PokemonNotFoundException e) {
            // emit metric + translate exception from DAO to service layer
            throw new PokemonNotFoundException("Pokemon with name '" + name + "' not found");
        }
    }

    // currently this operation is costly, we can optimise it using maintaining 2 caches
    // simulating indexing in databases to have faster reads.

    // simulated fetching from DAO layer and domain logic
    public Pokemon getPokemonById(Integer id) {

        for (Pokemon p : ((PokemonCache)pokemonCache).getCache().values()) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        throw new PokemonNotFoundException("Pokemon with id " + id + " does not exist");
    }

    public void deletePokemonById(final Integer id) {

        for (Pokemon p : ((PokemonCache)pokemonCache).getCache().values()) {
            if (p.getId().equals(id)) {
                pokemonCache.delete(p.getName());
            }
        }
        // need to be handled as per business requirements.
    }

    // saves a pokemon
    public void addPokemon(final Pokemon pokemon) {
        String name = pokemon.getName();
        // all validation using regex would go here
        if(name == null || name.isEmpty()) {
            // need to create a custom exception for this scenerio
            throw  new IllegalArgumentException("Name of pokemon can't be null");
        }
        // either Id can be generated or accepted from user.
        // use case dependent
        Integer id = pokemon.getId();

        if(id == null) {
            Random random = new Random();
            int randomBounded = random.nextInt(1000);
            pokemon.setId(randomBounded);
        }
        // need to handle when pokemon with same name present
        // use -case dependent - can overwrite or throw exception
        // simulates saves in DB.
        pokemonCache.set(pokemon.getName(), pokemon);
    }
}
