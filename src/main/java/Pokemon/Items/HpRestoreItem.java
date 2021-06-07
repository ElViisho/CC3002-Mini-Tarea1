package Pokemon.Items;

import Pokemon.Monsters.AbstractPokemon;

/**
 * The interface to be implemented by the items that restore hp for a pokemon
 */
public interface HpRestoreItem {
    /**
     * @param pokemon The pokemon whose hp will be restored by this
     */
    void use(AbstractPokemon pokemon);
}
