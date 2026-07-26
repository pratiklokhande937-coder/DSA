// class missingarraynumber{

//      int missing(int arr[]){
//           for(int i = 1;i<=arr.length + 1;i++){
//             int flag = 0;
//             for(int j = 0;j<arr.length;j++){
//                 if(arr[j] == i){
//                     flag = 1;
//                     break;
//                 }
//             }if(flag == 0){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[]args){
//         int arr[] = new int[]{1,2,4,5};
         
//         missingarraynumber obj = new missingarraynumber();
        
//         System.out.print(obj.missing(arr));
  
//     }
// }

// btter approach
// class missingarraynumber{

//     int missing(int arr[],int hasharray[]){

//         for(int i = 0;i<arr.length;i++){
//         hasharray[arr[i]] = 1;

//         }
//         for(int i =1;i<hasharray.length;i++){
//             if(hasharray[i] == 0){
//                 return i;
//             }
//         }
//         return -1;
        
//     }
    
//     public static void main(String[]args){
//         int arr[] = new int[]{1,2,4,5};
//         int hasharray[] = new int[arr.length+2];

//         missingarraynumber obj = new missingarraynumber();
//         System.out.print(obj.missing(arr, hasharray));

//     }
// }

//optimized sol 1
// class missingarraynumber{
//     public static void main(String[]args){
//         int arr[] =new int []{1,2,4,5};
//         int n = arr.length+1;
//         int sum = n*(n+1)/2;
//         int s2 = 0;
//         for(int i =0;i<arr.length;i++){
//             s2 = s2 + arr[i];
//         }
//         System.out.print(sum - s2);
//     }
// }

//sol2 xor
class missingarraynumber{
    public static void main(String[]args){
        // int xor1 = 0;
        // int arr[]=new int[]{1,2,4,5};
        // int n = arr.length+1;
        // for(int i = 1;i<=n;i++){
        //     xor1 = xor1 ^ i; 
        // }int xor2 = 0;
        // for(int i = 0;i<arr.length;i++){
        //     xor2 = xor2 ^ arr[i];
        // }
        int xor1 = 0;
        int xor2 = 0;
         int arr[]=new int[]{1,2,4,5};
        int n = arr.length+1;
        for(int i = 0;i<arr.length;i++){
            xor1= xor1 ^ (i+1);
            xor2 = xor2 ^ arr[i];
        }
        xor1= xor1^n;
        System.out.print(xor1^xor2);
    }
}

