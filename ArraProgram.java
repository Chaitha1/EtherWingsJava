package basicjava;

public class ArraProgram {

	public static void main(String[] args) {
		int [] myArray=new int[14];
		
		for(int i=5;i<myArray.length;i++) {
			myArray[i]=i+1;
		}
		System.out.println("The Array Elements Are");
		for(int i =5; i<myArray.length;i++) {
			System.out.println("Element at index"+i+":"+myArray[i]);
		}
		

	}

}
