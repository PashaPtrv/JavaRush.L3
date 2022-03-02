public class Main {

    public static void main(String[] args) {
        //Вывести на экран дату своего рождения в виде: MAY 1 2012, как вариант ниже.
        System.out.println("FEBRUARY 10 1996");

        //Создать 10 зергов, 5 протосов и 12 терран.
        //Дать им всем уникальные имена.
        Zerg zerg[] = new Zerg[10];
        for (int i = 0; i < 10; i++){
            zerg[i] = new Zerg();
            zerg[i].name = "zerg" + (i+1);
        }

        Protos protos[] = new Protos[5];
        for (int j = 0; j < 5; j++){
            protos[j] = new Protos();
            protos[j].name = "protos" + (j+1);
        }

        Terran terran[] = new Terran[12];
        for (int k = 0; k < 12; k++){
            terran[k] = new Terran();
            terran[k].name = "terran" + (k+1);
            System.out.println(terran[k].name);

        }

    }
    public static class Zerg{

        public String name;
    }
    public static class Protos{

        public String name;
    }
    public static class Terran{

        public String name;
    }

}
