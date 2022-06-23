package telran.arrays.tools;

import java.util.Comparator;

public class OddEvenComparator {
    public static void printArray(Integer[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("----------------------");
    }

    public static <T> void sortArray(Integer[] array, Comparator<T> comparation){
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-1-i; j++){
                if(array[j]%2!=0 && array[j+1]%2==0){
                    Integer t = array[j];
					array[j] = array[j + 1];
					array[j + 1] = t;
                }
                if(array[j]%2==0 && array[j+1]%2==0 && comparation.compare( array[j], array[j+1]) < 0){
                    Integer t = array[j];
					array[j] = array[j + 1];
					array[j + 1] = t;
                }
                if(array[j]%2!=0 && array[j+1]%2!=0 && comparation.compare(array[j], array[j+1]) > 0){
                    Integer t = array[j];
					array[j] = array[j + 1];
					array[j + 1] = t;
                }

            }

        }
    }
}
