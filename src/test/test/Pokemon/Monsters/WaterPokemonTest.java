package Pokemon.Monsters;

import Pokemon.Monsters.factories.WaterPokemonFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static java.lang.Math.max;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class WaterPokemonTest extends AbstractPokemonTest{
    private WaterPokemon waterPoke;
    private WaterPokemonFactory factory;

    @Test
    void initialTest(){
        name = "Squirtle";
        species = "Squirtle";
        maxHp = 20;
        maxPp = 20;

        factory = new WaterPokemonFactory();
        factory.setName(name);
        factory.setSpecies(species);
        factory.setMaxHp(maxHp);
        factory.setMaxPp(maxPp);

        waterPoke = new WaterPokemon(name, species, maxHp, maxPp);
        var factoryWater = factory.make();
        assertEquals(waterPoke, factoryWater);
    }

    @BeforeEach
    void setUp() {
        InitParams();
        waterPoke = new WaterPokemon(name, species, maxHp, maxPp);
    }

    @RepeatedTest(25)
    void constructorTest(){
        factory = new WaterPokemonFactory();
        checkWaterConstructor(factory, waterPoke);
    }

    @Test
    void battleTest(){
        var WaterFactory = new WaterPokemonFactory();
        WaterFactory.setName("Tortuganator");
        WaterFactory.setSpecies("Squirtle");
        WaterFactory.setMaxHp(20);
        WaterFactory.setMaxPp(20);
        waterPoke = WaterFactory.make();

        //Plant
        var PlantPoke = createPlant();

        waterPoke.attack(PlantPoke);
        assertEquals(max(PlantPoke.getMaxHp() - 5, 0), PlantPoke.getHp());

        PlantPoke.attack(waterPoke);
        assertEquals(waterPoke.getMaxHp() - 10, waterPoke.getHp());

        //Fire
        var FirePoke = createFire();

        waterPoke.attack(FirePoke);
        assertEquals(max(FirePoke.getMaxHp() - 10, 0), FirePoke.getHp());

        FirePoke.attack(waterPoke);
        assertEquals(waterPoke.getMaxHp() - 10 - 5, waterPoke.getHp());

        //Water
        var Water2Poke = createWater();

        waterPoke.attack(Water2Poke);
        assertEquals(max(Water2Poke.getMaxHp() - 5, 0), Water2Poke.getHp());

        Water2Poke.attack(waterPoke);
        assertEquals(waterPoke.getMaxHp() - 10 - 5 - 5, waterPoke.getHp());

        //After all that damage, Pokemon must be dead
        assertFalse(waterPoke.isAlive());
    }

    @Test
    void hpTest(){
        checkHp(waterPoke);
    }
}
