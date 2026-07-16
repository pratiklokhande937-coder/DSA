
import java.util.*;
public class hashmap {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr [] = new int[n];

    for(int i = 0;i<n ;i++){
     arr[i] =sc.nextInt();
    }
    
    //precompute
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i =0;i<n;i++){
        map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

    }

    int q;
    q = sc.nextInt();
    while(q > 0){
        int number;
        number = sc.nextInt();
    
        //fetch
        System.out.print(map.getOrDefault(number, 0));
        q--;
    }
    sc.close();
    }
    
}
