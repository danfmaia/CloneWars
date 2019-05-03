import stormtrooperExaminer.IStormtrooperExaminer;
import stormtrooperExaminer.StormtrooperExaminer;
import stormtroopers.Standard;
import stormtroopers.Charger;
import stormtroopers.Grenadier;
import stormtroopers.Sniper;
import stormtroopers.Stormtrooper;
import stormtroopers.StormtroopersRepo;

public class CloneWarsGame {

    public static void main(String[] args) {
    	
    	System.out.println(":::\n::: Loading repo and instantiating an unit for each subclass...\n:::");
    	
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
        
        System.out.println("\n:::\n::: Instantiating an examiner for each instantiated stormtrooper...\n:::\n");
        
        IStormtrooperExaminer examiner = new StormtrooperExaminer();
        float rating;
        
        Standard standard = (Standard) standard_clone;
        standard.printAttributes();
        rating = standard.accept( examiner );
        StormtrooperExaminer.printRating( standard , rating );
        standard.changeAttribute( 1, +2 );
        rating = standard.accept( examiner );
        StormtrooperExaminer.printRating( standard , rating );
        standard.changeAttribute( 1, -2 );
        standard.changeAttribute( 1, +1 );
        standard.changeAttribute( 3, +1 );
        rating = standard.accept( examiner );
        StormtrooperExaminer.printRating( standard , rating );
        System.out.println();
        
        Charger charger = (Charger) charger_clone;
        charger.printAttributes();
        rating = charger.accept( examiner );
        StormtrooperExaminer.printRating( charger , rating );
        charger.changeAttribute( 1, +2 );
        rating = charger.accept( examiner );
        StormtrooperExaminer.printRating( charger , rating );
        charger.changeAttribute( 1, -2 );
        charger.changeAttribute( 1, +1 );
        charger.changeAttribute( 3, +1 );
        rating = charger.accept( examiner );
        StormtrooperExaminer.printRating( charger , rating );
        System.out.println();
        
        Grenadier grenadier = (Grenadier) grenadier_clone;
        grenadier.printAttributes();
        rating = grenadier.accept( examiner );
        StormtrooperExaminer.printRating( grenadier , rating );
        grenadier.changeAttribute( 1, +2 );
        rating = grenadier.accept( examiner );
        StormtrooperExaminer.printRating( grenadier , rating );
        grenadier.changeAttribute( 1, -2 );
        grenadier.changeAttribute( 1, +1 );
        grenadier.changeAttribute( 3, +1 );
        rating = grenadier.accept( examiner );
        StormtrooperExaminer.printRating( grenadier , rating );
        System.out.println();
        
        Sniper sniper = (Sniper) sniper_clone;
        sniper.printAttributes();
        rating = sniper.accept( examiner );
        StormtrooperExaminer.printRating( sniper , rating );
        sniper.changeAttribute( 1, +2 );
        rating = sniper.accept( examiner );
        StormtrooperExaminer.printRating( sniper , rating );
        sniper.changeAttribute( 1, -2 );
        sniper.changeAttribute( 1, +1 );
        sniper.changeAttribute( 3, +1 );
        rating = sniper.accept( examiner );
        StormtrooperExaminer.printRating( sniper , rating );
        
    }
}
