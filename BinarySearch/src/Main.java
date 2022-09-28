
public class Main {
    public static void main(String[] args) {
        int[] sortedArray = {16, 52, 44, 12, 1, 67, 32, 11, 5, 14};
        int key = 89;
        int position = binarySearch(sortedArray, key);
        System.out.println(key + " position is " + position);
    }

    static int binarySearch(int[] array, int key){
        int position = 0;
        int left = 0;
        int right = array.length-1;


        while(left <= right){
            int middle = (left + right)/2;
            if(array[middle] == key){
                return middle;
            }

            if(array[middle] < key){
                left = middle + 1;
            }

            if(array[middle] > key){
                right = middle - 1;
            }
        }

        return -1;
    }
}