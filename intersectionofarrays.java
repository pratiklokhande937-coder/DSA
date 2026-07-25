// import java.util.*;
// public class intersectionofarrays {

//     public ArrayList<Integer> intersection(int arr1[],int arr2[]){
//         int n1 = arr1.length;
//         int n2 = arr2.length;
//         int visited [] = new int[n2];
//         ArrayList<Integer> ans = new ArrayList<>();
//         for(int i = 0;i< n1;i++){
//             for(int j = 0;j<n2;j++){
//                 if(arr1[i] == arr2[j] && visited[j] == 0  ){
//                     ans.add(arr1[i]);
//                     visited[j] = 1;
//                     break;
//                 }
//                 if(arr2[j] > arr1[i]){
//                 break;
//             }
//             }
//         }            return ans;


//     }
//     public static void main(String[]args){
//         int arr1[] = new int[]{1,2,2,3,3,4,5,6};
//         int arr2[] = new int[]{2,3,3,5,6,6,7};

//         intersectionofarrays obj = new intersectionofarrays();
        

//         System.out.print(obj.intersection(arr1,arr2));

        
//     }
    
// }

// optimize approach
import java.util.*;
public class intersectionofarrays {
    public ArrayList <Integer> intersection(int arr1[],int arr2[]){
        int i = 0;
        int j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i < arr1.length && j < arr2.length){
            if(arr1[i]< arr2[j]){
                i++;
            }else if(arr2[j] < arr1[i]){
                j++;
            }else{
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String [] args){
        int arr1[] = new int[]{1,2,2,3,3,4,5,6};
        int arr2[] = new int[]{2,3,3,5,6,6,7};

        intersectionofarrays obj = new intersectionofarrays();
        System.out.print(obj.intersection(arr1, arr2));

    }
}
