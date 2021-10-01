
public interface Matchable 
{

	public combinedMatches (firstData, secondData);
	
	public commonMatches(firstData, secondData);
	
	public onlyFirst(firstData, secondData);
	
	public onlyFirst (firstData, secondData, element);
	
	public int cardinality (data);
	
	public boolean equalMatches(firstData, secondData);
	
	public boolean nonMatches(firstData, secondData)
	
}
