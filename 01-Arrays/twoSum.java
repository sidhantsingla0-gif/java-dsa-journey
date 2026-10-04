public class twoSum{
    static int[] twoSum(int[] arr, int target) {
    int n = arr.length;
    
    for (int i = 0; i < n; i++) {
        for (int j = i+1; j < n; j++) {  // j = i+1 kyun?
            if (arr[i] + arr[j] == target) {
                return new int[]{i, j};
            }
        }
    }
    return new int[]{-1, -1}; // not found
}
    
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }   
}