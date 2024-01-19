package org.example;

import java.util.LinkedList;
import java.util.List;

public class Student{
    String name;
    int marks;
    int rollno;
    public Student(String name,int marks,int rollno)
    {
        this.name=name;
        this.marks=marks;
        this.rollno=rollno;
    }
    public int getMarks()
    {
        return marks;
    }
    public int getRollno()
    {
        return rollno;
    }
    public String getName()
    {
        return name;
    }
    public static String getMaxMarksName(List<Student> list)
    {
        String name="";
        int maxMarks=Integer.MIN_VALUE;

for(int i=0;i< list.size();i++)
{
    if(list.get(i).getMarks()>maxMarks)
    {
maxMarks=list.get(i).getMarks();
name=list.get(i).getName();
    }

}
return name;
    }


    public static void main(String[] args) {
        Student s=new Student("thomas",76,20);
        Student s1=new Student("jack",80,21);
        Student s2=new Student("maxwell",90,22);
        List<Student> list=new LinkedList<>();
        list.add(s);
        list.add(s1);
        list.add(s2);
        System.out.println(getMaxMarksName(list));
    }
}