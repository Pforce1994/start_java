import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class Collection {
    public static void main(String[] args) {
    //     String[] data =new String[2];
    //     data[0] = "Hello";
    //     data[1] = "World";
    //     for (int i = 0; i < data.length; i++) {
    //     System.out.println(data[i]);
    // }

    ArrayList<String> data = new ArrayList<>();
    ArrayList<String> newdata = new ArrayList<>(List.of("Java","PHP","Python","C++"));
    HashSet<String> set = new HashSet<>();
    set.add("Java");
    set.add("PHP");
    set.add("Python");
    set.add("Java");
    System.out.println(set.size());
    for (String item : set) {
        System.out.println(item);
    }
}
    // // เพิ่มข้อมูล
    // data.add("Java");
    // data.add("PHP");
    // data.add("Python");
    // data.add("C++");
    // data.add(1,"C#");
    // // data.set(0, "Java SE");
    // // data.addAll(0,newdata);
    // // ลบข้อมูล
    // data.remove(0);
    // data.remove("PHP");
    // // data.clear();

    // // ค้นหาข้อมูล
    // System.out.println(data.contains("Java"));
    // System.out.println(data.indexOf("Python"));
    // System.err.println("-----------------");
    


    // System.out.println(data.size());
    // for (int i = 0; i < data.size(); i++) {
    //     System.out.println(data.get(i));
    // }
    // }
    }
