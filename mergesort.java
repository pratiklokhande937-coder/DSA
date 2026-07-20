import java.util.*;
public class mergesort {
    void mergesorting(int arr[],int low,int high){
    if(low >= high)  return;
       // return;
        int mid = (low + high)/  2;
        mergesorting(arr, low, mid);
        mergesorting(arr,mid+1,high);
        mS(arr,low,mid,high);
    
    }

    void mS(int arr[],int low,int mid,int high){
    //int temp;
    ArrayList<Integer> temp = new ArrayList<>();
    int left = low;
    int right = mid +1;
    while(left<=mid && right <= high ){
        if(arr[left] <= arr[right]){
            temp.add(arr[left]);
            left++;

        }else{
            temp.add(arr[right]);
            right++;
        }
    }while(left <=mid){
            temp.add(arr[left]);
            left++;

        }while(right <= high){
            temp.add(arr[right]);
            right++;
        }
    for(int i = low;i<=high;i++){
        arr[i] = temp.get(i-low);
    }
    }
    public static void main(String[]args){
    int arr[] = new int[]{1,1,2,3,4,2,4,5,6};
    mergesort obj = new mergesort();
    obj.mergesorting(arr,0,arr.length - 1);

    for(int x: arr){
        System.out.print(x+ " ");
    }
    }
    
}
