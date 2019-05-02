package stormtroopers;

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
    public void attack() {
        System.out.print( getType() + " trooper is attacking with its " + weapon );
        if( weapon.equals("machine gun") ) {
            System.out.println( " with extreme ferocity!" );
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
        return "Charger";
    }

}
