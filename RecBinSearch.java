
public class RecBinSearch {
    
    public static boolean RecursiveBinSearch(int [] arr, int key,int low,int high){
        if(low>high){
            return false;
        }
        else if(low<high){
            int m=(low+high)/2;
            if(arr[m]<key){
                return RecursiveBinSearch(arr,key,m+1,high);
            }
            else if(arr[m]>key){
                return RecursiveBinSearch(arr,key,low,m-1);
            }
            else{
                return true;
            }
        }
        else{
            if(key==arr[low])return true;
            else return false;
        }
    }
    
    public static void main(String args[]) {
      int [] a={3,8,9,14,64,139,654};
      System.out.println(RecursiveBinSearch(a,10,0,a.length-1));
    }
}
