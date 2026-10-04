public class missingNumber{
    static int missingNumber(int[] arr){
        int n = arr.length;
        int totalSum = 0;
        int sumShould = (n*(n+1))/2;
        for(int nums : arr){
            totalSum = totalSum + nums; 
        }
        int missingNumber = sumShould - totalSum;
        return missingNumber;
    }
public static void main(String[] args){
        int[] arr = {3,0,1,5,2};
        int result = missingNumber(arr);
        System.out.println("The missing number is: " + result);
    }
}