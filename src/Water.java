public class Water extends PokemonAbstract{
    public Water(String name, String species, int life){
        super(name, species, life);
    }

    @Override
    public void attack(PokemonAbstract otroPokemon){
        var damage = otroPokemon.AttackedByWater(this);
        otroPokemon.setLife(damage);
    }

    @Override
    public int AttackedByPlant(Plant plant){
        return 10;
    }
    @Override
    public int AttackedByFire(Fire fire){
        return 5;
    }
    @Override
    public int AttackedByWater(Water water){
        return 5;
    }
}
