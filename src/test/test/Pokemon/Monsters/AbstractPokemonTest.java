package Pokemon.Monsters;

import Pokemon.Monsters.factories.AbstractPokemonFactory;
import Pokemon.Monsters.factories.FirePokemonFactory;
import Pokemon.Monsters.factories.PlantPokemonFactory;
import Pokemon.Monsters.factories.WaterPokemonFactory;

import java.util.Random;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;
import static org.junit.jupiter.api.Assertions.*;

public abstract class AbstractPokemonTest {
    protected String name;
    protected String species;
    protected int maxHp;
    protected int maxPp;

    private int seed;
    private Random rng;

    protected void InitParams(){
        seed = new Random().nextInt();
        rng = new Random(seed);
        int strSize = rng.nextInt(20);
        name = randomAlphanumeric(strSize);
        strSize = rng.nextInt(20);
        species = randomAlphanumeric(strSize);
        maxHp = rng.nextInt(100);
        maxPp = rng.nextInt(100);
    }

    public void checkFireConstructor(FirePokemonFactory factory, FirePokemon pokemon){
        setUpFactory(factory, name, species, maxHp, maxPp);
        FirePokemon newPoke = factory.make();
        assertEquals(pokemon, newPoke);
        assertEquals(pokemon.hashCode(), newPoke.hashCode());
    }

    public void checkWaterConstructor(WaterPokemonFactory factory, WaterPokemon pokemon){
        setUpFactory(factory, name, species, maxHp, maxPp);
        WaterPokemon newPoke = factory.make();
        assertEquals(pokemon, newPoke);
        assertEquals(pokemon.hashCode(), newPoke.hashCode());
    }

    public void checkPlantConstructor(PlantPokemonFactory factory, PlantPokemon pokemon){
        setUpFactory(factory, name, species, maxHp, maxPp);
        PlantPokemon newPoke = factory.make();
        assertEquals(pokemon, newPoke);
        assertEquals(pokemon.hashCode(), newPoke.hashCode());
    }

    private void setUpFactory(AbstractPokemonFactory factory, String name, String species, int maxHp, int maxPp){
        factory.setName(name);
        factory.setSpecies(species);
        factory.setMaxHp(maxHp);
        factory.setMaxPp(maxPp);
    }
}