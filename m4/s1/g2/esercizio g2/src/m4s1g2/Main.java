package m4s1g2;

public class Main {

    public static boolean PariDispari(String str) {
        if(str.length() % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int year) {
        if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String PrintNumber(int n) {
        String result;
        switch (n) {
            case 0: {
                result = "zero";
                break;
            }
            case 1: {
                result = "uno";
                break;
            }
            case 2: {
                result = "due";
                break;
            }
            case 3: {
                result = "tre";
                break;
            }
            default:
                result = "Il numero è maggiore di 3";
        }
        return result;
    }

    public static void main(String[] args) {
        boolean result1 = PariDispari("parola");
        System.out.println(result1);

        boolean result2 = annoBisestile(2023);
        System.out.println(result2);

        String result3 = PrintNumber(4);
        System.out.println(result3);
    }

}
