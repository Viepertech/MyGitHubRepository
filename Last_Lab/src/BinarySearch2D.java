
import java.util.*;

public class BinarySearch2D {
	
	
	public static void main(String[] args) {
		
		// Get the integers map object
		Map<String, ArrayList<ArrayList<Integer>>> getIntegers = Data.getIntegers();
		
		// Get the list of integers
		ArrayList<ArrayList<Integer>> integer2DList = getIntegers.get("list");
		
		// A list containing to contain all the integers to find
		ArrayList<Integer> integersToFind = getIntegers.get("set").get(0);	
		
		
		// Get the countries map object
		Map<String, ArrayList<ArrayList<String>>> getCountries = Data.getCountries();
		
		// Get the list of all countries
		ArrayList<ArrayList<String>> countries2DList = getCountries.get("list");
		
		// Get the list of countries to find
		ArrayList<String> countriesToFind = getCountries.get("set").get(0);	
		
		
		
		System.out.println("Search Integers:\n");
                int highestIndexIntegers = integer2DList.size() * integer2DList.get(0).size();
		
		for(int i : integersToFind) {
			
			// Your code here to print a line of whether an integer was found or not
			// using the binarySearchOn2DList method
			int highestIndexIntegers1 = integer2DList.size() * integer2DList.get(0).size();
			for(int i1 : integersToFind) {
				int[] indices = binarySearchOn2DList(integer2DList, i1, 0, highestIndexIntegers1 - 1);
				
				if(indices[0] < 0) {
					System.out.println("The integer " + i1 + " was not found in the list");
				}
				else {
					System.out.println("The integer " + i1 + " was found at indices " + Arrays.toString(indices));
				}
			}
				
		}
		
		
		
		System.out.println("\n==========================================================");
		
		System.out.println("Search for Countries:\n");
                int highestIndexCountries = countries2DList.size() * countries2DList.get(0).size();
                
		
		for(String country : countriesToFind) {
			
			// Your code here to print a line of whether a country was found or not
			// using the binarySearchOn2DList method
				int[] indices = binarySearchOn2DList(countries2DList, country, 0, highestIndexCountries - 1);
				if(indices[0] < 0) {
					System.out.println("The country " + country + " was not found in the list");
				}
				else {
					System.out.println("The country " + country + " was found at indices " + Arrays.toString(indices));
				}
		}}

         /**
	 * 
	 * This method perform binary search on a 2D ArrayList.
	 * Because the rows are sorted and the last element of the previous row is less then the 
	 * element of the current, we can think of the 2D array as a flattened 1D array. 
	 * The rest does binary search by determining the the row and column of the current middle element
	 * in the sub array. 
	 * 
	 * @param <E> the generic type of the method
	 * @param list The list to in which to search
	 * @param value the value to search
	 * @param low the leftmost index of the sub-array
	 * @param high the rightmost index of the sub-array 
	 * @return returns the index of the element if found. returns -1 if the index was not found
	 */
	public static <E extends Comparable<E>> int[] binarySearchOn2DList(ArrayList<ArrayList<E>> list, E value, int low, int high) {
		
		if(list.size() == 0)
			return new int[] {-1, -1};
		
		int columnLength = list.get(0).size();		
		
		if(low <= high) {
			
			int mid = low + (high - low) / 2;
			
			int row = mid / columnLength;
			int column = mid % columnLength;
			
			if(list.get(row).get(column).equals(value))				
				return new int[] {row, column};
			
			else if (list.get(row).get(column).compareTo(value) > 0)
				return binarySearchOn2DList(list, value, low, mid - 1);
			else
				return binarySearchOn2DList(list, value, mid + 1, high);
		}	
		
		return new int[] {-1, -1};
	}
		
	
		
	
}