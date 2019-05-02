package stormtroopers;

public abstract class Stormtrooper implements Cloneable {

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
    public String toString() {
        return "Level " + level + " " + getType() + " Stormtrooper";
    }

    public abstract void attack();

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
