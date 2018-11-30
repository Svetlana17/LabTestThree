package Command;

import java.io.IOException;

public  class PrintPupilRowCommand implements Command {
    PrintPupil printPupil;
    public  PrintPupilRowCommand(PrintPupil printPupil){
        this.printPupil=printPupil;
    }

    @Override
    public void execute(Student student)  {
        printPupil.printRow(student);

    }
}
