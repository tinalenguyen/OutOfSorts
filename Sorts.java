public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int temp = 0 ;
     for (int i = data.length  ; i > 0 ; i--){

          for (int j = 1 ; j < i ; j++){
            if (data[j-1] > data[j] ){
              //larger
              temp = data[j-1];
              data[j-1] = data[j] ;
              data[j] = temp ;
            }

          }
      }
  }

  public static void selectionSort(int[] data){
    int origin = 0;

    for (int i = 0; i <= data.length ; i++){
      for (int j = i; j < data.length; j++){
        if (data[i] > data[j]){
            origin = data[i];
            data[i] = data[j];
            data[j] = origin;
        }
      }
    }
  }

  public static void insertionSort(int[] data){
    int saver = 0;

    for (int i = 1 ; i < data.length; i++ ){
        saver = data[i];
      for (int j = 0 ; j < i ; j++){

          if (saver < data[j]){
            for (int g = i-1 ; g > j ; g--){
            data[g+1] = data[g];
            }
            data[j] = saver;
            break;
          }

        }


    }
  }
}
