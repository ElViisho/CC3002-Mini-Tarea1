package Pokemon.Items;

import Pokemon.Monsters.AbstractPokemon;

/**
 * The parent class for all items that only restore some hp
 */
public abstract class AbstractHpRestoreItem implements HpRestoreItem {
    protected int hp=0;

    /**
     * Constructor for the class
     * @param hp how much hp it restores
     */
    public AbstractHpRestoreItem(int hp){
        this.hp = hp;
    }

    /**
     * @param pokemon The pokemon whose hp will be restored by this
     */
    @Override
    public void use(AbstractPokemon pokemon){
        pokemon.setHp(pokemon.getHp() + this.hp);
    }
}
