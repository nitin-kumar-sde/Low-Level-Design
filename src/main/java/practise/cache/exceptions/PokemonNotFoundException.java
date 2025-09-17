package practise.cache.exceptions;

/**
* Represents the scenario when Key is not present in the Cache but accessed.
 */
public class PokemonNotFoundException extends RuntimeException {

    public PokemonNotFoundException(String message) {
        super(message);
    }
}
