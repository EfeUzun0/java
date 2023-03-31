public class islem {
    private double sayi1, sayi2;
    private islem(double birinci, double ikinci) {
        this.sayi1 = birinci;
        this.sayi2 = ikinci;
    }

    public double topla() {
        return this.sayi1 + this.sayi2;
    }

    public double cikar() {
        return this.sayi1 - this.sayi2;
    }

    public double bol() {
        return this.sayi1 / this.sayi2;
    }

    public double carp() {
        return this.sayi1 * this.sayi2;
    }
}
