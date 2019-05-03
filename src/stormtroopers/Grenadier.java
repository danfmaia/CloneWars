package stormtroopers;

public class Grenadier extends Stormtrooper {

    public Grenadier( String id, int level, int strength, int agility, int intellect ) {
        this.id = id;
        this.level = level;
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
        this.weapon = "grenade launcher";
    }

    @Override
    public void attack() {
        System.out.print( getType() + " trooper is attacking with its " + weapon );
        if( weapon.equals("grenade launcher") ) {
            System.out.println( "! BOOOOOOM!!!" );
        } else {
            System.out.println( "!" );
        }
    }
    
// :: GETTERS & SETTERS ::

    @Override
    public String getType(){
        return "Grenadier";
    }

}
