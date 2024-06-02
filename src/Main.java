public class Main {
    public static void main(String[] args) {
        byte ogurez = 1;
        System.out.println("Значение переменной ogurez с типом byte равно " + ogurez);
        short banana = 1000;
        System.out.println("Значение переменной banana с типом short равно " + banana);
        int pomidor = 10000000;
        System.out.println("Значение переменной pomidor с типом int равно " + pomidor);
        long pomelo = 1231231231;
        System.out.println("Значение переменной pomelo с типом long равно " + pomelo);
        double mandarin = 5.5;
        System.out.println("Значение переменной mandarin с типом double равно " + mandarin);
        float tikwa = 2.2f;
        System.out.println("Значение переменной tikwa с типом float равно " + tikwa);

        //2 задание

        int qwe = 27897;
        long qweqwe =  987678965549L;
        double asd = 2.786;
        short asdasd = 569;
        short zxc = -159;
        short zxczxc = 27897;
        byte iuyg = 67;
        float asdasda = 27.12f;

        //3 задание

        byte Luda = 23;
        byte Anna = 27;
        byte Ekater = 30;
        short paperAll = 480;
        int sum = Luda + Anna + Ekater;
        int paper = paperAll/sum;
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги.");

        //4 задание

        byte bottleMin =16/2;
        int bottle20Min = bottleMin * 20;
        System.out.println("За 20 минут машина произвела " + bottle20Min + " бутылок.");
        int bottleHour = bottleMin * 3;
        int bottleDay = bottleHour * 24;
        System.out.println("За сутки машина произвела " + bottleHour + " бутылок.");
        int bottle3Day = bottleHour * 72;
        System.out.println("За 3 дня машина произвела " + bottle3Day + " бутылок.");
        int bottleMonth = bottleDay * 30;
        System.out.println("За месяц машина произвела " + bottleMonth + " бутылок.");

        //5 задание

        byte cansAll = 120;
        byte cansWhite = 2;
        byte cansBrown = 4;
        int classAll = cansAll/(cansBrown+cansWhite);
        int allWhite = classAll * cansWhite;
        int allBrown = classAll * cansBrown;
        System.out.println("В школе, где " + classAll + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");

        //6 задание

        byte bananas = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        int breakfastGram = bananas * 5 + milk * 2 + iceCream * 2 + egg * 4;
        System.out.println("Спортивный завтрак в граммах: " + breakfastGram);
        int grPerKg = 1000;
        float breakfastKg = breakfastGram/(float)grPerKg;
        System.out.println("Спортивный завтрак в килограммах: " + breakfastKg);

        //7 задание
        byte kgAll = 7;
        float diet1 = 250/(float)grPerKg;
        float diet2 = 500/(float)grPerKg;
        float diet1Day = kgAll/diet1;
        float diet2Day = kgAll/diet2;
        System.out.println(diet1Day + " дней может потреьбоваться если худеть на 250 грамм в день");
        System.out.println(diet2Day + " дней может потреьбоваться если худеть на 500 грамм в день");
        float dietSum = diet1Day + diet2Day;
        float daySr = dietSum/2;
        System.out.println(daySr + " дней может потребоваться в среднем");

        //8 задание

        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        int procent1 = (masha * 10)/100;
        int mashaZp = masha + procent1;
        int procent2 = (denis * 10)/100;
        int denisZp = denis + procent2;
        int procent3 = (kris * 10)/100;
        int krisZp = kris + procent3;
        int mashaYear = mashaZp * 12 - masha * 12;
        int denisYear = denisZp * 12 - denis * 12;
        int krisYear = krisZp * 12 - kris * 12;
        System.out.println("Маша теперь получает " + mashaZp + " рублей. Годовой доход вырос на " + mashaYear + " рублей." );
        System.out.println("Денис теперь получает " + denisZp + " рублей. Годовой доход вырос на " + denisYear + " рублей." );
        System.out.println("Кристина теперь получает " + krisZp + " рублей. Годовой доход вырос на " + krisYear + " рублей." );






















    }
}