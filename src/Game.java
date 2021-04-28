public class Game {
    public static void main(String[] args){
        Planta planta = new Planta("volbasor", "Bulbasaur", 20);
        Fuego fuego = new Fuego("sharly","Charmander", 20);
        Agua agua = new Agua("escuart", "Squirtle", 20);

        int damage = planta.pelea(fuego);
        fuego.setVida(damage);
        System.out.println(fuego.getVida());

        damage = fuego.pelea(agua);
        agua.setVida(damage);
        System.out.println(agua.getVida());

        damage = agua.pelea(planta);
        planta.setVida(damage);
        System.out.println(planta.getVida());
    }

}
