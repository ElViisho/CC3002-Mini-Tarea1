package Pokemon.Items;

import Pokemon.Monsters.FirePokemon;
import Pokemon.Monsters.PlantPokemon;
import Pokemon.Monsters.WaterPokemon;
import Pokemon.Monsters.factories.FirePokemonFactory;
import Pokemon.Monsters.factories.PlantPokemonFactory;
import Pokemon.Monsters.factories.WaterPokemonFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static java.lang.Math.min;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RestorePokemonTest {
    private PlantPokemon plantPoke;
    private FirePokemon firePoke;
    private WaterPokemon waterPoke;
    private Potion potion;
    private Ether ether;
    private SuperPotion superPotion;
    private FullRestore fullRestore;

    private int seed;
    protected Random rng;
    private int newHp;
    private int newPp;

    PlantPokemonFactory PlantFactory;

    @BeforeEach
    void setUp(){
        seed = new Random().nextInt();
        rng = new Random(seed);
        PlantFactory = new PlantPokemonFactory();
        PlantFactory.setSpecies("Budew");
    }

    @RepeatedTest(25)
    void PotionTest(){
        PlantFactory.setMaxHp(rng.nextInt(30) + 10);
        plantPoke = PlantFactory.make();

        newHp = rng.nextInt(40);
        plantPoke.setHp(newHp);

        potion = new Potion();
        potion.use(plantPoke);

        assertEquals(min(newHp + 20, plantPoke.getMaxHp()), plantPoke.getHp());
    }

    @RepeatedTest(25)
    void EtherTest(){
        var FireFactory = new FirePokemonFactory();
        FireFactory.setSpecies("Magby");
        FireFactory.setMaxPp(rng.nextInt(20) + 10);
        firePoke = FireFactory.make();

        newPp = rng.nextInt(30);
        firePoke.setPp(newPp);

        ether = new Ether();
        ether.use(firePoke);

        assertEquals(min(newPp + 10, firePoke.getMaxPp()), firePoke.getPp());
    }

    @RepeatedTest(25)
    void SuperPotionTest(){
        var WaterFactory = new WaterPokemonFactory();
        WaterFactory.setSpecies("Mantyke");
        WaterFactory.setMaxHp(rng.nextInt(50) + 80);
        waterPoke = WaterFactory.make();

        newHp = rng.nextInt(60) + 60;
        waterPoke.setHp(newHp);

        superPotion = new SuperPotion();
        superPotion.use(waterPoke);

        assertEquals(min(newHp + 60, waterPoke.getMaxHp()), waterPoke.getHp());
    }

    @RepeatedTest(25)
    void FullRestoreTest(){
        PlantFactory.setMaxHp(rng.nextInt(30) + 230);
        PlantFactory.setMaxPp(rng.nextInt(20) + 20);
        plantPoke = PlantFactory.make();

        newHp = rng.nextInt(30) + 230;
        newPp = rng.nextInt(20) + 20;

        plantPoke.setHp(newHp);
        plantPoke.setPp(newPp);

        fullRestore = new FullRestore();
        fullRestore.use(plantPoke);

        assertEquals(plantPoke.getMaxHp(), plantPoke.getHp());
        assertEquals(plantPoke.getMaxPp(), plantPoke.getPp());
    }
}
