public class BubbleSort {
    /**Bubble sort function */

    public static void bubbleSort(int[] list){
        boolean nextPass = true;

        for(int k = 1; k < list.length && nextPass; k++){
            //Array may be sorted and next pass not needed
            nextPass = false;
            for (int i = 0; i < list.length - k; i++){
                if (list[i] > list[i + 1]){
                    // Swap list[i] with list[i + 1]
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    nextPass = true; // Next pass still needed
                }
            }
        }
    }

    /** Main for testing */

    public static void main(String[] args){
        int[] list = {2,3,2,5,6,1,-2,3,14,12};
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

}





