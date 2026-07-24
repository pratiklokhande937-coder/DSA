// import java.util.*;
// public class arrayunion {

//     public List<Integer> union(int arr1[],int arr2[]){

//         Set<Integer> st= new TreeSet<>();
//         for(int ans : arr1){
//         st.add(ans);
//         }
//         for(int ans : arr2){
//             st.add(ans);
//         }
//         return new ArrayList<>(st);
//     }

//     public static void main(String []args){
//     int arr1[] = new int[]{1,2,3,4,5,6};
//     int arr2[] = new int []{1,2,3,4,5};
//     arrayunion obj = new arrayunion();
//     List<Integer>  result = obj.union(arr1, arr2);

//     System.out.println("the union of the arrays are :");
//     for(int x: result){
//         System.out.print(x);
//     }
//     }
// }


import java .util.*;
public class arrayunion {
public static ArrayList<Integer> union (int arr1[],int arr2[]){
int i = 0;
int j = 0;

ArrayList <Integer> ans = new ArrayList<>();
while(i < arr1.length && j < arr2.length){
    if(arr1[i] < arr2[j]){
        if(ans.size() == 0 || ans.get(ans.size() -1)!= arr1[i] ){
            ans.add(arr1[i]);
        }
        
        i++;
    
        
    }
    else if(arr2[j] < arr1[i]){
        if(ans.size() == 0 || ans.get(ans.size() -1) != arr2[j]){
            ans.add(arr2[j]);
        }
        j++;
    }
    else{
        if(ans.size() == 0 || ans.get(ans.size() -1) != arr1[i]){
            ans.add(arr1[i]);
        }
        i++;
        j++;
    }
}
while(i < arr1.length){
    if(ans.size() == 0 || ans.get(ans.size() -1)!= arr1[i]){
        ans.add(arr1[i]);
    }
    i++;
}
while(j < arr2.length){
    if(ans.size() == 0 || ans.get(ans.size() -1)!= arr2[j]){
        ans.add(arr2[j]);
    }j++;
}
return ans;
}
    public static void main(String[]args){
        int arr1[] = new int[]{1,1,2,3,4,5};
        int arr2[] = new int[]{2,3,4,4,5,6};

        System.out.print(union(arr1,arr2));

    }
}