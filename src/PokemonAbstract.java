public abstract class PokemonAbstract implements PokemonInterface{
    private String nombre;
    private String especie;
    private int vida;

    protected PokemonAbstract(String nombre, String especie, int vida) {
        this.nombre = nombre;
        this.especie = especie;
        this.vida = vida;
    }

    public int getVida(){
        return vida;
    }

    public void setVida(int damage){
        this.vida -= damage;
    }
}
