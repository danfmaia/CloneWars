package stormtroopers;

public class Sniper extends Stormtrooper {

    public Sniper( String id, int level, int strength, int agility, int intellect ) {
        this.id = id;
        this.level = level;
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
        this.weapon = "sniper rifle";
    }

    @Override
    public void attack() {
        System.out.print( getType() + " trooper is attacking with its " + weapon );
        if( weapon.equals("sniper rifle") ) {
            System.out.println( " at long distance!" );
        } else {
            System.out.println( "!" );
        }
    }
    
    public float accept( StormtrooperExaminer examiner ){
    	return examiner.rate( this );
    }

// :: GETTERS & SETTERS ::

    @Override
    public String getType(){
        return "Sniper";
    }

}
