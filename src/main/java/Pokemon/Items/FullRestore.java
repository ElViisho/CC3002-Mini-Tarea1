package Pokemon.Items;

import Pokemon.Monsters.AbstractPokemon;

public class FullRestore implements HpRestoreItem, PpRestoreItem{
    /**
     * The constructor for the class. It's empty because it doesn't need anything to be initiated apart from itself
     */
    public FullRestore(){
    }

    /**
     * @param pokemon The pokemon whose hp will be restored by this
     */
    @Override
    public void use(AbstractPokemon pokemon) {
        pokemon.setHp(pokemon.getMaxHp());
        pokemon.setPp(pokemon.getMaxPp());
    }

}
