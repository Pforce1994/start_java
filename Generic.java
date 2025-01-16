
class Person<T extends String,U extends Integer>{
    T name;
    U age;
    public Person(T name,U age){
        this.name=name;
        this.age=age; 
    }
}
public class Generic {
    public static void main(String[] args) {
        // Item<Integer,Boolean> itemInt=new Item<>(10,true);
        // itemInt.data=20;
        // System.out.println("ItemInt ="+itemInt.data+" "+itemInt.data2);
        // Item<Double,Boolean> itemDouble=new Item<>(10.5,true);
        // System.out.println("ItemDouble ="+itemDouble.data+" "+itemDouble.data2);
        // Item<String> itemString=new Item<>("Hello");
        // System.out.println("ItemString ="+itemString.data);

        Person<String,Integer> person=new Person<>("Rahul",20); 
        System.out.println("Person ="+person.name+" "+person.age);
    }
}
