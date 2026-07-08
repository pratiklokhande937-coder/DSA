class countdigits{
    static int countdig(int n){
        int count = (int)(Math.log10 (n)+1); 
        return count;
    }
    
    public static void main(String[]args){
        int n = 123;
        int result = countdig(n);
        System.out.println("the count of the numbers are:"+ (result));
    }
}