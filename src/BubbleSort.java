
//unintentionally i created an algorithm which is descending bubble sort
public class BubbleSort {
    public static void bubbleSort(int []arr){
        for(int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1; j++){
                if (arr[j + 1] > arr[j]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []arr= {2,35,1,3,5,5,4};
        print(arr);
        bubbleSort(arr);
        print(arr);
    }
}
