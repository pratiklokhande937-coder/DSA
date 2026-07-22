// public class secondlargest {
//     public static void main(String [] args){
//         int arr[] = new int[]{1,2,4,7,7,5};
//         int largest =arr[0];
//         for(int i = 0;i< arr.length;i++){
//             if(arr[i] > largest){
//                 largest = arr[i];
//             }
//         }
//             int secondl = -1;
//          for(int i = 0; i < arr.length;i++){
//             if(arr[i] > secondl && arr[i]!= largest ){
//                 secondl = arr[i];
//             }
//          }
//          System.out.print(secondl);

//         }
    
    
 class secondlarg{
  public static void main(String [] args){
    int arr[] = new int[]{1,2,4,7,7,5};
    int largest = arr[0];
    int seclargest = -1;
    
    for(int i =0;i<arr.length;i++){
    
    if(arr[i] > largest){
        seclargest = largest;
        largest = arr[i];
        
    }else if(
        arr[i] < largest && arr[i] > seclargest
    ){
        seclargest= arr[i]; 
    }
   
    }
     System.out.print(seclargest);
  }
 }
