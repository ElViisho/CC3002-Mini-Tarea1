package Pokemon.Monsters.factories;

import Pokemon.Monsters.FirePokemon;

public class FirePokemonFactory extends AbstractPokemonFactory{
    /**
     * Creates an instance of a Pokemon with the current variables
     */
    @Override
    public FirePokemon make() {
        return new FirePokemon(name, species, maxHp, maxPp);
    }
}
