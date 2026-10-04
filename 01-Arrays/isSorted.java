public class isSorted {
    public static boolean isSorted(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }


public static void main(String[] args){
    int[] arr1 = {1,2,3,4,5};
    int[] arr2 = {1,4,3,2,1};
    boolean result = isSorted(arr1);
    boolean result2 = isSorted(arr2);
    System.out.println("The array is sorted: " + result);
    System.out.println("The array is sorted: " + result2);
}
};