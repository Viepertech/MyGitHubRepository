
public class BubbleSort {
	
	// bubble Sort
	public static void bubbleSort(int [] a){
	    int n = a.length;

	    for(int i=0; i<n; i++){
	        for(int j=1; j<n-i; j++){
	            if(a[j-1] > a[j]){
	                int temp;
	                temp = a[j-1];
	                a[j-1] = a[j];
	                a[j]=temp;
	            }
	        }
	    }
	} 
	
	//Generic Bubble Sort
	 public static <T extends Comparable<T>> void display(T[] arr){
	        for (T t :arr) {
	            System.out.print(t + " ");
	        }
	        System.out.println();
	    }
	 
	 public static <T extends Comparable<T>> void genericBubbleSort(T[] arr)
	 {

		    for (int i = 0; i < arr.length; i++) {

		      for (int j = 0; j < arr.length - i - 1; j++) {

		        if (arr[j].compareTo(arr[j + 1]) > 0){

		          T tmp = arr[j];

		          arr[j] = arr[j + 1];

		          arr[j + 1] = tmp;

		        }

		      }

		    }

		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Bubble Sort
		
		int[] arr = {1,1,2,0,9,3,12,7,8,3,4,65,22};
            System.out.print("Array of Integers Before Sort: ");
	    for(int i:arr){
	        System.out.print(i+" ");
	    }
            System.out.println();
	    BubbleSort.bubbleSort(arr);
            System.out.print("Array of Integers After Sort: ");
	    for(int i:arr){
	        System.out.print(i+" ");
	    }
	    
	    System.out.println();
	    
	    // Generic Bubble Sort
		
	    Integer[] arr1 = {4,7,6,5,2,1,3};
	    System.out.print("Before Generic Sort: ");
	    display(arr1);
	    System.out.print("After Generic Sort: ");
	    genericBubbleSort(arr1);
	    display(arr1);
	    
	    Double[] arr2 = {2.35,8.65,2.10,6.22,11.2};
	    System.out.print("Before Generic Sort: ");
	    display(arr2);
	    System.out.print("After Generic Sort: ");
	    genericBubbleSort(arr2);
	    display(arr2);
	    
	    
	}

}