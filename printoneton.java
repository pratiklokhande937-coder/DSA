class printoneton{
    public static void  recursion(int i,int n){
        if(i > n){
            return;
        }            System.out.println(i);
        recursion(i + 1,n);
    }
    public static void main(String[]args){
        int i = 1;
        int n = 4;
        recursion(i,n);
    }
}