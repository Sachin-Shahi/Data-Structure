package Sorting;

/**
 * Created by DAGR8DON on 12/11/16.
 */
public class Insertion {
    public static void main(String[] args) {

        int [] array = new int[]{10,7,11,8,1,6,5,4};
        for(int i=0; i<array.length; i++){
            int temp = array[i];
            int j ;
            for(j=i-1; j>=0&&temp<array[j]; j--){
                array[j+1] = array[j];
            }
            array[j+1] = temp;
        }

        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
