package Command;

import java.io.IOException;

public class PrintStudent {

    public static  void main(String args[]) throws IOException{
        PrintPupil printPupil=new PrintPupil();
        Command printCol=new PrintPupilColCommand(printPupil);
        Command printRow=new PrintPupilRowCommand(printPupil);
        Student student=new Student("Ivanova", 3);
        student.setSubjectAt(0,"Geo");
        student.setSubjectAt(1, "English");
        student.setSubjectAt(2, "Biology");

        student.setMarkAt(0,5);
        student.setMarkAt(1,5);
        student.setMarkAt(2,5);
        student.setPrintCommand(printCol);
        student.setPrintCommand(printRow);
    }
}
