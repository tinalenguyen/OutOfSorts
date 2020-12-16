import java.util.*;
public class SortsTester{

    public static void main(String[] args){
      int[] tests = new int[]{2,3,4,5,1};
      Sorts.bubbleSort(tests);
      System.out.println(Arrays.toString(tests));

      int[] test2 = new int[]{5, 1, 12, -5, 16};
      Sorts.bubbleSort(test2);
      System.out.println(Arrays.toString(test2) );

      int[] test3 = new int[]{6,1,2,3,4,5};
      Sorts.bubbleSort(test3);
      System.out.println(Arrays.toString(test3));    }


}
