//The class from which the water-type pokemon will be created

public class Water extends PokemonAbstract{
    public Water(String name, String species, int life){
        super(name, species, life);
    }

    @Override
    public int attack(PokemonAbstract otherPokemon){
        int damage = otherPokemon.AttackedByWater(this);
        int newLife = otherPokemon.getLife() - damage;
        otherPokemon.setLife(newLife);
        return damage;
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
