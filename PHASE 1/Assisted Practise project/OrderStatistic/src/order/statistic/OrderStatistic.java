package order.statistic;

public class OrderStatistic {

  static void printSmallest(int arr[])
  {
      int first, arr_size = arr.length;
      if (arr_size < 1)
      {
          System.out.println(" Invalid Input ");
          return;
      }

      first =  Integer.MAX_VALUE;
      for (int i = 0; i < arr_size ; i ++)
      {
          if (arr[i] < first)
          {
             
              first = arr[i];
          }
          else if (arr[i] < first && arr[i] != first)
              first = arr[i];
      }
      if (first == Integer.MAX_VALUE)
          System.out.println("There is no second" +
                             "smallest element");
      else
          System.out.println("The smallest element is " +
                             first );
  }
  public static void main (String[] args)
  {
      int arr[] = {150,12,14,19,25,450,85,5};
      printSmallest(arr);
  }
}