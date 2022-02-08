package ArrayRotation;

public class ArrayRotation {    
	 public static void main(String[] args) {    
    
	        int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};     
	        //rotation by number 5    
	        int n = 5;    
    
	        System.out.println("Original array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");     
	        }      
	            
	        //Rotate the given array by n=5    
	        for(int i = 0; i < 5; i++){    
	            int j, last;       
	            last = arr[arr.length-1];    
	            
	            for(j = arr.length-1; j > 0; j--){      
	                arr[j] = arr[j-1];    
	            }        
	            arr[0] = last;    
	        }    
	        
	        System.out.println();       
	        System.out.println("Array after right rotation: ");    
	        for(int i = 0; i< arr.length; i++){    
	            System.out.print(arr[i] + " ");    
	        }    
	    }    
	}   
