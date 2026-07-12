public class printreversebyrecursion {
    public static void recursion(int i,int n){
        if(i < 1){
            return;
        }System.out.println(i);
        recursion(i-1,n);
    }
    public static void main(String[]args){
        int i = 1;
        int n = 3;
        recursion(n,n);
    }
    
}
