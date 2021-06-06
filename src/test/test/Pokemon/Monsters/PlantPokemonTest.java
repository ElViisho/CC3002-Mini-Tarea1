package Pokemon.Monsters;

import Pokemon.Monsters.factories.PlantPokemonFactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static java.lang.Math.max;
import static org.junit.jupiter.api.Assertions.*;

public class PlantPokemonTest extends AbstractPokemonTest{
    private PlantPokemon plantPoke;
    private PlantPokemonFactory factory;

    @Test
    void initialTest(){
        name = "Bulbasaur";
        species = "Bulbasaur";
        maxHp = 20;
        maxPp = 20;

        factory = new PlantPokemonFactory();
        factory.setName(name);
        factory.setSpecies(species);
        factory.setMaxHp(maxHp);
        factory.setMaxPp(maxPp);

        plantPoke = new PlantPokemon(name, species, maxHp, maxPp);
        var factoryPlant = factory.make();
        assertEquals(plantPoke, factoryPlant);
    }

    @BeforeEach
    void setUp() {
        InitParams();
        plantPoke = new PlantPokemon(name, species, maxHp, maxPp);
    }

    @RepeatedTest(25)
    void constructorTest(){
        factory = new PlantPokemonFactory();
        checkPlantConstructor(factory, plantPoke);
    }

    @Test
    void battleTest(){
        var PlantFactory = new PlantPokemonFactory();
        PlantFactory.setName("Gato");
        PlantFactory.setSpecies("Bulbasaur");
        PlantFactory.setMaxHp(20);
        PlantFactory.setMaxPp(20);
        plantPoke = PlantFactory.make();

        //Plant
        var Plant2Poke = createPlant();

        plantPoke.attack(Plant2Poke);
        assertEquals(max(Plant2Poke.getMaxHp() - 5, 0), Plant2Poke.getHp());

        Plant2Poke.attack(plantPoke);
        assertEquals(plantPoke.getMaxHp() - 5, plantPoke.getHp());

        //Fire
        var FirePoke = createFire();

        plantPoke.attack(FirePoke);
        assertEquals(max(FirePoke.getMaxHp() - 5, 0), FirePoke.getHp());

        FirePoke.attack(plantPoke);
        assertEquals(plantPoke.getMaxHp() - 5 - 10, plantPoke.getHp());

        //Water
        var WaterPoke = createWater();

        plantPoke.attack(WaterPoke);
        assertEquals(max(WaterPoke.getMaxHp() - 10, 0), WaterPoke.getHp());

        WaterPoke.attack(plantPoke);
        assertEquals(plantPoke.getMaxHp() - 5 - 10 - 5, plantPoke.getHp());

        //After all that damage, Pokemon must be dead
        assertFalse(plantPoke.isAlive());
    }

    @Test
    void hpTest(){
        checkHp(plantPoke);
    }
}
