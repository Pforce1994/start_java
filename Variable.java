class  Variable{
    public static void main(String[] args) {
        Integer a= 10;
        Double b= 10.0;
        String c ;
        boolean d;
        Character e;
        Float f;

        boolean result = a instanceof Integer;
        System.out.println("The result : " + result);
        System.out.println("The value of a : " + a);
    }
}