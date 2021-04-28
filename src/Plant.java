//The class from which the plant-type pokemon will be created

public class Plant extends PokemonAbstract{
    public Plant(String name, String species, int life){
        super(name, species, life);
    }

    @Override
    public int attack(PokemonAbstract otherPokemon){
        int damage = otherPokemon.AttackedByPlant(this);
        int newLife = otherPokemon.getLife() - damage;
        otherPokemon.setLife(newLife);
        return damage;
    }

    @Override
    public int AttackedByPlant(Plant plant){
        return 5;
    }
    @Override
    public int AttackedByFire(Fire fire){
        return 10;
    }
    @Override
    public int AttackedByWater(Water water){
        return 5;
    }
}
