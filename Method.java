
public class Method {
    public static void main(String[] args) {
        int[] numberA = {10,20,100,40,50};
        int[] numberB = {-50,-20,-40,-30};
        // displayArray(numberA);
        // displayArray(numberB);
        int Index = findMaxIndex(numberA);
        System.out.println(Index);
    }
    static void displayArray(int[] arr){
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (arr.length-1 != i) {
                System.out.print(",");
            }else{
                System.out.print("}");
            }
        }
    }
    static int findMaxIndex(int[] arr1){
        int maxIndex= 0;
        int index=0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > maxIndex) {
                maxIndex = arr1[i];
                index=i;
            }
        }
        return  index;
    }
    static int compareArray(int[] a ,int[] b){
        int compare=0;
        for (int i = 0; i < b.length; i++) {
            
        }
        return compare;
    }
}