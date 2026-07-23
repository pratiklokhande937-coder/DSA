import java.util.*;
public class movezerostoend {

    public static void main(String[]args){
        int arr[] = new int[]{1,0,2,3,2,0,0,4,5,1};
        ArrayList<Integer >temp = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!= 0){
             temp.add(arr[i]);
            }
         // add non zeros at front
         

        }
        int nonzero = temp.size();
        for(int i =0;i<temp.size();i++){
         arr[i] = temp.get(i);
        }

        for(int i = nonzero;i<arr.length;i++){
        arr[i] = 0;
        }
        System.out.print(Arrays.toString(arr));
    }
    
}
