package gb.glumov.homeWork.hw6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(10, 5, 7, 9, 5, 15, 13));
        System.out.println("Первый список : " + list1);
        List<Integer> list2 = new ArrayList<>(List.of(11, 5, 8, 3, 8, 14, 12));
        System.out.println("Второй список : " + list2);
        System.out.println();

        double avarage1 = AverageList.average(list1);
        System.out.println("Среднее значение первого списка : " + avarage1);
        double avarage2 = AverageList.average(list2);
        System.out.println("Среднее значение второго списка : " + avarage2);
        System.out.println();

        ComparisonNumbers.compareNumber(avarage1, avarage2);
    }
}
