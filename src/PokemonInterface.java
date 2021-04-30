/**
 * Interface to be implemented by the different pokemon types
 * which has the different methods that will be later implemented by them
 */
public interface PokemonInterface {
    //Used when this pokemon attacks another
    public int attack(PokemonAbstract Pokemon);
    //Used by attack() method, for calling when getting attacked
    public int AttackedByPlant(Plant plant);
    public int AttackedByFire(Fire fire);
    public int AttackedByWater(Water water);
}
