public class ArrayMissing {
    public static void main(String[] args) {
        int []arr={1,2,4,5};
        int arr_sum=0;
        for(int i=0;i<arr.length;i++){
            arr_sum= arr_sum+arr[i];
        }
        System.out.println(arr_sum);
        int n=arr.length+1;
        n=n*(n+1)/2;
        System.out.println(n);
        int mis_value=n-arr_sum;
        System.out.println(mis_value);
    }
    
}
