public class stringpalindromecheck {

     static   boolean palindromecheck(String str,int i,int n){
        if(i >= n/2){
            return true;
        }if (str.charAt(i) != str.charAt(n-i-1)){
        return false;
     }return palindromecheck(str,i+1,n);
    }
    public static void main(String[]args){
        String str = "madsm";
                int n = str.length();
        palindromecheck(str,0,n);
        System.out.print(palindromecheck(str,0,n));

    }
    
}
