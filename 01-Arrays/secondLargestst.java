static int secondLargestst(int[] arr) {
    int max = arr[0];
    int secondMax = Integer.MIN_VALUE;    // Blank 1: kya initialize karein?
    
    for (int num : arr) {
        if (num > max) {
            secondMax = max;    // Blank 2
            max = num;        // Blank 3
        }
        else if (num > secondMax) {
            secondMax = num;  // Blank 4
        }
    }
    return secondMax;
}

public static void main(String[] args) {
    int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
    int result = secondLargestst(arr);
    System.out.println(result);
}