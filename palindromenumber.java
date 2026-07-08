class palindrome{
    public static void main(String [] args){
        int revnum = 0;
        int n = 121;
        int dupnum = n;
        while(n > 0){
            int lastdigit = n % 10;
            revnum = (revnum * 10) + lastdigit;
            n = n/ 10;
            
        }if(dupnum == revnum){
                System.out.println(dupnum +" " + "is a palindrome");
            }else{
                System.out.println("not a palindrome");
            }
    }
}