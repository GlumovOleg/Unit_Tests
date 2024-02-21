package gb.glumov.homeWork.hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListsNumbers {

    public static List<Integer> listNumbers() {

        Random random = new Random();
        List<Integer> listGenerate = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            int randomNum = random.nextInt(50) + 1;
            listGenerate.add(randomNum);
        }

        return listGenerate;
    }


}