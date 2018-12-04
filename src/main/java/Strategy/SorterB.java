package Strategy;

import Classes.Pupil;
import Classes.Pupils;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;

// сортировка простым обменом
public class SorterB implements Sorter {

//    @Override
//    public void sort(List<Pupil> pupils) {
//
//        for(int i = 0; i < pupils.size(); i++){
//            int f = 0;
//            for(int y = 0; y < pupils.size() - i; y++){
//                Pupil p1 = pupils.get(y);
//                Pupil p2 = pupils.get(y + 1);
//                if( avg(p1) > avg(p2) ){
//                    pupils.set(y, p2);
//                    pupils.set(y + 1, p1);
//                    f++;
//                }
//            }
//            if(f == 0) break;
//        }
//    }

    private double avg(Pupil pupil){
        return Pupils.calculateAverageMark(pupil);
    }

    @Override
    public void sort(List<Pupil> pupils) {
        SortUtils.sort(pupils, list -> {
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size() - 1; j++) {
                    Pupil pupil1 = pupils.get(j);
                    Pupil pupil2 = pupils.get(j + 1);
                    if (Pupils.calculateAverageMark(pupil1) < Pupils.calculateAverageMark(pupil2)) {
                        swap(pupils, j, j + 1);
                    }
                }
            }
        });
      //  System.out.println("Sorted desc:");
        printPupilsAvgMarks(pupils);
    }
    private static void printPupilsAvgMarks(List<Pupil> pupils) {
        double[] avg = new double[pupils.size()];
        for (int i = 0; i < pupils.size(); i++) {
            avg[i] = Pupils.calculateAverageMark(pupils.get(i));
        }
       // System.out.println(Arrays.toString(avg));
    }
    //меняет местами эл.массива
    private static <T> void swap(List<T> list, int i, int j) {
        T swap = list.get(i);
        list.set(i, list.get(j));
        list.set(j, swap);
    }
}

//}
