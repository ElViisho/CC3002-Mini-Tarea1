package Pokemon.Monsters.factories;

public abstract class AbstractPokemonFactory implements PokemonFactory{
    protected String name = "MissingNo";
    protected String species = "MissingNo";
    protected int maxHp = 1;
    protected int maxPp = 1;

    /**
     * @param name Sets this as the name of the Pokemon that will be created
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param species Sets this as the species of the Pokemon that will be created
     */
    @Override
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * @param maxHp Sets this as the max health points the Pokemon that will be created can have
     */
    @Override
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    /**
     * @param maxPp Sets this as the max power points the Pokemon that will be created can have
     */
    @Override
    public void setMaxPp(int maxPp) {
        this.maxPp = maxPp;
    }
}
