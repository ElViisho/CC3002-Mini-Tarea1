//The class from which the plant-type pokemon will be created

public class Plant extends PokemonAbstract{
    public Plant(String name, String species, int life){
        super(name, species, life);
    }

    @Override
    //The attack method calls the other's pokemon method of getting attacked by this type
    public int attack(PokemonAbstract otherPokemon){
        int damage = otherPokemon.AttackedByPlant(this);
        int newLife = otherPokemon.getLife() - damage;
        otherPokemon.setLife(newLife);
        return damage;
    }

    @Override
    //Plant resists Plant
    public int AttackedByPlant(Plant plant){
        return 5;
    }
    @Override
    //Plant is weak to Fire
    public int AttackedByFire(Fire fire){
        return 10;
    }
    @Override
    //Plant resists Water
    public int AttackedByWater(Water water){
        return 5;
    }
}
