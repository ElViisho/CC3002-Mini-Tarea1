package Pokemon.Monsters.factories;

import Pokemon.Monsters.PlantPokemon;

public class PlantPokemonFactory extends AbstractPokemonFactory{
    /**
     * Creates an instance of a Pokemon with the current variables
     */
    @Override
    public PlantPokemon make() {
        return new PlantPokemon(name, species, maxHp, maxPp);
    }
}
