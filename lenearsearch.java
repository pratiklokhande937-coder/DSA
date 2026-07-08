public class lenearsearch{
    public static void main(String [] args){
        int [] arr = {2,4,5,6,7,89,20};
        int target = 6;
        int ans = linearSearch(arr,target);
        System.out.println(ans);

    }
    static int linearSearch(int[]arr,int target){
       if(arr.length == 0){

        return -1;
       }
       //run for loop
       for(int i = 0;i<arr.length;i++){
        //check for element at every index if it = target
        int element = arr[i];
        if(element == target){
            return i;
        }
        
       }
       return -1;
    }
}