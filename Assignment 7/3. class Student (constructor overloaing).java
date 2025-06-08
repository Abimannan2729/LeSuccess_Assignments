import java.util.*;
class Student{
    String name;
    int rollno;
    Student(int rollno, String name){
        this.name=name;
        this.rollno= rollno;
    }
    Student(int rollno){
        this.name="UNKNOWN";
        this.rollno= rollno;
    }
    void display(){
        System.out.println(rollno);
        System.out.println(name);
        System.out.println();
    }
}
public class Main
{
	public static void main(String[] args) {
	   Student s1= new Student(1,"Abimannan");
	   Student s2= new Student(2);
	   s1.display();
	   s2.display();
	}
}
