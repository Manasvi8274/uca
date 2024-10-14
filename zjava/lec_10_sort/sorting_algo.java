import java.util.*;
class sorting_algo{
    
    public static void bubble_sort_algo(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void selection_sort_algo(int[] arr){
        for(int i=0;i<arr.length;i++){
            int mn = arr[i];
            int mni = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < mn){
                    mn = arr[j];
                    mni = j ;
                }
            }
            arr[mni] = arr[i];
            arr[i] = mn;
        }
    }

    public static void insertion_sort_algo(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j = i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("BEFORE SORTING : \t");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +"\t");
        }
        System.out.println();

        // bubble_sort_algo(arr);
        // selection_sort_algo(arr);
        insertion_sort_algo(arr);

        System.out.print("AFTER SORTING : \t");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +"\t");
        }
        System.out.println();
    } 
}