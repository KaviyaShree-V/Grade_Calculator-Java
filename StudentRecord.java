import java.util.HashMap;

public class StudentRecord {
    public static void main(String[] args) {
        Students students=new Students("23bcs32","Kaviya");
        students.getStudents("Kaviya");
    }
}
class Students{
    private static String rollNo;
    private static String name;
    static HashMap<String,String> students = new HashMap<>();
    Students(String rollNo,String name){
//        this.rollNo=rollNo;
//        this.name=name;
        students.put(rollNo,name);
    }

    static void getStudents(String name){
        students.get(rollNo);
        students.get(name);
    }
}
class Courses{
    HashMap<String,String> courseLists = new HashMap<>();

}
class Marks{
    HashMap<String, Integer> marks = new HashMap<>();
}
class Attendance{
    HashMap<String,Integer> attendance = new HashMap<>();
}
class Fees{
    HashMap<String,Integer> fees = new HashMap<>();
}