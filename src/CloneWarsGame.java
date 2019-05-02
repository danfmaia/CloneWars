import stormtroopers.Stormtrooper;
import stormtroopers.StormtroopersRepo;

public class CloneWarsGame {

    public static void main(String[] args) {
        StormtroopersRepo.loadRepo();

        // Instancia um novo Stormtrooper padrão usando o método clone em vez da cláusula new.
        Stormtrooper standard_clone = (Stormtrooper) StormtroopersRepo.getStormtrooper( "1" );
        System.out.println( "\nEnemy: " + standard_clone );
        standard_clone.attack(); // O Stormtrooper padrão já pode atacar pois o objeto já veio completo!

        // Instancia um novo Charger à mesma maneira.
        Stormtrooper charger_clone = (Stormtrooper) StormtroopersRepo.getStormtrooper( "2" );
        System.out.println( "\nEnemy: " + charger_clone );
        charger_clone.attack();

        // Instancia um novo Grenadier à mesma maneira.
        Stormtrooper grenadier_clone = (Stormtrooper) StormtroopersRepo.getStormtrooper( "3" );
        System.out.println( "\nEnemy: " + grenadier_clone );
        grenadier_clone.attack();

        // Instancia um novo Sniper à mesma maneira.
        Stormtrooper sniper_clone = (Stormtrooper) StormtroopersRepo.getStormtrooper( "4" );
        System.out.println( "\nEnemy: " + sniper_clone );
        sniper_clone.attack();
    }

}
