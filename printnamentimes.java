class printnamentimes {
    public static void fun(int i, int n){
    if(i > n){
        return;

    }System.out.println( "" + "pratik");
    fun(i + 1, n);
    }
    public static void main(String[]args){
        int n = 3;
        int i = 1;
        fun(i,n);

    }
}