package stormtrooperExaminer;

import stormtroopers.Charger;
import stormtroopers.Grenadier;
import stormtroopers.Sniper;
import stormtroopers.Standard;
import stormtroopers.Stormtrooper;

public class StormtrooperExaminer implements IStormtrooperExaminer {
	
	private float str;
	private float agi;
	private float int_;
	
	public static void printRating( Stormtrooper trooper, float rating ){
		System.out.println( trooper.toString() + " foi avaliado por um StormtrooperExaminer e recebeu " + rating );
	}

	public void getTrooperAttributes( Stormtrooper trooper ){
		this.str = trooper.getStrength();
		this.agi = trooper.getAgility();
		this.int_ = trooper.getIntellect();
	}
	
	@Override
	public float rate( Standard trooper ){
		float rating;
		this.getTrooperAttributes( trooper );
		rating = (10*(str) + 10*(agi) + 10*(int_)) / 30;
		return rating;
	}
	
	@Override
	public float rate( Charger trooper ){
		float rating;
		this.getTrooperAttributes( trooper );
		rating = (12*(str-1) + 12*(agi-1) + 6*(int_+2)) / 30;
		return rating;
	}
	
	@Override
	public float rate( Grenadier trooper ){
		float rating;
		this.getTrooperAttributes( trooper );
		rating = (12*(str-1) + 8*(agi+1) + 10*(int_)) / 30;
		return rating;
	}
	
	@Override
	public float rate( Sniper trooper ){
		float rating;
		this.getTrooperAttributes( trooper );
		rating = (8*(str+1) + 10*(agi) + 12*(int_-1)) / 30;
		return rating;
	}

}
