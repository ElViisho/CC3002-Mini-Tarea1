package Pokemon.Monsters;

/**
 * Interface to be implemented by the different pokemon types
 * which has the different methods that will be later implemented by them
 */
public interface PokemonInterface {
    //Used when this pokemon attacks another
    public int attack(AbstractPokemon Pokemon);
    //Used by attack() method, for calling when getting attacked
    public int AttackedByPlant(PlantPokemon plantPokemon);
    public int AttackedByFire(FirePokemon firePokemon);
    public int AttackedByWater(WaterPokemon waterPokemon);
}
