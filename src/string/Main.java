package string;

/**
 * Необхідно створити рядок із текстом (текст взяти будь-який з інтернету).
 * Розбити цей рядок на 2 підрядки рівної довжині та вивести на екран кожну речення з нового рядка.
 */

public class Main {
    public static void main(String[] args) {
        String s = "Сьогодні я – у Вашингтоні, щоб подякувати американському народові, Президенту та Конгресу за таку необхідну підтримку. А також продовжити співпрацю для наближення нашої перемоги. Проведу низку переговорів для зміцнення стійкості й обороноздатності України. Зокрема, із Президентом США Джозефом Байденом обговоримо двосторонню співпрацю України і Сполучених Штатів Америки.";
        StringHandler stringHandler = new StringHandler();
        stringHandler.lineProcessing(s);
    }
}
