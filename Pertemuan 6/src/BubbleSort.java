public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {23, 35, 7, 14, 67};

        System.out.println("Data awal:");

        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] < data[j + 1]) {
                    // Tukar posisi
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }

        System.out.println("\nData setelah diurutkan secara descending:");
        
    }
}