package string;

public class StringHandler {
    private String half1;
    private String half2;

    public void lineProcessing(String line) {
        splitHalf(line);
        String[] firstHalfArray = splitByDot(half1);
        printArrayString(firstHalfArray);
        String[] secondHalfArrayMod = dotLastSymbolOfFirstHalf(line, splitByDot(half2));
        printArrayString(secondHalfArrayMod);
    }

    private void splitHalf(String line) {
        String s = checkStringLengthParity(line);                   // перевірка на парну довжину рядка
        half1 = s.substring(0, s.length() / 2);                          // розділення на 2 рівних підрядків
        half2 = s.substring(s.length() / 2);
    }

    private static String checkStringLengthParity(String s) {
        if ((s.length() % 2) != 0) s += " ";
        return s;
    }

    private String[] splitByDot(String s) {
        return s.split("\\. ", -1);
    }

    private void printArrayString(String[] half) {
        for (int i = 0; i < half.length - 1; i++) {              // повернення крапок на кінці речень
            half[i] += ".";
            System.out.println(half[i]);
        }
        System.out.print(half[half.length - 1]);
    }

    private boolean isHalfLengthCharacterDot(String line) {
        return line.charAt(line.length() / 2) == '.';
    }

    private String[] dotLastSymbolOfFirstHalf(String line, String[] half) {
        if (isHalfLengthCharacterDot(line)) {                              // випадок, коли крапка прийшлась на останній символ у першому підрядку
            System.out.println();                                           // наступне речення з нового рядка
            half[0] = half[0].substring(1);                       // видалення зайвого пробілу перед реченням
        }
        return half;
    }

}
