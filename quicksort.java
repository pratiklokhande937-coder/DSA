public class quicksort {

     int quick(int arr[],int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j){
            while(arr[i] <= pivot 
                && i<=high-1
            ){
                i++;
            }while(arr[j] > pivot &&
                j>=low+1
            ){
                j--;
            }
            if(i < j){
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            } 
        }
            int swap = arr[low];
            arr[low] = arr[j];
            arr[j] = swap;
            return j;
        }

         void qs(int arr[],int low,int high){
            if(low < high){
                int partitionindex = quick(arr, low, high);
                qs(arr,low,partitionindex -1);
                qs(arr,partitionindex+1,high);
            }
        
        
    }
    public static void main(String[]args){
     int arr[]= new int []{4,6,2,5,7,9,1,3};
     quicksort obj = new quicksort();
     obj.qs(arr,0,arr.length-1);
     for(int x: arr){
        System.out.print(x+"");
     }
     
    }
    
}
