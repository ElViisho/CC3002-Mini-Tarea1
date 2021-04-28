public class Agua extends PokemonAbstract{
    public Agua(String nombre, String especie, int vida){
        super(nombre, especie, vida);
    }

    public int pelea (PokemonInterface otroPokemon){
        return otroPokemon.PeleaContraAgua(this);
    }

    public int PeleaContraPlanta(Planta planta){
        return 10;
    }
    public int PeleaContraFuego(Fuego fuego){
        return 5;
    }
    public int PeleaContraAgua(Agua agua){
        return 5;
    }
}
