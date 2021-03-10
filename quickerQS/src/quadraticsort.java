import java.util.Arrays;
import java.util.Random;

public class quadraticsort {
    //the quadratic sorting method I chose to implement was insertion sort
    //it is the overall better quadratic sorting method with a low run time average
    public void quadraticsort (double [] arr, int low, int high){
        for(int i = low+1; i < high; i++){
            double temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = temp;
        }

    }
    public static void main(String[] args){
        double[] arr;
        arr = new double[] {10,16,8,12,15,6,3,9,5};

        int low = 0;
        int high = arr.length;
        quadraticsort sort = new quadraticsort();

        System.out.println("Array before quadratic sort: "+ Arrays.toString(arr));
        long start = System.currentTimeMillis();

        sort.quadraticsort(arr, low,high);

        long end = System.currentTimeMillis();
        System.out.println("Array after sorting: "+Arrays.toString(arr));

        System.out.println("Run time: "+(end -start)+" ms");
       // System.out.println(Arrays.toString(arr));

    }
}
