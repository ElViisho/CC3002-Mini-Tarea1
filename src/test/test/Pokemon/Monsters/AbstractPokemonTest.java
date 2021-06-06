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
    private int strSize;
    protected Random rng;

    protected void InitParams(){
        seed = new Random().nextInt();
        rng = new Random(seed);
        strSize = rng.nextInt(20);
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

        String differentName;
        do {
            strSize = rng.nextInt(20);
            differentName = randomAlphanumeric(strSize);
        } while (differentName.equals(name));
        setUpFactory(factory, differentName, species, maxHp, maxPp);
        newPoke = factory.make();
        assertNotEquals(pokemon, newPoke);

        String differentSpecies;
        do {
            strSize = rng.nextInt(20);
            differentSpecies = randomAlphanumeric(strSize);
        } while (differentSpecies.equals(name));
        setUpFactory(factory, name, differentSpecies, maxHp, maxPp);
        newPoke = factory.make();
        assertNotEquals(pokemon, newPoke);

        int differentHp;
        do {
            differentHp = rng.nextInt();
        } while (differentHp == maxHp);
        setUpFactory(factory, name, species, differentHp, maxPp);
        newPoke = factory.make();
        assertNotEquals(pokemon, newPoke);

        int differentPp;
        do {
            differentPp = rng.nextInt();
        } while (differentPp == maxPp);
        setUpFactory(factory, name, species, maxHp, differentPp);
        newPoke = factory.make();
        assertNotEquals(pokemon, newPoke);
    }

    public void checkWaterConstructor(WaterPokemonFactory factory, WaterPokemon pokemon){
        setUpFactory(factory, name, species, maxHp, maxPp);
        WaterPokemon newPoke = factory.make();
        assertEquals(pokemon, newPoke);
        assertEquals(pokemon.hashCode(), newPoke.hashCode());

        String differentName;
        do {
            strSize = rng.nextInt(20);
            differentName = randomAlphanumeric(strSize);
        } while (differentName.equals(name));
        setUpFactory(factory, differentName, species, maxHp, maxPp);
        newPoke = factory.make();
        assertNotEquals(pokemon, newPoke);

        String differentSpecies;
        do {
            strSize = rng.nextInt(20);
            differentSpecies = randomAlphanumeric(strSize);
        } while (differentSpecies.equals(name));
        setUpFactory(factory, name, differentSpecies, maxHp, maxPp);
        newPoke = factory.make();
        assertNotEquals(pokemon, newPoke);

        int differentHp;
        do {
            differentHp = rng.nextInt();
        } while (differentHp == maxHp);
        setUpFactory(factory, name, species, differentHp, maxPp);
        newPoke = factory.make();
        assertNotEquals(pokemon, newPoke);

        int differentPp;
        do {
            differentPp = rng.nextInt();
        } while (differentPp == maxPp);
        setUpFactory(factory, name, species, maxHp, differentPp);
        newPoke = factory.make();
        assertNotEquals(pokemon, newPoke);
    }

    public void checkPlantConstructor(PlantPokemonFactory factory, PlantPokemon pokemon){
        setUpFactory(factory, name, species, maxHp, maxPp);
        PlantPokemon newPoke = factory.make();
        assertEquals(pokemon, newPoke);
        assertEquals(pokemon.hashCode(), newPoke.hashCode());

        String differentName;
        do {
            strSize = rng.nextInt(20);
            differentName = randomAlphanumeric(strSize);
        } while (differentName.equals(name));
        setUpFactory(factory, differentName, species, maxHp, maxPp);
        newPoke = factory.make();
        assertNotEquals(pokemon, newPoke);

        String differentSpecies;
        do {
            strSize = rng.nextInt(20);
            differentSpecies = randomAlphanumeric(strSize);
        } while (differentSpecies.equals(name));
        setUpFactory(factory, name, differentSpecies, maxHp, maxPp);
        newPoke = factory.make();
        assertNotEquals(pokemon, newPoke);

        int differentHp;
        do {
            differentHp = rng.nextInt();
        } while (differentHp == maxHp);
        setUpFactory(factory, name, species, differentHp, maxPp);
        newPoke = factory.make();
        assertNotEquals(pokemon, newPoke);

        int differentPp;
        do {
            differentPp = rng.nextInt();
        } while (differentPp == maxPp);
        setUpFactory(factory, name, species, maxHp, differentPp);
        newPoke = factory.make();
        assertNotEquals(pokemon, newPoke);
    }

    private void setUpFactory(AbstractPokemonFactory factory, String name, String species, int maxHp, int maxPp){
        factory.setName(name);
        factory.setSpecies(species);
        factory.setMaxHp(maxHp);
        factory.setMaxPp(maxPp);
    }

    protected PlantPokemon createPlant(){
        var PlantFactory = new PlantPokemonFactory();
        PlantFactory.setName("Jaime");
        PlantFactory.setSpecies("Bulbasaur");
        PlantFactory.setMaxHp(rng.nextInt(50));
        PlantFactory.setMaxPp(rng.nextInt(50));

        return PlantFactory.make();
    }

    protected FirePokemon createFire(){
        var FireFactory = new FirePokemonFactory();
        FireFactory.setName("Charlie");
        FireFactory.setSpecies("Charmander");
        FireFactory.setMaxHp(rng.nextInt(50));
        FireFactory.setMaxPp(rng.nextInt(50));

        return FireFactory.make();
    }

    protected WaterPokemon createWater(){
        var WaterFactory = new WaterPokemonFactory();
        WaterFactory.setName("Tortuguita");
        WaterFactory.setSpecies("Squirtle");
        WaterFactory.setMaxHp(rng.nextInt(50));
        WaterFactory.setMaxPp(rng.nextInt(50));

        return WaterFactory.make();
    }

    protected void checkHp(AbstractPokemon pokemon){
        pokemon.setHp(0);
        assertFalse(pokemon.isAlive());
        pokemon.setHp(maxHp + 100);
        assertEquals(pokemon.getMaxHp(), pokemon.getHp());
        assertTrue(pokemon.isAlive());
    }

}