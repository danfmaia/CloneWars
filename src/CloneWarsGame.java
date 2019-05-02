import stormtroopers.Standard;
import stormtroopers.Charger;
import stormtroopers.Grenadier;
import stormtroopers.Sniper;
import stormtroopers.Stormtrooper;
import stormtroopers.StormtrooperExaminer;
import stormtroopers.StormtroopersRepo;

public class CloneWarsGame {

    public static void main(String[] args) {
    	
    	System.out.println( "Carregando repositório e instanciando um exemplar"
    			+ " de cada subclasse...");
    	
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
        
        // INSTANCIANDO O EXAMINADOR E REALIZANDO EXAMES EM CADA EXEMPLAR DE
        // STORMTROOPER INSTANCIADO...
        
        System.out.println("\nInstanciando um examinador e realizando um exame"
        		+ " para cada stormtrooper instanciado...");
        
        StormtrooperExaminer examiner;
        float rating;
        
        Standard standard = (Standard) standard_clone;
        examiner = new StormtrooperExaminer();
        rating = standard.accept( examiner );
        examiner.printRate( standard , rating );
        
        Charger charger = (Charger) charger_clone;
        examiner = new StormtrooperExaminer();
        rating = charger.accept( examiner );
        examiner.printRate( charger , rating );
        
        Grenadier grenadier = (Grenadier) grenadier_clone;
        examiner = new StormtrooperExaminer();
        rating = grenadier.accept( examiner );
        examiner.printRate( grenadier , rating );
        
        Sniper sniper = (Sniper) sniper_clone;
        examiner = new StormtrooperExaminer();
        rating = sniper.accept( examiner );
        examiner.printRate( sniper , rating );
        
    }
}
