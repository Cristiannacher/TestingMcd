public class Mcd {
    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int calculoMcd() {
        int resto;
        int divisor;
        int dividendo;

        if (num1 > num2) {
            dividendo = num1;
            divisor = num2;
            if ((dividendo % divisor) == 0) {
                return divisor;
            } else {
                while (dividendo % divisor != 0) {
                    resto = dividendo % divisor;
                    dividendo = divisor;
                    divisor = resto;
                }
                return divisor;
            }
        } else {
            dividendo = num2;
            divisor = num1;
            if ((dividendo % divisor) == 0) {
                return divisor;
            } else {
                while (dividendo % divisor != 0) {
                    resto = dividendo % divisor;
                    dividendo = divisor;
                    divisor = resto;
                }
                return divisor;
            }
        }
    }
}
