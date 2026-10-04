static int largestElement(int[] arr){
    int max = arr[0];
    for(int nums : arr){
        if(nums > max){
            max = nums;
        }
    }
    return max;
}

public static void main(String[] args) {
    int[] arr = {1, 9, 3, 4, 5};
    int result = largestElement(arr);
    System.out.println("The largest element is: " + result);
}