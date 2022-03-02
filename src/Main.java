public class Main {

    public static void main(String[] args) {

        //Вывести на экран произведение чисел от 1 до 10.
        //Подсказка: будет три миллиона с хвостиком
        int currentSum = 1;
        for (int i = 1; i < 11; i++){
            currentSum *= i;
        } System.out.println(currentSum);


        //Вывести на экран сумму чисел от 1 до 10 построчно:
        int currentNum = 0;
        for (int j = 1; j <= 10; j++){
           currentNum += j;
           System.out.println(currentNum);
        }
    }


}
