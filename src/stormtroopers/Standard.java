package stormtroopers;

public class Standard extends Stormtrooper {

    public Standard( String id, int level, int strength, int agility, int intellect ) {
        this.id = id;
        this.level = level;
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
        this.weapon = "pistol";
    }

    @Override
    public void attack() {
        System.out.println( getType() + " trooper is attacking with its " + weapon + "!" );
    }
    
    public float accept( StormtrooperExaminer examiner ){
    	return examiner.rate( this );
    }

// :: GETTERS & SETTERS ::

    @Override
    public String getType(){
        return "Standard";
    }

}
