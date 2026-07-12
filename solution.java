class Solution {
    public static void recursion(int i,int sum){
        if(i < 1){
            System.out.println(sum);
            return;
        }
        recursion(i -1,sum + i);
    }
   public static void main(String[] args){
    int n = 5;
    int i = n;
    
    int sum = 0;
    recursion(n,sum);
   }
}