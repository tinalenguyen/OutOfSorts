import java.util.*;
import java.util.Random;
public class SortsTester{

    public static void main(String[] args){
  //bubblesort tests from images in class notes
      int[] test1 = new int[]{2,3,4,5,1};
      Sorts.bubbleSort(test1);
      System.out.println(Arrays.toString(test1));

      int[] test2 = new int[]{5, 1, 12, -5, 16};
      Sorts.bubbleSort(test2);
      System.out.println(Arrays.toString(test2) );

      int[] test3 = new int[]{6,1,2,3,4,5};
      Sorts.bubbleSort(test3);
      System.out.println(Arrays.toString(test3));

      int[] test4 = new int[10];
      Random rng = new Random();
      for(int i =  0; i < 10; i++ ){
        test4[i] = (rng.nextInt() % 1000);
      }
      Sorts.bubbleSort(test4);
      System.out.println("Clock seed: " + Arrays.toString(test4));


      //specified seed can be used to reproduce sequences
      int[] test5 = new int[7];
      Random rando = new Random();
      rando = new Random(201);//seed of 100 is stored.
      for(int i =  0; i < 7; i++ ){
        test5[i] = (rando.nextInt() % 100);
      }
      Sorts.bubbleSort(test5);
      System.out.println("Specified seed test: " + Arrays.toString(test5));

      int[] test6 = new int[]{0,0,5,1};
      Sorts.bubbleSort(test6);
      System.out.println(Arrays.toString(test6));
  }
}
