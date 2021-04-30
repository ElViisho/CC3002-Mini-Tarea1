/**
 * The class from which the plant-type pokemon will be created
 */
public class Plant extends PokemonAbstract{

    /**
     * Constructor for the Plant type Pokemon. It calls the PokemonAbstract's constructor
     * @param name The nickname for the Pokemon
     * @param species The name of the Pokemon species
     * @param life The life points for the Pokemon to be initiated
     */
    public Plant(String name, String species, int life){
        super(name, species, life);
    }

    /**
     * Method that makes the current Pokemon attack the other Pokemon
     * @param otherPokemon The Pokemon that will be attacked by this
     * @return the damage that was done to the other Pokemon
     */
    @Override
    public int attack(PokemonAbstract otherPokemon){
        int damage = otherPokemon.AttackedByPlant(this);
        int newLife = otherPokemon.getLife() - damage;
        otherPokemon.setLife(newLife);
        return damage;
    }

    /**
     * @param plant The Pokemon that is attacking this
     * @return The damage that is done to this
     * Plant resists Plant, so only five damage is done
     */
    @Override
    public int AttackedByPlant(Plant plant){
        return 5;
    }

    /**
     * @param fire The Pokemon that is attacking this
     * @return The damage that is done to this
     * Plant is weak Fire, so ten damage is done
     */
    @Override
    public int AttackedByFire(Fire fire){
        return 10;
    }

    /**
     * @param water The Pokemon that is attacking this
     * @return The damage that is done to this
     * Plant resists Water, so only five damage is done
     */
    @Override
    public int AttackedByWater(Water water){
        return 5;
    }
}


