public class arrayreverse {
   static void reverse(int arr[],int i,int n){
        if(i >= n / 2){
        return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
             reverse(arr,i+1,n);

    }
    public static void main(String []args){
        int []arr = new int[]{1,2,3,4,5};
        int n= arr.length;
         reverse (arr,0,n);

         for(int num:arr){
   System.out.print(num + " ");
         }
    }
    
}
