public class onetonrecursionbacktracking {
    public static void recursion(int i,int n){
        if(i < 1){
            return;
        }
        recursion(i -1,n);
        System.out.println(i);
    }
    public static void main(String[] args){
        int i =1;
        int n = 3;
        recursion(n , n);
    }
}
