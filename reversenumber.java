class reversenumber{
    public static void main(String []args){
        int n = 7789;
        int revno = 0;
        while(n > 0){
            int lastdigit = n%10;
            revno = (revno*10)+ lastdigit;
            n = n/10;
        }
        System.out.println(revno);
    }
}