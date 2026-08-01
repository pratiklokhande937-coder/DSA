// public class majorityelement {
//     public static void main(String[]args){
//         int arr[]=new int []{2,2,3,3,1,2,2};
//         for(int i = 0;i<arr.length;i++){
//          int count = 0;
//          for(int j = 0;j < arr.length;j++){
//             if(arr[i] == arr[j]){
//                 count ++;
//             }
           
//          }
//           if(count > arr.length / 2){
//                 System.out.print(arr[i]);
//                 break;
//             }
//         }
//     }
    
// }


import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer> mp = new HashMap<>();
        // for(int i = 0;i < nums.length;i++){
        //     mp.put(nums[i],mp.getOrDefault(nums[i], 0)+1);

        // }
        // for(Map.Entry<Integer , Integer> entry : mp.entrySet()){
        //     if( entry.getValue() > nums.length / 2){
        //         return entry.getKey();
        //     }
        // }return -1;
        int cnt = 0;
        int el = 0;
        for(int i = 0;i<nums.length;i++){
            if(cnt == 0){
                cnt = 1;
                el = nums[i];
            }
            else if( nums[i] == el){
                cnt ++;
            }
            else{
                cnt --;
            }

        }int cnt1 = 0; 
        for(int i = 0;i<nums.length;i++){
          if(nums[i] == el){
            cnt1++;
          }
        
        }
          if(cnt1 > nums.length / 2){
            return el;
          }
                  return -1;

        
    }
}