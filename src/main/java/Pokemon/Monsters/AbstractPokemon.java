package Pokemon.Monsters;

/**
 * The abstract class that implements the interface and
 * is the base for each of the Pokemon types classes
 */
public abstract class AbstractPokemon implements PokemonInterface{
    private String name;        //The name of the Pokemon (determined by player)
    private String species;     //The name of the species
    private int hp;             //The health points the pokemon has
    private final int maxHp;          //The max health points the pokemon can have
    private int pp;             //The power points the pokemon has
    private final int maxPp;          //The max power points the pokemon can have

    /**
     * The constructor for the different pokemon to use
     * @param name The nickname for the Pokemon
     * @param species The name of the Pokemon species
     * @param maxHp The max hp the Pokemon can have
     * @param maxPp The max hp the Pokemon can have
     */
    protected AbstractPokemon(String name, String species, int maxHp, int maxPp) {
        this.name = name;
        this.species = species;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.maxPp = maxPp;
        this.pp = maxPp;
    }

    /**
     * @return Get the current hp of the pokemon
     */
    public int getHp(){
        return hp;
    }

    /**
     * Method for setting the hp of the Pokemon to a new value
     * @param hp The new value for the hp
     */
    public void setHp(int hp){
        this.hp = hp;
        if (this.hp < 0) this.hp = 0;
        if (this.hp > this.getMaxHp()) this.hp = getMaxHp();
    }

    /**
     * @return Gets the max hp a the Pokemon can have
     */
    public int getMaxHp() {
        return maxHp;
    }

    /**
     * @return Get the current pp of the pokemon
     */
    public int getPp() {
        return pp;
    }

    /**
     * Method for setting the pp of the Pokemon to a new value
     * @param pp The new value for the pp
     */
    public void setPp(int pp) {
        this.pp = pp;
        if (this.pp < 0) this.pp = 0;
        if (this.pp > this.getMaxPp()) this.pp = getMaxPp();
    }

    /**
     * @return Gets the max pp a the Pokemon can have
     */
    public int getMaxPp() {
        return maxPp;
    }

    /**
     * @return Get the nickname of the Pokemon
     */
    public String getName() {
        return name;
    }

    /**
     * Method for setting a new nickname for the Pokemon
     * @param name The new nickname for the Pokemon
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Get the name of the species of the Pokemon
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Method that checks if current Pokemon is alive or not
     * @return If hp is greater than 0, it's still alive. Otherwise, it isn't
     */
    public boolean isAlive(){
        return hp > 0;
    }

}
