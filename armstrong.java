public class armstrong{
    public static void main(String [] args){
        //int revnum = 0;
        int n = 371;
        int dupnum = n;
        int count = 0;
        while(n > 0){
            int lastdigit = n % 10;
           // revnum = (revnum * 10) + lastdigit;
           count = count + (lastdigit*lastdigit*lastdigit);
            n = n/ 10;
            
        }if(dupnum == count){
                System.out.println(dupnum +" " + "is a armstrongnumber");
            }else{
                System.out.println("not a armstrongnumber");
            }
    }
} 
