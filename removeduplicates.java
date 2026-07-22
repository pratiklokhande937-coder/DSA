// import java.util.*;
//  public class removeduplicates {
//     public static void main(String [] args){
//     Set <Integer> st = new HashSet<>();
//     int arr[] = new int[]{1,1,2,2,2,3,3};

//     for(int i = 0;i<arr.length;i++){
//         st.add(arr[i]);
        
//     }int index = 0;
//     for(int it: st){
//     arr[index] = it;
//     index++;
//     }
//     System.out.print("list of unique elements");
//         for(int i= 0 ;i<index;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     }
    
// optimal solution
public class removeduplicates{
    public static void main(String[]args){
        int arr[] = new int[] {1,1,2,2,2,3,3,5,5,6,7};
        int i = 0;
        for(int j = 1;j < arr.length;j++){
           if(arr[j]!= arr[i]){
            arr[i + 1] = arr[j];
            i++; 
           }
        }int length= i+1;
        //System.out.print("length is " + " " +  length);

        for(int k = 0; k  < length;k++){
        System.out.print(arr[k]);
        }
    }
}
