public abstract class PokemonAbstract implements PokemonInterface{
    private String name;
    private String species;
    private int life;

    protected PokemonAbstract(String name, String species, int life) {
        this.name = name;
        this.species = species;
        this.life = life;
    }

    public int getLife(){
        return life;
    }

    public void setLife(int damage){
        this.life -= damage;
    }
}
