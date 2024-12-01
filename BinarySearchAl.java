import java.util.*;

class Binary {
    public int binarysearch(int arr[], int tar) {
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==tar){
                return mid;
            }
            if(arr[mid]<tar){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}

public class BinarySearchAl {
    public static void main(String[] ar) {
        Binary obj = new Binary();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();/*  */
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        int result = obj.binarysearch(arr, tar);
        System.out.println(result);
        // sc.close();
    }
}
