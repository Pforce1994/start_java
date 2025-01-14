class Display{
    public static void main(String[] args){
        variable();
    }
    public static void variable(){
        // นิยามตัวแปร
        int x = 10 , y = 20;
        boolean b = true;
        float f = 10.5f;
        double d = 10.5;
        short s = 10;
        long l = 10;
        char c = 'A';
        final int Z = 100; // ค่าคงที่
        // Z = 200; // ไม่สามารถเปลี่ยนค่าได้

        // การแปลงชนิดข้อมูล
        int numint = 10;
        double numdouble = numint; // ถอดเป็น double เล็กไปใหญ่
        int numint2 = (int) numdouble; // แปลงกลับเป็น int ใหญ่ไปเล็ก

        // String => int
        String str = "10";
        int num = Integer.parseInt(str);    
        double num2 = Double.parseDouble(str);
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);

        // int => String
        int num3 = 10;
        double num4 = 10.5;
        String str1 = String.valueOf(num3);
        String str2 = Integer.toString(num3);
        System.out.println("str2 = " + str2);
        System.out.println("str1 = " + str1);

        // แสดงผล
        // System.out.println("x = " + x);
        // System.out.println("y = " + y);
        // System.out.println("b = " + b);
        // System.out.println("f = " + f);
        // System.out.println("d = " + d);
        // System.out.println("s = " + s);
        // System.out.println("l = " + l);
        // System.out.println("c = " + c);
        // System.out.println("Z = " + Z);
        // System.out.println("int = " + Integer.MAX_VALUE);
        // System.out.println("int = " + Integer.MIN_VALUE);
        // System.out.println("numdouble  = " + numdouble);
        // System.out.println("numint2  = " + numint2);
    }
}
