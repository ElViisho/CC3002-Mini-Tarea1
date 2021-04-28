//The class from which the water-type pokemon will be created

public class Water extends PokemonAbstract{
    public Water(String name, String species, int life){
        super(name, species, life);
    }

    @Override
    //The attack method calls the other's pokemon method of getting attacked by this type
    public int attack(PokemonAbstract otherPokemon){
        int damage = otherPokemon.AttackedByWater(this);
        int newLife = otherPokemon.getLife() - damage;
        otherPokemon.setLife(newLife);
        return damage;
    }

    @Override
    //Water is weak to Plant
    public int AttackedByPlant(Plant plant){
        return 10;
    }
    @Override
    //Water resist Fire
    public int AttackedByFire(Fire fire){
        return 5;
    }
    @Override
    //Water resist Water
    public int AttackedByWater(Water water){
        return 5;
    }
}
