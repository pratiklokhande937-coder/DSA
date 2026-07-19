import java.util.*;
public class highestfrequencyhashmap {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  []arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //int frequency;
        
        HashMap <Integer , Integer > map = new HashMap <>();
          int frequency = 0;
             int ans = Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);

        }

             for(Map.Entry<Integer,Integer>e: map.entrySet()){
             int number = e.getKey();
             int count = e.getValue();
             if( frequency < count){
               frequency = count;
               ans = number;
             }else if( count == frequency && number < ans){
                ans = number;
             }

        }
    System.out.println(ans);

    }
    
}

