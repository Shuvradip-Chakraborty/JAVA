
class Student {
    int rollno;
    String name;
    float marks;
}



public class ArrayOfObjects{
    public static void main(String[] args) {
        
///creating objects of class Student..
        Student s1 = new Student();
        s1.rollno = 34;
        s1.name = "Shuvradip";
        s1.marks = 88.06f;

        Student s2 = new Student();
        s2.rollno = 36;
        s2.name = "babai";
        s2.marks = 88;

        Student s3 = new Student();
        s3.rollno = 40;
        s3.name = "Babu";
        s3.marks = 87.04f;

//now i want to store the objects in an array with type "Student": means s1,s2, s3 will be the part of the students array..
        Student students[] = new Student[3]; //array 

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

//now printing the array..(using normal for loop)
        for(int i=0; i<students.length;  i++){
            System.out.println(students[i].name + " , " + students[i].rollno + " , " + students[i].marks );
        }



//now printing the array using enhanced for loop.
        for(Student stud: students){
            System.out.println(stud.name + " , " + stud.rollno + " , " + stud.marks );
        }
    }
}