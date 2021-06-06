package Pokemon.Monsters.factories;

import Pokemon.Monsters.WaterPokemon;

public class WaterPokemonFactory extends AbstractPokemonFactory{
    /**
     * Creates an instance of a Pokemon with the current variables
     */
    @Override
    public WaterPokemon make() {
        return new WaterPokemon(name, species, maxHp, maxPp);
    }
}
