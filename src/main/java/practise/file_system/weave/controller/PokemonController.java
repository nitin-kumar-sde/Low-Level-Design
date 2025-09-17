package com.weave.controller;

import com.weave.model.Pokemon;
import com.weave.service.PokemonService;
import org.springframework.web.bind.annotation.*;

/**
 * Web Controller layer exposing REST endpoint for supporting CRUD
 * operations on Pokemons.
 */
@RestController
@RequestMapping("/api/v1/pokemon")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/name/{name}")
    public Pokemon deletePokemonByName(@PathVariable String name) {
        // can have basic validation on null or empty name for
        // Fast - Failing the request.
        return pokemonService.getPokemonByName(name);
    }

    @GetMapping("/{id}")
    public Pokemon getPokemonById(@PathVariable Integer id) {
        // can have basic validation on Id
        return pokemonService.getPokemonById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePokemonByName(@PathVariable Integer id) {

         pokemonService.deletePokemonById(id);
    }

    @PostMapping
    public void addPokemon(@RequestBody Pokemon pokemon) {
        // validation would be performed in service layer.
        pokemonService.addPokemon(pokemon);
    }
}

