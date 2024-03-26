public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 3, 42, 9, 7, 2, 13, 4, 20 };

        int target = 3;
        int pAwal = 0;
        int pAkhir = arr.length - 1;
        int mid;

        while (pAwal <= pAkhir) {
            mid = (pAwal + pAkhir) / 2;

            if (arr[mid] == target) {
                System.out.println("Angka ditemukan di index: " + mid);
                return;
            } else if (arr[mid] < target) {
                pAwal = mid + 1;
                System.out.println("Ini mid + 1 : " + pAwal);
            } else {
                pAkhir = mid - 1;
                System.out.println("Ini mid - 1 : " + pAkhir);
            }
        }

        System.out.println("Angka tidak ditemukan");
    }
}