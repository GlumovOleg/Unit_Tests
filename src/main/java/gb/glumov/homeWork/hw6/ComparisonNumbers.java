package gb.glumov.homeWork.hw6;

public class ComparisonNumbers {

    public static boolean compareNumber(Double n1, Double n2) {

        if (n1.equals(n2)) {
            System.out.println("Средние значения равны");
        } else if (Double.compare(n1, n2) == 1) {
            System.out.println("Первый список имеет большее среднее значение");
        } else if (Double.compare(n1, n2) == -1) {
            System.out.println("Второй список имеет большее среднее значение");
        }

        return false;
    }
}

