//Ryan Nickens
import java.util.stream.*;
import java.util.Arrays;

public class GroceryList {
    private String[] arr;

    public GroceryList() {
        // our grocery list will have a max size of 10
        this.arr = new String[10]; 
    }

    //adding item to the grocery list
    public void add(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = item;
                break;
            }
        }
    }
   
    public void remove(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                arr[i] = null;
                break;
            }
        }

    }
    public String toString() {
        String x = Arrays.toString(arr);
        //System.out.println(Arrays.toString(arr));
        //System.out.println(x);
        return x;
    }
    


    //if (arr[i] == null); checks to see if value in array is null
    //if (arr[i] == null); next line arr[i+1] = arr[i]
    
}