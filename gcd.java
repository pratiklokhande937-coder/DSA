class gcd{
    public static void main(String [] args){
        int gcd = 1;
        int n1 = 20;
        int n2 = 40;
        for(int i =  Math.min(n1,n2);i>=1;i--){
            if (n1%i == 0 && n2%i == 0){
              gcd = i;
            break;
            }
        }
        System.out.println("the gcd for given number is "+ " " + gcd);
    }
}