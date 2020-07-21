package thuchanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> students=new HashMap<>();
        students.put("Nam",30);
        students.put("Dũng",25);
        students.put("Tuấn",27);
        students.put("Ngọc",23);

        System.out.println("Students list: "+"\n"+students);

        Map<String,Integer> studentList=new TreeMap<>(students);
        System.out.println("\nDanh sách sinh viên theo thứ tự giảm dần: "+"\n"+studentList);

        Map<String,Integer> linkedStudents=new LinkedHashMap<>(16,0.75f,true);
        linkedStudents.put("Nam",30);
        linkedStudents.put("Dũng",25);
        linkedStudents.put("Tuấn",27);
        linkedStudents.put("Ngọc",23);
        System.out.println("\nTuổi của Nam là: "+linkedStudents.get("Nam"));
    }
}
