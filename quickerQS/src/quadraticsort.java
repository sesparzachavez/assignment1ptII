import java.util.Arrays;

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
        sort.quadraticsort(arr, low,high);
        System.out.println(Arrays.toString(arr));

    }
}
