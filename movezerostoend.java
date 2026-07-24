// import java.util.*;
// public class movezerostoend {

//     public static void main(String[]args){
//         int arr[] = new int[]{1,0,2,3,2,0,0,4,5,1};
//         ArrayList<Integer >temp = new ArrayList<>();
//         for(int i = 0;i<arr.length;i++){
//             if(arr[i]!= 0){
//              temp.add(arr[i]);
//             }
//          // add non zeros at front
         

//         }
//         int nonzero = temp.size();
//         for(int i =0;i<temp.size();i++){
//          arr[i] = temp.get(i);
//         }

//         for(int i = nonzero;i<arr.length;i++){
//         arr[i] = 0;
//         }
//         System.out.print(Arrays.toString(arr));
//     }
    
// }

// optimal approach
import java.util.*;
public class movezerostoend {
public static void main(String[]args){
    int arr[] = new int[]{1,0,2,3,2,0,0,4,5};
    int j = -1;
    for(int i = 0;i<arr.length;i++){
        if(arr[i] == 0){
            j = i;
            break;
        }
    }for(int i = j+1;i<arr.length;i++){
        if(arr[i]!=0){
            int swap = arr[i];
            arr[i] = arr[j];
            arr[j] = swap;
            j++;
        }
    }
    for(int num: arr){
        System.out.print(num);
    }

}
}