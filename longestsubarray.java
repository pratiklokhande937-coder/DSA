// public class longestsubarray {
//     public static void main(String [] args){
//         int arr [] = new int []{1,2,3,1,1,1,1,4,2,3};
//         int longest = 0;
//         for(int i = 0;i<arr.length;i++){
//             for(int j = i;j<arr.length;j++){
//             int sum = 0;
//             int target = 3;
//             for(int k = i;k <= j;k++){
//                 sum = sum + arr[k];
//             }
//                 if(sum == target){
//                     longest = Math.max(longest,j-i+1);
//                 }
//             }
//             }
//                     System.out.print(longest);

//         }
//     }
    

 //improved
//  public class longestsubarray {
//     public static void main(String [] args){
//         int arr [] = new int []{1,2,3,1,1,1,1,4,2,3};
//         int longest = 0;
//         for(int i = 0;i<arr.length;i++){
//             int sum = 0;
//             int target = 3;
//             for(int j = i;j<arr.length;j++){
//                 sum = sum + arr[j];
//                  if(sum == target){
//              longest = Math.max(longest,j - i + 1 );
//             }

//             }
           
//         }
//         System.out.print(longest);
//     }
// }

//better solution using hashmap
// import java.util.*;
//  public class longestsubarray {
//     public static void main(String [] args){
//         int arr [] = new int []{1,2,3,1,1,1,1,4,2,3};
//          Map<Integer,Integer> mp = new HashMap<>();
//          int sum = 0;
//          int maxlength = 0;
//          int target = 3;
//          for(int i = 0;i<arr.length;i++){
//             sum = sum + arr[i];
//             if(sum == target ){
//                 maxlength = Math.max(maxlength, i+1);
//             }
//             int rem = sum - target;
//             if(mp.containsKey(rem)){
//                 int length = i - mp.get(rem);
//             maxlength = Math.max(maxlength,length); 
//             }
//          }
//          System.out.print(maxlength);
//     }
// }

// optimized sol
import java.util.*;
 public class longestsubarray {
    public static void main(String[]args){
        int arr[] = new int []{1,2,3,1,1,1,1,3,3};
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int maxlength = 0;
        int n = arr.length;
        int target = 6;


        while(right < n){
            while(left <= right && sum > target){
                sum = sum - arr[left];
                left ++;
            }
            if(sum == target){
                maxlength = Math.max(maxlength,right - left + 1);
            }
            right++;
            if(right < n) sum = sum + arr[right];

        }
        System.out.print(maxlength);
    }
 }
