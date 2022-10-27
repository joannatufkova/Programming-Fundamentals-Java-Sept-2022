package ObjectAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
    static class Student{
        String firstName;
        String lastName;
        int age;
        String hometown;

        public Student(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getHometown() {
            return hometown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentsList = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandArr = command.split("\\s+");

            String firstName = commandArr[0];
            String lastName = commandArr[1];
            String age = commandArr[2];
            String hometown = commandArr[3];

            if(isStudentExisting(studentsList,firstName,lastName)){
                Student student = getStudent(studentsList,firstName,lastName);

                student = new Student(firstName, lastName, Integer.parseInt(age), hometown);
            } else {
                Student student = new Student(firstName, lastName, Integer.parseInt(age), hometown);
                studentsList.add(student);
            }
            command = scanner.nextLine();
        }

        String cityName = scanner.nextLine();
        for (Student student : studentsList) {
            if(student.getHometown().equals(cityName)){
                System.out.printf("%s %s is %d years old%n", student.getFirstName(),student.getLastName(), student.getAge());
            }
        }
    }

    private static boolean isStudentExisting(List<Student> studentsList, String firstName,String lastName){
        for(Student student : studentsList){
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }

    private static Student getStudent(List<Student> studentsList, String firstName, String lastName){
        Student existingStudent = null;

        for(Student student : studentsList){
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                existingStudent = student;
            }
        }
        return  existingStudent;
    }
}
