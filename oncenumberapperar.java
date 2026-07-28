// public class oncenumberapperar {
//     public static void main(String[]args){
//         int arr[] = new int[]{1,1,2,3,3,4,4};
//         for(int i = 0;i<arr.length;i++){
//             int num = arr[i];
//             int count = 0;
//             for(int j = 0;j<arr.length;j++){
//                 if(arr[j] == num){
//                     count++;
//                 }
              
//             }  
//               if(count == 1){
//                 System.out.print(num);
//                 }                  
//         }
//     }
    
// }

//better 
// public class oncenumberapperar {
//     public static void main(String[]args){
//         int arr[] = new int[]{1,1,2,3,3,4,4};
//         int maxi = arr[0];
//         for(int i = 0;i<arr.length;i++){
//             maxi = Math.max(maxi,arr[i]);

        
//         }            int hash[] = new int[maxi + 1];
 
//         for(int i =0;i<arr.length;i++){
//             hash [arr[i]] ++;
//         }for(int i = 0;i<arr.length;i++){
//             if(hash[arr[i] ] == 1){
//                 System.out.print(arr[i]);
//             }
//         }
//     }
// }
// import java.util.*;
// public class oncenumberapperar {
//     public static void main(String[]args){
//         int arr[] = new int[]{1,1,2,3,3,4,4};
//                 Map<Integer,Integer> mp = new HashMap<>();

//         for(int i = 0;i<arr.length;i++){
//             mp.put(arr[i],mp.getOrDefault(arr[i],0) +1);
//         }
        
//             for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
//              if(entry.getValue() == 1){
//                 System.out.print(entry.getKey());
//              }
//             }
//         }
//     }

//optimal  (xor)

 public class oncenumberapperar {
    public static void main(String []args){
        int arr[] = new int[]{1,1,2,3,3,4,4};
        int xor= 0;
        for(int i=0;i<arr.length;i++){
            xor = xor ^ arr[i];
        }System.out.print(xor);
    }
 }


