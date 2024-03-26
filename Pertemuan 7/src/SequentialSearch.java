public class SequentialSearch {
    public static void main(String[] args) {
        // Array contoh
        int[] arr = { 3, 42, 9, 7, 2, 13, 4, 20 };

        // Nilai yang ingin dicari
        int x = 7;

        // Variabel penanda apakah nilai ditemukan atau tidak
        boolean found = false;

        // Melakukan Sequential Search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                found = true;
                break;
            }
        }

        // Mengecek apakah nilai ditemukan atau tidak
        if (found) {
            System.out.println("Nilai " + x + " ditemukan.");
        } else {
            System.out.println("Nilai " + x + " tidak ditemukan.");
        }
    }
}
