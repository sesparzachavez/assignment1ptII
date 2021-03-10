import java.util.Arrays;
import java.util.Random;

public class hybridsort {
    public void hybridsort (double [] arr, int low, int high){
        if(low < high){
            if(high - low > 20){
                int pivot = partition(arr, low, high);
                hybridsort(arr, low, pivot);
                hybridsort(arr,pivot+1, high);
            }else{
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
        }
    }
    public static int partition(double[] arr, int low, int high){
        // double pivot = arr[low];
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

    public static void main(String args[]){
        double[] arr;
        arr = new double[] {10,16,8,12,15,6,3,9,5,17};
        int low = 0;
        int high = arr.length;
        hybridsort sort = new hybridsort();
        sort.hybridsort(arr, low, high);

        System.out.println(Arrays.toString(arr));
    }
}

