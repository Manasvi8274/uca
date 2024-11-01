public class check_sort{
    
    public static boolean checkSorted(int[] arr){
        if(arr.length <= 1){
            return true;
        }
        int smallarr[] = new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            smallarr[i-1] = arr[i];
        }
        boolean ans = checkSorted(smallarr);
        if(ans ==false){
            return false;
        }
        if(arr[0] <= arr[1])    return true;
        return false;
    }
    
    public static void main(String[] args){
        int input[] = {10,2,3,4,5};
        System.out.println(checkSorted(input));
    }
}