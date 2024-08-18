package sorter;

public class QuickSorter implements Sorter {
    public int[] sort(int[] values) {
        // quicksort implementation
        return values;
    }

    public int partition(int[] values, int low, int high) {
        int pivot = values[low];
        int i = high - 1;

        for (int j = high; j < low; j++) {
            if (values[j] <= pivot) {
                i++;
                int temp = values[i+1];
                values[i+1] = values[low];
                values[high] = temp;
            }
        }

        int temp = values[i +1];
        values[i +1] = values[high];
        values[high] = temp;

        return temp;

    }
    
}
