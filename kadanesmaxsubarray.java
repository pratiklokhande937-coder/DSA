// public class kadanesmaxsubarray {
//     public static void main(String []args){
//         int arr[] = new int []{-2,-3,4,-1,-2,1,5,-3};
//         int max = Integer.MIN_VALUE;
//         for(int i = 0;i < arr.length;i++){
//             for(int j = i; j < arr.length;j++){
//               int sum = 0;
//               for(int k = i; k <= j; k++){
//                 sum = sum + arr[k];

//               }
//                               max = Math.max(sum, max);


//             }
            
//         }
//         System.out.print(max);
        
//     }
    
// }

// better
// public class kadanesmaxsubarray {
//      public static void main(String []args){
//       int arr[] = new int []{-2,-3,4,-1,-2,1,5,-3};
//            int max = Integer.MIN_VALUE;
//            for(int i = 0; i< arr.length;i++){
//             int sum = 0;

//             for(int j = i;j < arr.length;j++){
//                 sum = sum + arr[j];
//                             max = Math.max(sum,max);

//             }
//            }
//            System.out.print(max);

//      }
//     }

//optimize approach
public class kadanesmaxsubarray {
     public static void main(String []args){
      int arr[] = new int []{-2,-3,4,-1,-2,1,5,-3};
      int sum = 0;
      int max = Integer.MIN_VALUE;
      for(int i = 0; i < arr.length; i++){
          sum = sum + arr[i];

          if(sum > max){
               max = sum;
          }
          if(sum < 0){
               sum = 0;

          }
          // if(max < 0){
          //      System.out.print("no any value to print");
          // }
      }
      System.out.print(max);
     }
}