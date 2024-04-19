package classi;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo();
        rettangolo1.setAltezza(10);
        rettangolo1.setLarghezza(20);
        printRettangolo(rettangolo1);

        Rettangolo rettangolo2 = new Rettangolo();
        rettangolo2.setAltezza(5);
        rettangolo2.setLarghezza(10);
        printRettangolo(rettangolo2);

        printTwo(rettangolo1, rettangolo2);
    }
    public static void printRettangolo(Rettangolo r1) {
        System.out.println("area R1:" + r1.area());
        System.out.println("perimetro R1:" + r1.perimetro());

    }
    public static void printTwo(Rettangolo r1, Rettangolo r2) {
        int sumArea = r1.area() + r2.area();
        int sumPerimetro = r1.perimetro() + r2.perimetro();

        System.out.println("area R2:" + r2.area());
        System.out.println("perimetro R2:" + r2.perimetro());

        System.out.println("somma delle aree:" + sumArea);
        System.out.println("somma dei perimetri:" + sumPerimetro);
    }
}