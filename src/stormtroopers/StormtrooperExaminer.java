package stormtroopers;

public class StormtrooperExaminer implements IStormtrooperExaminer {
	
	private int str;
	private int agi;
	private int int_;
	
	public void printRate( Stormtrooper trooper, float rating ){
		System.out.println( "\n" + trooper.toString() + " foi avaliado por um StormtrooperExaminer e recebeu " + rating );
	}

	public void getTrooperAttributes( Stormtrooper trooper ){
		this.str = trooper.getStrength();
		this.agi = trooper.getAgility();
		this.int_ = trooper.getIntellect();
	}
	
	@Override
	public float rate( Standard trooper ){
		float rate;
		getTrooperAttributes( trooper );
		rate = (10*str + 10*agi + 10*int_) / 30;
		return rate;
	}
	
	@Override
	public float rate( Charger trooper ){
		float rate;
		getTrooperAttributes( trooper );
		rate = (12*str + 12*agi + 6*int_) / 30;
		return rate;
	}
	
	@Override
	public float rate( Grenadier trooper ){
		float rate;
		getTrooperAttributes( trooper );
		rate = (12*str + 8*agi + 10*int_) / 30;
		return rate;
	}
	
	@Override
	public float rate( Sniper trooper ){
		float rate;
		getTrooperAttributes( trooper );
		rate = (8*str + 10*agi + 12*int_) / 30;
		return rate;
	}

}
