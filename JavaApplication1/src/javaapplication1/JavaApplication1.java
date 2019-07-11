package javaapplication1;

import java.util.ArrayList;

public class JavaApplication1 {

    public static void main(String[] args) {
        Student s = new Student();

        ArrayList<Student> ListStudent = new ArrayList<>();
        for (int i = 0; i < 5; i++) { 
            s = new Student();
            s.inPut();
            ListStudent.add(s); // list student tai s -> (pointed at) s
        }
        for (int i = 0; i < ListStudent.size(); i++) {
            if (ListStudent.get(i).getName().toLowerCase().contains("nguyen")) {
                System.out.println("Tim thay");
               
            }
    
        }
    }

}
