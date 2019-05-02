package stormtroopers;

import java.util.Hashtable;

public class StormtroopersRepo {

    private static Hashtable<String, Stormtrooper> stormtroopersRepo = new Hashtable<String, Stormtrooper>();

    public static Stormtrooper getStormtrooper( String stormtrooperId ) {
        Stormtrooper protoStormtrooper = stormtroopersRepo.get( stormtrooperId );
        return (Stormtrooper) protoStormtrooper.clone();
    }

    public static void loadRepo() {
        Stormtrooper standard = new Standard( "1", 1, 5, 5, 5 );
        stormtroopersRepo.put( standard.getId(), standard );

        Stormtrooper charger = new Charger( "2", 1, 6, 6, 3 );
        stormtroopersRepo.put( charger.getId(), charger );

        Stormtrooper grenadier = new Grenadier( "3", 1, 6, 4, 5 );
        stormtroopersRepo.put( grenadier.getId(), grenadier );

        Stormtrooper sniper = new Sniper( "4", 1, 4, 5, 6 );
        stormtroopersRepo.put( sniper.getId(), sniper );
    }
}
