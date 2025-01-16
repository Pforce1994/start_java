public class StringMet {
    static String  name = "Knogruksiam";
    static String  city = new String("Rayong");
    public static void main(String[] args) {
        // ต่อ String
        String rusult = name+city;
        System.out.println(rusult);

        // หาความยาว String
        System.out.println(name.length());

        // หาตำแหน่งตัวอักษร
         System.out.println(name.charAt(2));
    }
}
