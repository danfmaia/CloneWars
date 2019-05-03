package stormtrooperExaminer;

import stormtroopers.Charger;
import stormtroopers.Grenadier;
import stormtroopers.Sniper;
import stormtroopers.Standard;

public interface IStormtrooperExaminer {
	
	public float rate( Standard trooper );
	public float rate( Charger trooper );
	public float rate( Grenadier trooper );
	public float rate( Sniper trooper );
	
}
