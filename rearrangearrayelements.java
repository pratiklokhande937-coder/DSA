// import java.util.*;
// public class rearrangearrayelements{

//     public static void main(String []  args){
//         int arr[] = new int [] { 3,1,-2,-5,2,-4};

//         int pos[] = new int[arr.length/2];
//         int neg[] = new int[arr.length/2];

//         int p = 0;
//         int n = 0;

//         for(int i = 0; i < arr.length ; i++){
//             if(arr[i] > 0){
//                 pos[p] = arr[i];
//                 p++;
//             }
//             else{
//                 neg[n] = arr[i];
//                 n++;
//             }
//         }
//         for(int i = 0; i < arr.length / 2; i++){

//             arr[2 * i] = pos[i];
//             arr[2 * i + 1] = neg[i];

//         }
//         System.out.print(Arrays.toString(arr));
//     }
// }

// another variety
import java.util.*;
public class rearrangearrayelements{

    public static void main(String []  args){
      int arr[] = new int []{-1,2,3,4,-3,1};
    //   int pos[] = new int [arr.length];
    //   int neg[] = new int [arr.length];

      ArrayList<Integer> positive = new ArrayList<>();
            ArrayList<Integer> negative = new ArrayList<>();


      for(int i = 0; i< arr.length;i++){
        if(arr[i] > 0){
            positive.add(arr[i]);
        }
        else{
            negative.add(arr[i]);
      }
      }
      if(positive.size() > negative.size()){
        for(int i = 0; i< negative.size();i++){
            arr[i * 2] = positive.get(i);
            arr[i * 2 + 1] = negative.get(i);
        
      }
      int index = negative.size() * 2;
      for(int i = negative.size(); i < positive.size() ; i ++ ){
        arr[index] = positive.get(i);
        index++;
      }
    }
      if(positive.size() < negative.size()){
        for(int i = 0; i< positive.size();i++){
            arr[i * 2] = positive.get(i);
            arr[i * 2 + 1] = negative.get(i);
        }
      
      int index = positive.size() * 2;
      for(int i = positive.size(); i < negative.size() ; i ++ ){
        arr[index] = negative.get(i);
        index++;
      }
    }
      System.out.print(Arrays.toString(arr));
    }
}