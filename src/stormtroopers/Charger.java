package stormtroopers;

import stormtrooperExaminer.IStormtrooperExaminer;

public class Charger extends Stormtrooper {

    public Charger( String id, int level, int strength, int agility, int intellect ) {
        this.id = id;
        this.level = level;
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
        this.weapon = "machine gun";
    }
    
    @Override
    public float accept( IStormtrooperExaminer examiner ){
    	return examiner.rate( this );
    }

    @Override
    public void attack() {
        System.out.print( getType() + " trooper is attacking with its " + weapon );
        if( weapon.equals("machine gun") ) {
            System.out.println( " with extreme ferocity!" );
        } else {
            System.out.println( "!" );
        }
    }

// :: GETTERS & SETTERS ::

    @Override
    public String getType(){
        return "Charger";
    }

}
