package stormtroopers;

public abstract class Stormtrooper implements Cloneable, Examineable {

    protected String id;
    protected int level;
    protected int strength;
    protected int agility;
    protected int intellect;
    protected String weapon;

    @Override
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch( CloneNotSupportedException e ) {
            e.printStackTrace();
        }

        return clone;
    }
    
    @Override
    public void accept( IStormtrooperExaminer examiner ){
    	examiner.visit( this );
    }

    @Override
    public String toString() {
        return "Level " + level + " " + getType() + " Stormtrooper";
    }

    public abstract void attack();
    
    public void changeAttribute( int attribute, int points ){
    	if( points == 0 ){
    		throw new IllegalArgumentException("'points' argument can't be zero.");
    	}
    	
    	String verb;
    	if( points > 0 ){
    		verb = "rose";
    	} else {
    		verb = "dropped";
    	}
    	
    	switch( attribute ){
    	case 1:
    		System.out.println( this.toString() + "'s strength " + verb + " from " + this.strength + " to " + (this.strength+points) );
    		this.strength += points;
    		break;
    	case 2:
    		System.out.println( this.toString() + "'s agility " + verb + " from " + this.agility + " to " + (this.agility+points) );
    		this.agility += points;
    		break;
    	case 3:
    		System.out.println( this.toString() + "'s intellect " + verb + " from " + this.intellect + " to " + (this.intellect+points) );
    		this.intellect += points;
    		break;
		default:
			throw new IllegalArgumentException("Attribute out of range. Must be 1 (str), 2 (agi) or 3 (int).");
    	}
    }
    
	public void printAttributes() {
		System.out.println( this.toString() + "'s attributes:");
		System.out.println( "\tstr: " + this.strength);
		System.out.println( "\tagi: " + this.agility);
		System.out.println( "\tint: " + this.intellect);
	}

// :: GETTERS & SETTERS ::

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getAgility() {
        return agility;
    }
    public void setAgility(int agility) {
        this.agility = agility;
    }
    public int getIntellect() {
        return intellect;
    }
    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }
    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public abstract String getType();

}
