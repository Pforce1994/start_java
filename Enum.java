enum Grade{
    A(4.00,"Genius"),
    B(3.00,"Very Good"),
    C(2.00,"Good"),
    D(1.00,"Not Bad"),
    F(0.0,"Fail");
    private Grade(double p,String comment){
        this.point= p;
        this.description= comment;
    }
    public final double point;
    public final String description;
}
class ItemInt {
    int data;
    public ItemInt(int value){
        this.data=value;
    }
    
}
class ItemDouble {
    double data;
    public ItemDouble(double value){
        this.data=value;
    }
    
}
class ItemString {
    String data;
    public ItemString(String value){
        this.data=value;
    }
    
}


public class Enum {
    public static void main(String[] args) {
        Grade myGrade=Grade.C;
        System.out.println("Grade ="+myGrade+","+myGrade.point+","+myGrade.description);
        ItemInt itemInt=new ItemInt(10);
        System.out.println("ItemInt ="+itemInt.data);
        ItemDouble itemDouble=new ItemDouble(10.5);
        System.out.println("ItemDouble ="+itemDouble.data);
        ItemString itemString=new ItemString("Hello");
        System.out.println("ItemString ="+itemString.data);



        // for (Grade grade : Grade.values()) {
        //     System.out.println(grade);
        // }
    }
}
