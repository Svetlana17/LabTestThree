package Strategy;

import Classes.Pupil;
import Classes.Pupils;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;

public class SorterA implements Sorter {
    @Override
    public void sort(List<Pupil> pupils) {


//
//    @Override
//    public void sort(List<Pupil> pupils) {
//        pupils.sort((o1, o2) -> Pupils.calculateAverageMark(o1) > Pupils.calculateAverageMark(o2) ? -1: 1);//вызов метода sort
//////
//
//
SortUtils.sort(pupils, list -> {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                Pupil pupil1 = pupils.get(j);
                Pupil pupil2 = pupils.get(j + 1);
                if (Pupils.calculateAverageMark(pupil1) > Pupils.calculateAverageMark(pupil2)) {
                    swap(pupils, j, j + 1);
                }
            }
        }
    });
      //  System.out.println("Sorted asc:");
//    Pupils.calculateAverageMark((Pupil) pupils);
}
}