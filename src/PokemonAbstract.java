// The abstract class that implements the interface and
// is the base for each of the types that will be later implemented

public abstract class PokemonAbstract implements PokemonInterface{
    private String name;        //The name of the Pokemon (determined by player)
    private String species;     //The name of the species
    private int life;           //The base life points when the battle starts

    //The constructor for the different pokemon to use
    protected PokemonAbstract(String name, String species, int life) {
        this.name = name;
        this.species = species;
        this.life = life;
    }

    //Get the current life of the pokemon
    public int getLife(){
        return life;
    }

    //Set the life equal to the new quantity
    public void setLife(int newLife){
        this.life = newLife;
    }
}
