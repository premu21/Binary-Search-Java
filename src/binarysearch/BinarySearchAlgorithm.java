package binarysearch;

public class BinarySearchAlgorithm 
{ 
    // Returns index of x if it is present in arr[], else return -1 
    int BinarySearchAlgorithm(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        
        //The search element is the first element
        if(arr[0]==x)
            return 0;
        
        //If first element is not the required element, we will loop through
        while (l <= r) { 
            int m = l + (r - l) / 2;
            // Check if x is present at mid 
            if (arr[m] == x) 
                return m; 
            // If x greater, ignore left half 
            if (arr[m] < x) 
                l = m + 1; 
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
        // if we have reach here, then element was not present 
        return -1; 
    }
    
    public boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                // Array not sorted
                return false; 
            }
        }
        return true;
    }
} 
