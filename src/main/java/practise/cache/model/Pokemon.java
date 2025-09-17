package practise.cache.model;

import java.util.List;
import java.util.Objects;

/**
 * Model representing Pokemon.
 */
public class Pokemon {

    private Integer id;
    private String name;
    private PokemonType type;
    private double height;
    private double weight;
    private List<Ability> abilities;

    // Full constructor
    public Pokemon(Integer id, String name, PokemonType type, double height, double weight, List<Ability> abilities) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.height = height;
        this.weight = weight;
        this.abilities = abilities;
    }

    //  constructor with just body - no id
    public Pokemon(String name, PokemonType type, double height, double weight, List<Ability> abilities) {
        this.name = name;
        this.type = type;
        this.height = height;
        this.weight = weight;
        this.abilities = abilities;
    }

    public Pokemon() {
    }

    // Getters
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public PokemonType getType() {
        return type;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // equals and hashCode based on id and name
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pokemon)) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(id, pokemon.id) && Objects.equals(name, pokemon.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // toString
    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", height=" + height +
                ", weight=" + weight +
                ", abilities=" + abilities +
                '}';
    }

    // Builder pattern (manual replacement for Lombok @Builder)
    public static class Builder {
        private Integer id;
        private String name;
        private PokemonType type;
        private double height;
        private double weight;
        private List<Ability> abilities;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder type(PokemonType type) {
            this.type = type;
            return this;
        }

        public Builder height(double height) {
            this.height = height;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder abilities(List<Ability> abilities) {
            this.abilities = abilities;
            return this;
        }

        public Pokemon build() {
            return new Pokemon(id, name, type, height, weight, abilities);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
