class Data {
    static <T> void showArray(T[] arr) {
        for (T i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }  
}
public class Gmethon {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] arr3 = {'A', 'B', 'C', 'D', 'E'};
        Data.showArray(new Integer[]{7, 8, 9, 10, 11});
        Data.showArray(arr1);
        Data.showArray(arr2);
        Data.showArray(arr3);
    }
}
