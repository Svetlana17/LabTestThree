package Command;

import java.io.IOException;

public class PrintPupilColCommand implements  Command{
    PrintPupil printPupil;
    public PrintPupilColCommand(PrintPupil printPupil) {
    this.printPupil=printPupil;
    }

    @Override
    public void execute(Student student) throws IOException {
        printPupil.printCol(student);
    }
}
