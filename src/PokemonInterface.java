// Interface to be implemented by the different pokemon types
// If more types are added, they just have to be declared here in the way
// the current ones are

public interface PokemonInterface {
    public void attack(PokemonAbstract Pokemon);    // Used when this pokemon attacks another
    //Used by attack() method, for calling when getting attacked
    public int AttackedByPlant(Plant plant);
    public int AttackedByFire(Fire fire);
    public int AttackedByWater(Water water);
}
