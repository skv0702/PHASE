package SingleDimession;

public class SingleDimession {
    public static void main(String[] args) 
    {
        // Declaration of Array
        int[] number;
        
      
        number =  new int[10];
        
        // Initialization of Array
        number[0] = 11;
        number[1] = 22;
        number[2] = 33;
        number[3] = 44;
        number[4] = 55;
        number[5] = 66;
        number[6] = 77;
        number[7] = 88;
        number[8] = 99;
        number[9] = 100;
        
        //Print the values from Array
        for(int i = 0; i < number.length; i++)
            System.out.println(number[i]);
        
     }
}
