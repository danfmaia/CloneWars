package stormtroopers;

public interface IStormtrooperExaminer {
	
	public void visit( Stormtrooper trooper );
	
	public float rate();
	public void rateAndPrint();
	
}
