package Memento;

import Command.Student;

import java.io.IOException;

public class SerilazeStudent {
    public static  void main(String args[]) throws IOException, ClassNotFoundException {


        Student student2=new Student("Ivanova",3);
        student2.setSubjectAt(0, "OOP");
        student2.setSubjectAt(1, "Math");
        student2.setSubjectAt(2, "PO");
        student2.setMarkAt(0, 5);
        student2.setMarkAt(1, 5);
        student2.setMarkAt(2, 5);

        student2.createMemento();//cлепок тек.объекта

        System.out.println(student2.toString());
        student2.setSecondName("Jons");//изм. состояние
        student2.setMarkAt(0, 3);//изм. состояние
        student2.setSubjectAt(0, "Fisic");//изм. состояние
        System.out.println(student2.toString());
        student2.setMemento();//вернула состояние
        System.out.println(student2.toString());
}}