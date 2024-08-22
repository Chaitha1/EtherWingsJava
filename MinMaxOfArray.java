package basicjava;
// TO find Minimum and Maximum
public class MinMaxOfArray {

	public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, 1, 4};

        // Check if the array is not empty
        if (array.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        else {
        	System.out.println("Array is not Empty");
        }

        // Initialize max and min with the first element of the array
        int max = array[0];
        int min = array[0];

        // Traverse through the array
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Print the results
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);


	}

}
