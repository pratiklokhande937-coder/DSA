// public class rotatearraybydsteps {
    
//     public static void main(String[]args){
//         int arr[] = new int[]{1,2,3,4,5,6,7};
//         int D = 3;
//         int temp [] = new int[D];
//                 for(int i =0;i<D;i++){
//                 temp[i] = arr[i];
        
//     }   

//         for(int i = D;i<arr.length;i++){
//         arr[i-D] = arr[i];
//         }
//         int j = 0;
//         for(int i = arr.length-D;i<arr.length;i++){
//             arr[i] = temp[j];
//             j++;
//         }
//     for(int i = 0;i<arr.length;i++){
//         System.out.print(arr[i] + " ");
//     }

//     }
// }

//better approach
// import java.util.*;
// import java.util.ArrayList;

// public class rotatearraybydsteps {
//     public static void main(String []args){
//         int arr[] = new int[]{1,2,3,4,5,6,7};

//         int D = 3;
//         int temp[] = new int[D];
//         for(int i = 0;i<D;i++){
//             temp[i] = arr[i];
//         }
//         ArrayList<Integer> temp = new ArrayList<>();
//         temp.pushback(arr[i]);

//         for(int i = D;i<arr.length;i++){
//             arr[i - D] = arr[i];

//         }
//                     for(int i = arr.length-D;i<arr.length;i++){
//                         arr[i] = temp[i -(arr.length-D)];
//                     }
//         for(int i = 0;i<arr.length;i++){
//         System.out.print(arr[i]);
//         }
//     }
// }
//optimal approach
import java.util.*;
public class rotatearraybydsteps {
            void reversearray(int arr[],int start,int end){
             while(start < end){
             int temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
             }

            }

            public int [] rotatearray(int arr[],int k,String direction){
                int n = arr.length;
              if(n== 0 || k == 0)return arr;

              k = k%n;
              if(direction.equals("right")){
                //reverse entire array
                reversearray(arr, 0, n-1);

                //reverse first k elements
                reversearray(arr, 0 , k-1);

                //revesre remaning elements
                reversearray(arr, k, n-1);
              }
              // if rotation is to left
              else if(direction.equals("left")){
                //reverse first k elements
                reversearray(arr, 0, k-1);

                //reverse remaining elements
                reversearray(arr, k, n-1);

                //reverse entire array
                reversearray(arr, 0, n-1);
              }
              return arr;
            }
    public static void main(String []args){
            rotatearraybydsteps obj = new rotatearraybydsteps();
            int arr[] = new int[]{1,2,3,4,5,6,7};
            int k = 3;

            int ans[] = obj.rotatearray(arr, k,"right" );
            for (int num : ans){
             System.out.print(num);
            }
        
    }
}