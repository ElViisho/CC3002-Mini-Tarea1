package Pokemon.Monsters.factories;

import Pokemon.Monsters.AbstractPokemon;

public interface PokemonFactory {

    /**
     * Creates an instance of a Pokemon with the current variables
     */
    AbstractPokemon make();

    /**
     * @param name Sets this as the name of the Pokemon that will be created
     */
    void setName(String name);

    /**
     * @param species Sets this as the species of the Pokemon that will be created
     */
    void setSpecies(String species);

    /**
     * @param maxHp Sets this as the max health points the Pokemon that will be created can have
     */
    void setMaxHp(int maxHp);

    /**
     * @param maxPp Sets this as the max power points the Pokemon that will be created can have
     */
    void setMaxPp(int maxPp);
}
