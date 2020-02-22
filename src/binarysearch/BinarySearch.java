package binarysearch;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) throws Exception {
        boolean checking = true;
        
        //Ask if user want to continue again
        while(checking){
            BinarySearchAlgorithm ob = new BinarySearchAlgorithm(); 
            int n, x;
            Scanner in = new Scanner(System.in); 
            System.out.println("*********Binary Search*********");
            System.out.println("Please input the number of elements in the array used for searching");
            n = Integer.parseInt(in.nextLine()); 
            System.out.println("Length of Array: "+n);
            System.out.println("Please input the array elements in the ascending order");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) 
            {
                System.out.print("Enter the element of the array " + (i+1) + " : ");
                arr[i] = Integer.parseInt(in.nextLine());
            }        
            System.out.println("Please input the elements to be search");
            x = Integer.parseInt(in.nextLine());
            //Check if the array is inputed in the ascending order
            boolean isSorted = ob.isSorted(arr);
            if(isSorted)
            {
                int result = ob.BinarySearchAlgorithm(arr, x); 
                if (result == -1) 
                    System.out.println("Element not present"); 
                else
                    System.out.println("Element found at index " + (result+1));
            }
            else
                System.out.println("Please input array in the ascending order");
            
            //Check user input to continue to stop
            System.out.println("Do you want to continue to search again(y/n)?");
            String search = in.next();
            checking = search.equalsIgnoreCase("y");
        }
    }    
}
