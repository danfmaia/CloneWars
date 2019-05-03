package stormtroopers;

public class StormtrooperExaminer implements IStormtrooperExaminer {
	
	Stormtrooper trooper;
	
	private float str;
	private float agi;
	private float int_;
	
	@Override
	public void visit( Stormtrooper trooper ){
		this.trooper = trooper;
		getTrooperAttributes();
	}

	private void getTrooperAttributes() {
		this.str = trooper.getStrength();
		this.agi = trooper.getAgility();
		this.int_ = trooper.getIntellect();
	}
	
	@Override
	public float rate() {
		float rating;
		getTrooperAttributes();
				
		switch( trooper.getType() ){
		case "Standard":
			rating = (10*(str) + 10*(agi) + 10*(int_)) / 30;
			break;
		case "Charger":
			rating = (12*(str-1) + 12*(agi-1) + 6*(int_+2)) / 30;
			break;
		case "Grenadier":
			rating = (12*(str-1) + 8*(agi+1) + 10*(int_)) / 30;
			break;
		case "Sniper":
			rating = (8*(str+1) + 10*(agi) + 12*(int_-1)) / 30;
			break;
		default:
			throw new IllegalStateException("Stormtrooper type not included in rate() method.");
		}
		
		return rating;
	}
	@Override
	public void rateAndPrint() {
		float rating = this.rate();
		System.out.println( trooper.toString() + " was rated by a StormtrooperExaminer and received " + rating );
	}

}
