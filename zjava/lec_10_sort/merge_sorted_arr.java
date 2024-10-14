import java.util.*;

public class merge_sorted_arr {

    public static int[] merge(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int k =0;
        int i=0,j=0;

        while(i<arr1.length || j < arr2.length){
            if(i<arr1.length && j<arr2.length && arr1[i] < arr2[j]){
                arr3[k++] = arr1[i++];
            }
            else if(i<arr1.length && j<arr2.length && arr1[i] > arr2[j]){
                arr3[k++] = arr2[j++];
            }
            else if(i>=arr1.length && j<arr2.length){
                arr3[k++] = arr2[j++];
            }
            else if(i<arr1.length && j>=arr2.length){
                arr3[k++] = arr1[i++];
            }
        }

        return arr3;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ARR_1 SIZE : ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }


        System.out.print("ENTER ARR_2 SIZE : ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n1];
        for(int i=0;i<n1;i++){
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[n1+n2];

        arr3 = merge(arr1, arr2);

        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i] + "\t");
        }
    }
}
