package school.management.system;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Teacher pooja = new Teacher(1,"pooja",10000,5000);
        Teacher srija = new Teacher(2,"srija",10000,3000);
        Teacher Anjali = new Teacher(3,"Anjali",10000,5000);


         List<Teacher> teachersList = new ArrayList<>();
         teachersList.add(pooja);
         teachersList.add(srija);
         teachersList.add(Anjali);

         Student navya = new Student(1,"navya",4);
         Student Girija = new Student (2,"Girija",12);
         Student Mouni = new Student(3,"Mouni",13);

         List<Student> studentList = new ArrayList<>();

         studentList.add(navya);
         studentList.add(Girija);
         studentList.add(Mouni);

         School ghs = new School(teachersList,studentList);
//         System.out.println(ghs.getTotalMoneyEarned());


        navya.payFees(6000);

//        System.out.println("ght earned total :" + ghs.getTotalMoneyEarned());

        Mouni.payFees(5000);
//        System.out.println("ght earned total :" + ghs.getTotalMoneyEarned());

        Girija.payFees(2000);
        System.out.println("ght earned total :" + ghs.getTotalMoneyEarned());



        System.out.println("----- GHS Techer Salary Earned ------");

        srija.reciveSalary(srija.getSalary());

        System.out.println("GHs has Spent for salary to  :" + srija.getName() +
                "  and now has  :" + ghs.getTotalMoneyEarned());


    }
}
