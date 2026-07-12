public class factorialrecursive {
    public static  int  recursion(int n){
        if(n == 0) return 1;
{
            //System.out.println(sum);
        }
        return n * recursion(n-1);
    }
   public static void main(String[] args){
    int n = 3;
   // int i = n;
    
    int sum = 0;
    System.out.println(recursion(n));
   }
}

