
import java.util.*;
public class Data {
	
	
	
	private static Random rand = new Random(0);
	
	/**
	 * 
	 * @return returns a Map object with 2 entries: a list containing all the integers 
	 * 		and a set containing integers to find in the list
	 */
	
	public static Map<String, ArrayList<ArrayList<Integer>>> getIntegers(){	
		
		int rows = 7;	
		int columns = 20;
		
		int highestNumber = 10000;
		// The map object to be returned
		Map<String, ArrayList<ArrayList<Integer>>> returnObj = new HashMap<>();	
		
		// A list to contain all the elements
		ArrayList<ArrayList<Integer>> integer2DList = new ArrayList<ArrayList<Integer>>();		
		
		ArrayList<ArrayList<Integer>> elementsToFindList = new ArrayList<ArrayList<Integer>>();
		
		int currentRow = 1;
		
		while (integer2DList.size() < rows ) {
			
			HashSet<Integer> tempSet = new HashSet<Integer>();
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			while(tempSet.size() < columns) {
				
				int min = highestNumber / rows * (currentRow - 1);
				int max = highestNumber / rows * currentRow;
				
				tempSet.add(rand.nextInt(max - min) + min);				
			}
			
			list.addAll(tempSet);
			Collections.sort(list);
			integer2DList.add(list);
			
			currentRow++;				
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		
		for(int i = 0; i < rows; i++) {	
			
			list.add(integer2DList.get(i).get(rand.nextInt(columns)));
		}
		
		for(int i = 0; i < 3; i++)
			list.add(rand.nextInt(highestNumber));
		
		Collections.sort(list);
		elementsToFindList.add(list);
		
		returnObj.put("list", integer2DList);
		returnObj.put("set", elementsToFindList);
		
		return returnObj;
	}
	
	
	
	/**
	 * 
	 * @return returns a Map object with 2 entries: a list containing all the countries 
	 * 		and a set containing countries to find in the list
	 */
	public static Map<String, ArrayList<ArrayList<String>>> getCountries(){
		
		int rows = 7;
		int columns = 30;
		
		Map<String, ArrayList<ArrayList<String>>> returnObj = new HashMap<>();
		
		// Get the country codes
		String[] countryCodes = Locale.getISOCountries();
		
		
		// A list to contain all the country names
		ArrayList<String> countryList = new ArrayList<String>();
		
		// A list to contain all the elements
		ArrayList<ArrayList<String>> country2DList = new ArrayList<ArrayList<String>>();
		
		// A list of countries to find
		ArrayList<ArrayList<String>> countiresToFind = new ArrayList<ArrayList<String>>();
		
		
		
		// Insert the name of the countries in the ArrayList
		for(String code: countryCodes) {			
			Locale country = new Locale("", code);
			countryList.add(country.getDisplayCountry());			
		}
		
		//Sort the list of countries
		Collections.sort(countryList);
		
		
		// Insert countries in the 2D array list
		int startingIndex = rand.nextInt(countryList.size() - (rows * columns)) - 1;
		
		int indexToJump1 = rows * columns / 2;
		int indexToJump2 = rows * columns / 7;
		int indexToJump3 = rows * columns % 7;
		
		for(int i= 0; i < rows; i++) {
			
			ArrayList<String> tempList = new ArrayList<String>();
			
			for(int j = 0; j < columns; j++) {
				
				if(startingIndex == indexToJump1 || startingIndex == indexToJump2 || startingIndex == indexToJump2)
					j--;
				else	
					tempList.add(countryList.get(startingIndex));				
				
				startingIndex++;				
			}
			
			country2DList.add(tempList);
		}
		
		
		// A list to contain all the country names
		ArrayList<String> tempList = new ArrayList<String>();
		
		
		for(int i = 0; i < rows; i++) {		
			
			tempList.add(country2DList.get(i).get(rand.nextInt(columns)));
		}		
		
		tempList.add(countryList.get(indexToJump1));
		tempList.add(countryList.get(indexToJump2));
		tempList.add(countryList.get(indexToJump3));
		
		Collections.shuffle(tempList, rand);
		
		countiresToFind.add(tempList);
		
		returnObj.put("list", country2DList);
		returnObj.put("set", countiresToFind);
		
		return returnObj;
	}	

}
