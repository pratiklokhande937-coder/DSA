class recursion{
            static int count = 0;

     public static void  fun(){
        if(count >= 2){
            return ;
            
        }System.out.print(count);
        count++;
        fun();
    }
    public static void main(String[]args){
         fun();    
    }
}