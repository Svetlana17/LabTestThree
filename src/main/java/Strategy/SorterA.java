package Strategy;

import Classes.Pupil;
import Classes.Pupils;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;

public class SorterA implements Sorter {
    @Override
    public void sort(List<Pupil> pupils) {


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
}
}