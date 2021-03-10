public class quadraticsort {
    //insetion sort
    public void quadraticsort (double [] arr, int left, int right){
        for(int i = 1; i < arr.length; i++){
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
        int high = arr.length-1;
        quadraticsort sort = new quadraticsort();
        sort.quadraticsort(arr, low,high);
        System.out.println(arr);

    }
}
