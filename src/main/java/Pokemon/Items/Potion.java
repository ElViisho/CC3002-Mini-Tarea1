package Pokemon.Items;

/**
 * Basic potion that restores 20 hp
 */
public class Potion extends AbstractHpRestoreItem{
    /**
     * Constructor for the potion that sets its restorative value to 20 points
     */
    public Potion() {
        super(20);
    }
}
