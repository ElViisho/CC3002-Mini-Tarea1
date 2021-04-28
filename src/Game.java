import java.util.*;

public class Game {
    public static void main(String[] args){
        PokemonAbstract PokemonList[] = new PokemonAbstract[3];
        Plant Bulbasaur = new Plant("Bulbasaur", "Bulbasaur", 20);
        Fire Charmander = new Fire("Charmander","Charmander", 20);
        Water Squirtle = new Water("Squirtle", "Squirtle", 20);
        PokemonList[0] = Bulbasaur;
        PokemonList[1] = Charmander;
        PokemonList[2] = Squirtle;

        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona tu Pokémon: 0=Bulbasaur - 1:Charmander - 2:Squirtle");
        int selection = sc.nextInt();
        while (selection < 0 || selection > 2){
            System.out.println("Por favor ingresa un valor válido");
            System.out.println("Selecciona tu Pokémon: 0=Bulbasaur - 1:Charmander - 2:Squirtle");
            selection = sc.nextInt();
        }
        var Pokemon = PokemonList[selection];
        System.out.println("¿Quieres nombrar a tu nuevo "+ Pokemon.getName() + "? (S/N)");
        String nameSel = sc.next();
        while (nameSel.equals("S") || nameSel.equals("s")){
            System.out.println("Ingresa el nuevo nombre: ");
            String name = sc.next();
            System.out.println("Segur@ que quieres nombrar a tu " + Pokemon.getName() + " " + name + "? (S/N)");
            String nameSel2 = sc.next();
            if (nameSel2.equals("S") || nameSel2.equals("s")) {
                Pokemon.setName(name);
                nameSel = "n";
            }
        }
        System.out.println(Pokemon.getName());

    }

}
