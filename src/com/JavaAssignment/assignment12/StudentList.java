package com.JavaAssignment.assignment12;

import java.util.*;
import java.util.stream.*;

public class StudentList {

    ArrayList<Student> studentsList = new ArrayList<>();
    List<Student> maleStudents;
    List<Student> femaleStudents;

    StudentList()
    {
        studentsList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentsList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentsList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentsList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentsList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentsList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentsList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentsList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentsList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentsList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentsList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentsList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentsList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentsList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentsList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentsList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentsList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
    }

    void printAllDepartments()
    {
        studentsList.stream()
                    .map(Student::getEngDepartment)
                    .distinct()
                    .forEach(System.out::println);
    }

    void enrolledAfter2018()
    {
        studentsList.stream()
                    .filter((student)-> student.yearOfEnrollment > 2018)
                    .map(Student::getName)
                    .forEach(System.out::println);
    }


    void getComputerScienceDeptStudents()
    {
        studentsList.stream()
                    .filter((student)->student.getEngDepartment().equals("Computer Science"))
                    //.filter(student -> student.gender.equals("Male"))
                    .filter(Student::isMale)
                    .forEach(System.out::println);

    }

    void getMaleAndFemaleCount()
    {
        Map<String,List<Student>> maleFemaleStudents =studentsList.stream()
                    .collect(Collectors.groupingBy(Student::getGender));

        maleStudents = maleFemaleStudents.get("Male");
        femaleStudents = maleFemaleStudents.get("Female");

        System.out.println("Male students:"+maleStudents.size());
        System.out.println("Female students:"+femaleStudents.size());

    }

    void getAverageAges()
    {
       OptionalDouble maleAverageAge= maleStudents.stream()
                                            .mapToInt(Student::getAge)
                                            .average();
       System.out.println("Male student average age is: "+maleAverageAge.getAsDouble());

        OptionalDouble femaleAverageAge = femaleStudents.stream()
                                                        .mapToInt(Student::getAge)
                                                        .average();
        System.out.println("Female student average age is: "+femaleAverageAge.getAsDouble());

    }

    void getHighestStudent()
    {
        Optional<Student> highestStudent= studentsList.stream()
                                            .max((student1,student2)->student1.perTillDate > student2.perTillDate?1:-1);
        System.out.println(highestStudent.get());
    }

    void groupStudentsByDept()
    {
        studentsList.stream()
                    .collect(Collectors.groupingBy(Student::getEngDepartment))
                    .forEach((department,students)->System.out.println(department+" department contains "+students.size() + " students"));
    }

    void getDepartmentPercentage()
    {
        Map<String,List<Student>> departmentStudents = studentsList.stream()
                    .collect(Collectors.groupingBy(Student::getEngDepartment));

        for (String department:departmentStudents.keySet())
        {
            OptionalDouble departmentAverage = departmentStudents.get(department)
                                                    .stream()
                                                    .mapToDouble(Student::getPerecentage)
                                                    .average();
            System.out.println(department+" department average percentage is "+departmentAverage.getAsDouble());
        }

    }

    void getYoungestStudent()
    {
        Student youngestStudent = studentsList.stream()
                            .filter(student -> student.engDepartment.equals("Electronic"))
                            .collect(Collectors.minBy(Comparator.comparing(Student::getAge))).get();

        System.out.println(youngestStudent);
    }

    void getStudentsCountCSE()
    {
        Map<Boolean,List<Student>> map = studentsList.stream()
                    .filter(student -> student.engDepartment.equals("Computer Science"))
                    .collect(Collectors.groupingBy(Student::isMale));

        System.out.println("Number of Male Students in Computer Science "+map.get(true).size());
        System.out.println("Number of female students in Computer Science "+map.get(false).size());

    }

    public static void main(String []args)
    {
        StudentList students = new StudentList();
        students.printAllDepartments();
        System.out.println("-------------");
        students.enrolledAfter2018();
        System.out.println("-------------");
        students.getComputerScienceDeptStudents();
        System.out.println("-------------");
        students.getMaleAndFemaleCount();
        System.out.println("-------------");
        students.getAverageAges();
        System.out.println("-------------");
        students.getHighestStudent();
        System.out.println("-----------");
        students.groupStudentsByDept();
        System.out.println("-----------");
        students.getDepartmentPercentage();
        System.out.println("-----------");
        students.getYoungestStudent();
        System.out.println("-----------");
        students.getStudentsCountCSE();
    }



}
