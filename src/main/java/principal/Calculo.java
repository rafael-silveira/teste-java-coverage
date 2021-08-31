package principal;

public class Calculo {
    public int Somar(int a, int b) {
        return a+b;
    }

    public int Subtrair(int a, int b) {
        return a-b;
    }

    public int CalculoComplicado(int a, int b, int c) {
        int s1 = a+b;
        int s2 = b+c;
        int s3 = a+c;
        int s4 = s1+s2+s3;
        return s4;
    }
}
