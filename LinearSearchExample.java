package basic_programs;

import java.util.Scanner;

public class LinearSearchExample{    
public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[])
    {    
    	Scanner in = new Scanner(System.in);
    	
    	int size,c,flag;    
        int key ;  
        System.out.println("Enter number of elements");
        size=in.nextInt();
        int[] a1 = new int[size];
        System.out.println("Enter " + size + " integers");
        
        for (c = 0; c < size; c++)
          a1[c] = in.nextInt();
        System.out.println("Enter value to find");
        key = in.nextInt();
        flag =linearSearch(a1, key);
        if(flag>=0)
        System.out.println(key+" is found at index: "+flag);
        else
        System.out.println(key + " isn't present in the array.\n");
    }    
}    
