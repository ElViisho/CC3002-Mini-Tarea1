package Pokemon.Monsters;

import Pokemon.Monsters.factories.PlantPokemonFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlantPokemonTest extends AbstractPokemonTest{
    private PlantPokemon plant;
    private PlantPokemonFactory factory;

    @Test
    void initialTest(){
        name = "El mejor starter";
        species = "Bulbasaur";
        maxHp = 20;
        maxPp = 20;

        factory = new PlantPokemonFactory();
        factory.setName(name);
        factory.setSpecies(species);
        factory.setMaxHp(maxHp);
        factory.setMaxPp(maxPp);

        plant = new PlantPokemon(name, species, maxHp, maxPp);
        var factoryPlant = factory.make();
        assertEquals(plant, factoryPlant);
    }

    @BeforeEach
    void setUp() {
        InitParams();
        plant = new PlantPokemon(name, species, maxHp, maxPp);
    }

    @RepeatedTest(25)
    void constructorTest(){
        factory = new PlantPokemonFactory();
        checkPlantConstructor(factory, plant);
    }
}
