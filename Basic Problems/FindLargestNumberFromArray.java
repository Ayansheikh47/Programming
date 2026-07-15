public class FindLargestNumberFromArray {
    public static void main(String[] args) {
        int arr[] = {22,1000,11,2,3,44,4,99,700};
        int largest=arr[0];
        for (int i=1; i<arr.length; i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
