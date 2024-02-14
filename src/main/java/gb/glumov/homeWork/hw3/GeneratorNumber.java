package gb.glumov.homeWork.hw3;

import java.util.Random;

public class GeneratorNumber {

    public static boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли переданное число в интервал (25;100)
    public static boolean numberInInterval() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Рандомное число : " + randomNumber);
        if (randomNumber >= 25 && randomNumber <= 100){
            System.out.println("Число попадает в заданный интервал от 25 до 100");
        }
        else {
            throw new RuntimeException("Ошибка, число не попадает в интервал от 25 до 100");
        }
        return false;
    }

}


