import java.util.Arrays;
import java.util.Random;

public class randomized {
    public randomized() {
    }

    /**
     * this version of quickort picks a random pivot
     * @param arr
     * @param low
     * @param high
     */

    public static void randomized(double [] arr, int low, int high){
        if(low < high){
            int j = partition(arr, low,high);
            randomized(arr,low, j-1);
            randomized(arr, j+1, high);
        }
    }

    public static int partition(double[] arr, int low, int high){
        Random rnd = new Random();
        double pivot = arr[low + rnd.nextInt(high - low)];
        int i = low+1;
        int j = high;

        while(i<=j){
            while((i <= high) && (arr[i] <= pivot)){
                i++;
            }
            while(j > low && arr[j] > pivot ){
                j--;
            }
            if(i>=j)
                break;
            swap(arr, i, j);
        }
        swap(arr,low, j);

        return j;
    }

    public static void swap(double[] arr, int i, int j ){
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        double[] arr;
        arr = new double[] {10,16,8,12,15,6,3,9,5};

        int low = 0;
        int high = arr.length-1;
        System.out.println("Array before randomized quick sort: "+ Arrays.toString(arr));
        long start = System.currentTimeMillis();
        randomized(arr, low,high);
        long end = System.currentTimeMillis();
        System.out.println("Array after sorting: "+Arrays.toString(arr));

        System.out.println("Run time: "+(end -start)+" ms");

    }


}

