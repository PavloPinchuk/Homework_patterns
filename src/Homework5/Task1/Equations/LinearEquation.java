package Homework5.Task1.Equations;

public class LinearEquation implements EquationInterface {
    protected double b;
    protected double c;

    public LinearEquation(double[] coefficients) {
        this.b = coefficients[0];
        this.c = coefficients[1];
    }

    public LinearEquation(LinearEquation other){
        this.b = other.b;
        this.c = other.c;

    }

    @Override
    public double[] solve() {
        if(b==0 && c==0){
            throw new ArithmeticException("The equation has an infinite number of roots");
        } else if (b == 0) {
            throw new ArithmeticException("The equation has zero roots");
        }else{
            return new double[]{-c/b};
        }


    }

    @Override
    public void printEquation() {
        System.out.println(b+"x+"+c+"=0");
    }

    @Override
    public EquationInterface clone() {
        return new LinearEquation(this);
    }
}
