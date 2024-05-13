/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author document
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student[] studentList = new Student[4];
        
        Student s1= new Student();
        s1.setName("Ritika");
        Student s2= new Student();
        s2.setName("Arshnoor");
        Student s3= new Student();
        s3.setName("Kashvi");
        Student s4= new Student();
        s4.setName("Noordeep");
                                                                                        Student s5= new Student();
        s5.setName("Muskan");
        
        studentList[0]=s1;
        studentList[1]=s2;
        studentList[2]=s3;
        studentList[3]=s4;
        studentList[4]=s5;
       
        
        
        for(Student s: studentList) {
            System.out.println(s.getName());
        }
        
        
    }
    
}
