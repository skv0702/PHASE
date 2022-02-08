package increasing.subsequent;

import java.util.ArrayList;
import java.util.List;

public class IncreasingSubsequent {
    public static void findLIS(int[] arr)
    {
        if (arr == null || arr.length == 0) {
            return;
        }
        List<List<Integer>> LIS = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            LIS.add(new ArrayList<>());
        }
        LIS.get(0).add(arr[0]);
        for (int i = 1; i < arr.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
 
                if (arr[j] < arr[i] && LIS.get(j).size() > LIS.get(i).size()) {
                    LIS.set(i, new ArrayList<>(LIS.get(j)));
                }
            } 
                        LIS.get(i).add(arr[i]);
        }
        int j = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (LIS.get(j).size() < LIS.get(i).size()) {
                j = i;
            }
        }
        System.out.print(LIS.get(j));
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15,20,15,100,70,50,46,0,16,45,75,85,40 };
        findLIS(arr);
    }
}
