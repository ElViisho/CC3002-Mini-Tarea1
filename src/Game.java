public class Game {
    public static void main(String[] args){
        Plant plant = new Plant("volbasor", "Bulbasaur", 20);
        Fire fire = new Fire("sharly","Charmander", 20);
        Water water = new Water("escuart", "Squirtle", 20);

        plant.attack(fire);
        System.out.println(fire.getLife());

        fire.attack(water);
        System.out.println(water.getLife());

        water.attack(plant);
        System.out.println(plant.getLife());
    }

}
