// class twosum{
//     public static void main(String[]args){
//         int arr[] = new int[]{1,2,3,4,5};
//         int target = 9;
//         for(int i = 0;i< arr.length;i++){
//             for(int j = i+1;j < arr.length;j++){
//                 // if( i  == j){
//                 //     continue;
//                 // }
//                 if(arr[i] + arr[j] == target){
//                     System.out.print(arr[i] + " " + arr[j]);
//                 }
//             }
//         }
//     }
// }

//optimal sol
import java.util.*;
import java.util.Arrays;
class twosum{
    public static void main(String[]args){
        int arr[] = new int[]{2,5,6,8,11};
        int left = 0;
        int right = arr.length - 1;
        int target = 14;
        Arrays.sort(arr);
        boolean found = false;
        //for(int i = 0;i< arr.length;i++);
         while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.out.print(arr[left] + " " + arr[right]);
                found = true;
                break;
            }else if(sum < target){
                left ++;
            }else{
                right --;
            }
         }
         if(!found){
         System.out.print("no");
         }
    }
}