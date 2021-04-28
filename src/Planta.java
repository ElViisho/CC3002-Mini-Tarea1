public class Planta extends PokemonAbstract{
    public Planta(String nombre, String especie, int vida){
        super(nombre, especie, vida);
    }

    public int pelea (PokemonInterface otroPokemon){
        return otroPokemon.PeleaContraPlanta(this);
    }

    public int PeleaContraPlanta(Planta planta){
        return 5;
    }
    public int PeleaContraFuego(Fuego fuego){
        return 10;
    }
    public int PeleaContraAgua(Agua agua){
        return 5;
    }
}
