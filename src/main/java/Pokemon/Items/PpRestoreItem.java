package Pokemon.Items;

import Pokemon.Monsters.AbstractPokemon;

/**
 * The interface to be implemented by the items that restore pp for a pokemon
 */
public interface PpRestoreItem {
    /**
     * @param pokemon The pokemon whose pp will be restored by this
     */
    void use(AbstractPokemon pokemon);
}
