public class Fire extends PokemonAbstract{
    public Fire(String name, String species, int life){
        super(name, species, life);
    }

    @Override
    public void attack(PokemonAbstract otroPokemon){
        var damage = otroPokemon.AttackedByFire(this);
        otroPokemon.setLife(damage);
    }

    @Override
    public int AttackedByPlant(Plant plant){
        return 5;
    }
    @Override
    public int AttackedByFire(Fire fire){
        return 5;
    }
    @Override
    public int AttackedByWater(Water water){
        return 10;
    }
}