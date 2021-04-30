/**
 * The class from which the fire-type pokemon will be created
 */
public class Fire extends PokemonAbstract{

    /**
     * Constructor for the Fire type Pokemon. It calls the PokemonAbstract's constructor
     * @param name The nickname for the Pokemon
     * @param species The name of the Pokemon species
     * @param life The life points for the Pokemon to be initiated
     */
    public Fire(String name, String species, int life){
        super(name, species, life);
    }

    /**
     * Method that makes the current Pokemon attack the other Pokemon
     * @param otherPokemon The Pokemon that will be attacked by this
     * @return the damage that was done to the other Pokemon
     */
    @Override
    public int attack(PokemonAbstract otherPokemon){
        int damage = otherPokemon.AttackedByFire(this);
        int newLife = otherPokemon.getLife() - damage;
        otherPokemon.setLife(newLife);
        return damage;
    }

    /**
     * @param plant The Pokemon that is attacking this
     * @return The damage that is done to this
     * Fire resists Plant, so only five damage is done
     */
    @Override
    public int AttackedByPlant(Plant plant){
        return 5;
    }

    /**
     * @param fire The Pokemon that is attacking this
     * @return The damage that is done to this
     * Fire resists Fire, so only five damage is done
     */
    @Override
    public int AttackedByFire(Fire fire){
        return 5;
    }

    /**
     * @param water The Pokemon that is attacking this
     * @return The damage that is done to this
     * Fire is weak Water, so ten damage is done
     */
    @Override
    public int AttackedByWater(Water water){
        return 10;
    }
}