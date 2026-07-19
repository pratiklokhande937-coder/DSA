import java.util.*;
public class characterhashmap {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i =0;i<str.length();i++){
            char ch= str.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1 );
        }
        for(Map.Entry< Character , Integer> e : map.entrySet()){
        System.out.println(e.getKey());
        System.out.println(e.getValue());
        System.out.println(e.getKey()+ "->" + e.getValue());
        }
        
    }
    
}
