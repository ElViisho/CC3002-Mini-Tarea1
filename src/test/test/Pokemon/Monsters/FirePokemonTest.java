package Pokemon.Monsters;

import Pokemon.Monsters.factories.FirePokemonFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static java.lang.Math.max;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class FirePokemonTest extends AbstractPokemonTest{
    private FirePokemon firePoke;
    private FirePokemonFactory factory;

    @Test
    void initialTest(){
        name = "Charmander";
        species = "Charmander";
        maxHp = 20;
        maxPp = 20;

        factory = new FirePokemonFactory();
        factory.setName(name);
        factory.setSpecies(species);
        factory.setMaxHp(maxHp);
        factory.setMaxPp(maxPp);

        firePoke = new FirePokemon(name, species, maxHp, maxPp);
        var factoryFire = factory.make();
        assertEquals(firePoke, factoryFire);
    }

    @BeforeEach
    void setUp() {
        InitParams();
        firePoke = new FirePokemon(name, species, maxHp, maxPp);
    }

    @RepeatedTest(25)
    void constructorTest(){
        factory = new FirePokemonFactory();
        checkFireConstructor(factory, firePoke);
    }

    @Test
    void battleTest(){
        var FireFactory = new FirePokemonFactory();
        FireFactory.setName("Fuego Fuego Fire Fire");
        FireFactory.setSpecies("Charmander");
        FireFactory.setMaxHp(20);
        FireFactory.setMaxPp(20);
        firePoke = FireFactory.make();

        //Plant
        var PlantPoke = createPlant();

        firePoke.attack(PlantPoke);
        assertEquals(max(PlantPoke.getMaxHp() - 10, 0), PlantPoke.getHp());

        PlantPoke.attack(firePoke);
        assertEquals(firePoke.getMaxHp() - 5, firePoke.getHp());

        //Fire
        var Fire2Poke = createFire();

        firePoke.attack(Fire2Poke);
        assertEquals(max(Fire2Poke.getMaxHp() - 5, 0), Fire2Poke.getHp());

        Fire2Poke.attack(firePoke);
        assertEquals(firePoke.getMaxHp() - 5 - 5, firePoke.getHp());

        //Water
        var WaterPoke = createWater();

        firePoke.attack(WaterPoke);
        assertEquals(max(WaterPoke.getMaxHp() - 5, 0), WaterPoke.getHp());

        WaterPoke.attack(firePoke);
        assertEquals(firePoke.getMaxHp() - 5 - 5 - 10, firePoke.getHp());

        //After all that damage, Pokemon must be dead
        assertFalse(firePoke.isAlive());
    }

    @Test
    void hpTest(){
        checkHp(firePoke);
    }
}