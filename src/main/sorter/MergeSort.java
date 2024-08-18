package sorter;

public class MergeSort implements Sorter {

    @Override
    public int[] sort(int[] values) {
        // mergesort implementation
        return values;
    }

    public int[] merge(int[] left, int[] right) {
     int[] ordenador = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                ordenador[k++] = left[i++];
            } else {
                ordenador[k++] = right[j++];
            }
        }

        while (i < left.length) {
            ordenador[k++] = left[i++];
        }
        while (j < right.length) {
            ordenador[k++] = right[j++];
        }

        return ordenador;
       
    }
}