
//unintentionally i created an algorithm which is descending bubble sort
public class BubbleSort {

    public static void bubbleSort(int []arr){
        boolean isSwapped;                      //creating a boolean variable to keep the track of the swaps
        for(int i=0; i<arr.length-1; i++){
            isSwapped = false;                  //initially i am assuming that there will be no swap
            for (int j=0; j<arr.length-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]=temp;
                    isSwapped = true;               // but here the swap is true if the above if conditions apply
                }
            }//now if the is swapped is false then it will break the loop
            if(isSwapped=false){
                break;
            }
        }
    }
    //now creating a method to print the array
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    //lets try a method to print the array in reverse order to get the bubble sort done in the easiest way
    public static void reversePrint(int []arr){
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    //testing the methods in the actual loops

    public static void main(String[] args) {
        int []arr= {2,35,1,3,5,5,4, 2,3,1,9,10,32,92};
        print(arr);
        bubbleSort(arr);
        print(arr);
        reversePrint(arr);
    }
}
