package string;

public class Main {
    public static void main(String[] args) {
        String s = "Сьогодні я – у Вашингтоні, щоб подякувати американському народові, Президенту та Конгресу за таку необхідну підтримку. А також продовжити співпрацю для наближення нашої перемоги. Проведу низку переговорів для зміцнення стійкості й обороноздатності України. Зокрема, із Президентом США Джозефом Байденом обговоримо двосторонню співпрацю України і Сполучених Штатів Америки.";
        if (s.length() % 2 != 0) s += " ";                              // перевірка на парну довжину рядка
        int intMiddle = s.length() / 2;
        String half1 = s.substring(0, intMiddle);                          // розділення на 2 рівних підрядків
        String half2 = s.substring(intMiddle);
        System.out.println("Перевірка на рівність підрядків" + half1.length() + " = " + half2.length());     // перевірка рівності підрядків
        String[] sentencesHalf1 = half1.split("\\. ", -1);     // розділення підрядків на речення за допомогою родільника крапки, як кінця речення. Шаблон пошуку використовується стільки разів, скільки можливо
        for (int i = 0; i < sentencesHalf1.length - 1; i++) {              // повернення крапок на кінці речень
            sentencesHalf1[i] += ".";
            System.out.println(sentencesHalf1[i]);
        }
        System.out.print(sentencesHalf1[sentencesHalf1.length - 1]);         // виведення останнього елементу масиву без крапки на кінці

        String[] sentencesHalf2 = half2.split("\\. ", -1);
        if ((s.charAt(intMiddle - 1) == '.')) {                              // випадок, коли крапка прийшлась на останній символ у першому підрядку
            System.out.println();                                           // наступне речення з нового рядка
            sentencesHalf2[0] = sentencesHalf2[0].substring(1);    // видалення зайвого пробілу перед реченням
        }
        for (int i = 0; i < sentencesHalf2.length - 1; i++) {
            sentencesHalf2[i] += ".";
            System.out.println(sentencesHalf2[i]);
        }
        System.out.print(sentencesHalf2[sentencesHalf2.length - 1]);
    }
}
