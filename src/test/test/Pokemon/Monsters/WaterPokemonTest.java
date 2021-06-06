package Pokemon.Monsters;

import Pokemon.Monsters.factories.WaterPokemonFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WaterPokemonTest extends AbstractPokemonTest{
    private WaterPokemon water;
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

        water = new WaterPokemon(name, species, maxHp, maxPp);
        var factoryWater = factory.make();
        assertEquals(water, factoryWater);
    }

    @BeforeEach
    void setUp() {
        InitParams();
        water = new WaterPokemon(name, species, maxHp, maxPp);
    }

    @RepeatedTest(25)
    void constructorTest(){
        factory = new WaterPokemonFactory();
        checkWaterConstructor(factory, water);
    }
}
