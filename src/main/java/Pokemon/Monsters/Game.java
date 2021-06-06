package Pokemon.Monsters;// main.java.cl.uchile.dcc.pokemon.Game's main logic goes here

import java.util.*;

//////For testing battles and double dispatch only

public class Game {
    public static void main(String[] args){
        boolean playing = true;
        //While user wants to keep playing
        while (playing){
            //Create the list of different Pokemon to select
            AbstractPokemon PokemonList[] = new AbstractPokemon[3];
            PlantPokemon Bulbasaur = new PlantPokemon("Bulbasaur", "Bulbasaur", 20, 20);
            FirePokemon Charmander = new FirePokemon("Charmander","Charmander", 20, 20);
            PlantPokemon Squirtle = new PlantPokemon("Squirtle", "Squirtle", 20, 20);
            PokemonList[0] = Bulbasaur;
            PokemonList[1] = Charmander;
            PokemonList[2] = Squirtle;

            //User selects Pokemon to use
            Scanner sc = new Scanner(System.in);
            System.out.println("Select your Pokémon: 0=Bulbasaur - 1=Charmander - 2=Squirtle");
            int selection = sc.nextInt();
            while (selection < 0 || selection > 2){
                System.out.println("Please enter a valid number");
                System.out.println("Select your Pokémon: 0=Bulbasaur - 1=Charmander - 2=Squirtle");
                selection = sc.nextInt();
            }
            var Pokemon = PokemonList[selection];
            //User can name Pokemon
            System.out.println("Would you like to name your new "+ Pokemon.getName() + "? (Y/N)");
            String nameSel = sc.next();
            while (nameSel.equals("Y") || nameSel.equals("y")){
                System.out.println("Enter the new name: ");
                String name = sc.next();
                System.out.println("You sure you want to name your " + Pokemon.getName() + " " + name + "? (Y/N)");
                String nameSel2 = sc.next();
                if (nameSel2.equals("Y") || nameSel2.equals("y")) {
                    Pokemon.setName(name);
                    nameSel = "n";
                }
            }

            //Create a new instance in case user selects same opponent as user Pokemon
            switch (selection){
                default: break;
                case 0: {PokemonList[0] = new PlantPokemon("Bulbasaur", "Bulbasaur", 20, 20); break;}
                case 1: {PokemonList[1] = new FirePokemon("Charmander","Charmander", 20, 20); break;}
                case 2: {PokemonList[2] = new WaterPokemon("Squirtle", "Squirtle", 20, 20); break;}
            }

            //User selects which Pokemon to fight
            System.out.println("Select your Opponent: 0=Bulbasaur - 1=Charmander - 2=Squirtle");
            selection = sc.nextInt();
            while (selection < 0 || selection > 2){
                System.out.println("Please enter a valid number");
                System.out.println("Select your Opponent: 0=Bulbasaur - 1=Charmander - 2=Squirtle");
                selection = sc.nextInt();
            }
            var Opponent = PokemonList[selection];

            //Start battle
            System.out.println("\nA wild " + Opponent.getName() + " appeared!");
            System.out.println("Go " + Pokemon.getName() + "!");
            sc.nextLine();

            //While both Pokemon are still alive, continue battling
            while (Pokemon.isAlive()){
                System.out.println(Pokemon.getName() + " HP: " + Pokemon.getHp() + " vs " + Opponent.getName() + " HP: " + Opponent.getHp());
                //Wait for input from user to continue
                System.out.println("Press enter to attack");
                sc.nextLine();
                int damage = Pokemon.attack(Opponent);
                System.out.println(Pokemon.getName() + " attacks and deals " + damage + " damage to wild " + Opponent.getName() + "!");
                if (!Opponent.isAlive()) break;
                damage = Opponent.attack(Pokemon);
                System.out.println("Wild " + Opponent.getName() + " attacks and deals " + damage + " damage to " + Pokemon.getName() + "!");
            }

            //After one of them dies, end battle
            if (!Pokemon.isAlive()){
                System.out.println(Pokemon.getName() + " is freaking dead dude! Take better care of your pets :c");
            }
            else {
                System.out.println("Yay! You killed " + Opponent.getName() + " brutally!");
            }

            //After battle ends, ask if user wants to continue playing
            System.out.println("\nWanna play again? (Y/N)");
            String play = sc.next();
            if (!(play.equals("Y") || play.equals("y"))){
                playing = false;
            }
        }

        System.out.println("Thanks for playing!");
        //End of program
    }
}
