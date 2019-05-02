package stormtroopers;

public interface IStormtrooperExaminer {
	
	public float rate( Standard trooper );
	public float rate( Charger trooper );
	public float rate( Grenadier trooper );
	public float rate( Sniper trooper );
	
}
