package Command;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrintPupil {
//    public  void  printCol(Student student) throws IOException {
//        PrintPupil printPupli=new PrintPupil();
//        PrintPupilColCommand printPupilColCommand=new PrintPupilColCommand(printPupli);
//       // System.out.println("col");
//        File file=new File("command");
////++
////
//        String s="";
//        for(int i=0; i>student.getSubjectsCount(); i++){
//            s=s+ " "+ student.getSubjectAt(i)+ " " + student.getMarkAt(i);
//        }
//        String mark = "";
//        for(int i=0; i>student.getSubjectsCount(); i++) {
//            mark = mark + " " + student.getMarkAt(i);
//        }
////++
//
//        FileWriter fileWriter=new FileWriter(file, true);
//        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
//        bufferedWriter.newLine();
//        bufferedWriter.write("___________");
//        bufferedWriter.newLine();
//        bufferedWriter.write(student.getSecondName());
//        bufferedWriter.newLine();
//        bufferedWriter.write(s);
//        bufferedWriter.newLine();
//      //  bufferedWriter.write(student.getMarkAt(1)+ " ");
//        bufferedWriter.newLine();
//        bufferedWriter.close();
//  }
//    public  void  printRow(Student student){
//        PrintPupil printPupli=new PrintPupil();
//        PrintPupilRowCommand pupliRowCommand=new PrintPupilRowCommand(printPupli);
//        System.out.println("Запись выполнена");
//
//        File file = new File("command");
//        try {
////            if(file.createNewFile()){
//            String s="";
//            for(int i=0; i<student.getSubjectsCount(); i++){
//                s=s+ " "+ student.getSubjectAt(i)+ " " +student.getMarkAt(i);
//            }
//            String mark = "";
//            for(int i=0; i<student.getSubjectsCount(); i++){
//                mark=mark+ " "+ student.getMarkAt(i);
//            }
//            FileWriter fileWriter = new FileWriter(file, true);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.newLine();
//            bufferedWriter.write("___________");
//            bufferedWriter.newLine();
//            bufferedWriter.write(student.getSecondName() + " " + mark + " "  + s);
//            bufferedWriter.newLine();
//            ////++++++++++++++++++++++
////            bufferedWriter.write(student.getMarkAt(1)+ " ");
////            bufferedWriter.newLine();
////            bufferedWriter.write(student.getSubjectAt(1));
////            bufferedWriter.newLine();
//            /////+++++++++++++++
//            bufferedWriter.write("___________");
//            bufferedWriter.close();
//            //  }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
///*******
public  void  printCol(Student student) throws IOException {
    PrintPupil printPupli=new PrintPupil();
    PrintPupilColCommand printPupilColCommand=new PrintPupilColCommand(printPupli);
    // System.out.println("col");
    File file=new File("command");

    FileWriter fileWriter=new FileWriter(file, true);
    BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
    bufferedWriter.newLine();
    bufferedWriter.write("___________");
    bufferedWriter.newLine();
    bufferedWriter.write(student.getSecondName());
    bufferedWriter.newLine();

    for (int i=0; i<student.getSubjectsCount(); i++){
    bufferedWriter.write(student.getSubjectAt(i)+ " " + student.getMarkAt(i));
    bufferedWriter.newLine();}
//    bufferedWriter.write(student.getMarkAt(1)+ " ");
    bufferedWriter.newLine();
    bufferedWriter.close();
}
    public  void  printRow(Student student){
        PrintPupil printPupli=new PrintPupil();
        PrintPupilRowCommand pupliRowCommand=new PrintPupilRowCommand(printPupli);
        System.out.println("Запись выполнена");

        File file = new File("command");
        try {
//            if(file.createNewFile()){
            String s="";
            for(int i=0; i<student.getSubjectsCount(); i++){
                s=s+ " "+ student.getSubjectAt(i);
            }
            String mark = "";
            for(int i=0; i<student.getSubjectsCount(); i++){
                mark=mark+ " "+ student.getMarkAt(i);
            }
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.write("___________");
            bufferedWriter.newLine();
            bufferedWriter.write(student.getSecondName() + " " + mark + " "  + s);
            bufferedWriter.newLine();
            ////++++++++++++++++++++++
//            bufferedWriter.write(student.getMarkAt(1)+ " ");
//            bufferedWriter.newLine();
//            bufferedWriter.write(student.getSubjectAt(1));
//            bufferedWriter.newLine();
            /////+++++++++++++++
            bufferedWriter.write("___________");
            bufferedWriter.close();
            //  }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}