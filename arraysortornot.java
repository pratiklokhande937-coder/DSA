public class arraysortornot {

     boolean issort(int arr[]){
       for(int i=1;i<arr.length;i++){
            if(arr[i] >= arr[i-1]){

            }else{
                return false;
            }
        }
        return true;
     }
    public static void main(String []args){
        int arr[] = new int[]{1,2,2,3,3,2};

        arraysortornot obj = new arraysortornot();
            System.out.print(obj.issort(arr));
        
       
    }
}
