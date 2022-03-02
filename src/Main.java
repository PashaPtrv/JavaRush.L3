public class Main {

    public static void main(String[] args) {

        //Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
        //Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять.

        String text[] = {"Мама", "Мыла", "Раму"};
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < text.length; j++) {
                for (int k = 0; k < text.length; k++) {
                    if (i != j && i != k && j != k) {
                        System.out.println(text[i] + text[j] + text[k]);
                    }
                }
            }
        }
        // Так же есть более простой вариант, методом ручного перебора.
        String a= "Мама";
        String b= "Мыла";
        String c= "Раму";

        System.out.println(a+b+c);
        System.out.println(a+c+b);
        System.out.println(b+a+c);
        System.out.println(b+c+a);
        System.out.println(c+a+b);
        System.out.println(c+b+a);

    }
}



