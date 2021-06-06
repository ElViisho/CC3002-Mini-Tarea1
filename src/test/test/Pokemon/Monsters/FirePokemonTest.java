package Pokemon.Monsters;

import Pokemon.Monsters.factories.FirePokemonFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirePokemonTest extends AbstractPokemonTest{
    private FirePokemon fire;
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

        fire = new FirePokemon(name, species, maxHp, maxPp);
        var factoryFire = factory.make();
        assertEquals(fire, factoryFire);
    }

    @BeforeEach
    void setUp() {
        InitParams();
        fire = new FirePokemon(name, species, maxHp, maxPp);
    }

    @RepeatedTest(25)
    void constructorTest(){
        factory = new FirePokemonFactory();
        checkFireConstructor(factory, fire);
    }
}