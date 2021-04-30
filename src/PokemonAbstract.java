/**
 * The abstract class that implements the interface and
 * is the base for each of the Pokemon types classes
 */
public abstract class PokemonAbstract implements PokemonInterface{
    private String name;        //The name of the Pokemon (determined by player)
    private String species;     //The name of the species
    private int life;           //The base life points when the battle starts

    /**
     * The constructor for the different pokemon to use
     * @param name The nickname for the Pokemon
     * @param species The name of the Pokemon species
     * @param life The life points for the Pokemon to be initiated
     */
    protected PokemonAbstract(String name, String species, int life) {
        this.name = name;
        this.species = species;
        this.life = life;
    }

    /**
     * @return Get the current life of the pokemon
     */
    public int getLife(){
        return life;
    }

    /**
     * Method for setting the life of the Pokemon to a new value
     * @param newLife The new value for the life
     */
    protected void setLife(int newLife){
        this.life = newLife;
        if (this.life < 0) this.life = 0;
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
     * Method that checks if current Pokemon is alive or not
     * @return If life is greater than 0, it's still alive. Otherwise, it isn't
     */
    public boolean isAlive(){
        return life > 0;
    }
}
