package Pokemon.Items;

import Pokemon.Monsters.AbstractPokemon;

public abstract class AbstractPpRestoreItem implements PpRestoreItem{
    protected int pp=0;

    /**
     * Constructor for the class
     * @param pp how much hp it restores
     */
    public AbstractPpRestoreItem(int pp){
        this.pp = pp;
    }

    /**
     * @param pokemon The pokemon whose pp will be restored by this
     */
    @Override
    public void use(AbstractPokemon pokemon){
        pokemon.setPp(pokemon.getPp() + this.pp);
    }
}
