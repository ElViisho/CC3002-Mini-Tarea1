public class Fuego extends PokemonAbstract{
    public Fuego(String nombre, String especie, int vida){
        super(nombre, especie, vida);
    }

    public int pelea (PokemonInterface otroPokemon){
        return otroPokemon.PeleaContraFuego(this);
    }

    public int PeleaContraPlanta(Planta planta){
        return 5;
    }
    public int PeleaContraFuego(Fuego fuego){
        return 5;
    }
    public int PeleaContraAgua(Agua agua){
        return 10;
    }
}