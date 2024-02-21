package gb.glumov.homeWork.hw6;

import java.util.List;

public class AverageList {
    public static double average(List<Integer> list) {
        return list.stream()
                .mapToInt(n -> n)
                .average().orElse(0);
    }
}

