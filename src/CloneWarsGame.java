import stormtroopers.IStormtrooperExaminer;
import stormtroopers.Standard;
import stormtroopers.Charger;
import stormtroopers.Grenadier;
import stormtroopers.Sniper;
import stormtroopers.Stormtrooper;
import stormtroopers.StormtrooperExaminer;
import stormtroopers.StormtroopersRepo;

public class CloneWarsGame {

    public static void main(String[] args) {
    	
    	System.out.println( ":::\n::: Loading repo and instantiating an unit for each subclass...\n:::" );
    	
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
        
        System.out.println("\n:::\n::: Instantiating an examiner for each instantiated stormtrooper...\n:::" );
        
        IStormtrooperExaminer examiner = new StormtrooperExaminer();
        
        Standard standard = (Standard) standard_clone;
        standard.printAttributes();
        standard.accept( examiner );
        examiner.rateAndPrint();
        standard.changeAttribute( 1, +2 );
        examiner.rateAndPrint();
        standard.changeAttribute( 1, -2 );
        standard.changeAttribute( 3, +2 );
        examiner.rateAndPrint();
        System.out.println();
        
        Charger charger = (Charger) charger_clone;
        charger.printAttributes();
        charger.accept( examiner );
        examiner.rateAndPrint();
        charger.changeAttribute( 1, +2 );
        examiner.rateAndPrint();
        charger.changeAttribute( 1, -2 );
        charger.changeAttribute( 3, +2 );
        examiner.rateAndPrint();
        System.out.println();
        
        Grenadier grenadier = (Grenadier) grenadier_clone;
        grenadier.accept( examiner );
        examiner.rateAndPrint();
        grenadier.changeAttribute( 1, +2 );
        examiner.rateAndPrint();
        grenadier.changeAttribute( 1, -2 );
        grenadier.changeAttribute( 3, +2 );
        examiner.rateAndPrint();
        System.out.println();
        
        Sniper sniper = (Sniper) sniper_clone;
        sniper.accept( examiner );
        examiner.rateAndPrint();
        sniper.changeAttribute( 1, +2 );
        examiner.rateAndPrint();
        sniper.changeAttribute( 1, -2 );
        sniper.changeAttribute( 3, +2 );
        examiner.rateAndPrint();        
    }
}
