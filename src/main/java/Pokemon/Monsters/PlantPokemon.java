package Pokemon.Monsters;

import java.util.Objects;

/**
 * The class from which the plant-type pokemon will be created
 */
public class PlantPokemon extends AbstractPokemon {

    /**
     * Constructor for the main.java.cl.uchile.dcc.pokemon.Plant type Pokemon. It calls the main.java.cl.uchile.dcc.pokemon.AbstractPokemon's constructor
     * @param name The nickname for the Pokemon
     * @param species The name of the Pokemon species
     * @param maxHp The max hp the Pokemon can have
     * @param maxPp The max hp the Pokemon can have
     */
    public PlantPokemon(String name, String species, int maxHp, int maxPp){
        super(name, species, maxHp, maxPp);
    }

    /**
     * @param obj the object to be compared with
     * @return whether the objects have the same name, species and stats
     */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof PlantPokemon){
            var other = (PlantPokemon) obj;
            return this.getName().equals(other.getName()) && this.getSpecies().equals(other.getSpecies())
                    && this.getMaxHp() == other.getMaxHp() && this.getMaxPp() == other.getMaxPp();
        }
        return false;
    }

    /**
     * @return the hashcode of the instance
     */
    @Override
    public int hashCode() {
        return Objects.hash(PlantPokemon.class, this.getName(), this.getSpecies(), this.getMaxHp(), this.getMaxPp());
    }

    /**
     * Method that makes the current Pokemon attack the other Pokemon
     * @param otherPokemon The Pokemon that will be attacked by this
     * @return the damage that was done to the other Pokemon
     */
    @Override
    public int attack(AbstractPokemon otherPokemon){
        int damage = otherPokemon.AttackedByPlant(this);
        int newLife = otherPokemon.getHp() - damage;
        otherPokemon.setHp(newLife);
        System.out.println(this.getName() + " the " + this.getSpecies() + " attacks " + otherPokemon.getName() + " the " + otherPokemon.getSpecies());
        System.out.println("The attack did " + damage + " damage, leaving " + otherPokemon.getName() + " with " + otherPokemon.getHp() + " HP.");
        return damage;
    }

    /**
     * @param plantPokemon The Pokemon that is attacking this
     * @return The damage that is done to this
     * main.java.cl.uchile.dcc.pokemon.Plant resists main.java.cl.uchile.dcc.pokemon.Plant, so only five damage is done
     */
    @Override
    public int AttackedByPlant(PlantPokemon plantPokemon){
        return 5;
    }

    /**
     * @param firePokemon The Pokemon that is attacking this
     * @return The damage that is done to this
     * main.java.cl.uchile.dcc.pokemon.Plant is weak main.java.cl.uchile.dcc.pokemon.Fire, so ten damage is done
     */
    @Override
    public int AttackedByFire(FirePokemon firePokemon){
        return 10;
    }

    /**
     * @param waterPokemon The Pokemon that is attacking this
     * @return The damage that is done to this
     * main.java.cl.uchile.dcc.pokemon.Plant resists main.java.cl.uchile.dcc.pokemon.Water, so only five damage is done
     */
    @Override
    public int AttackedByWater(WaterPokemon waterPokemon){
        return 5;
    }
}


