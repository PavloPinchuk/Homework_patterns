package Homework5.Task1.Equations;

public class QuadraticEquation extends LinearEquation {
    protected double a;

    public QuadraticEquation(double[] coefficients) {
        super(new double[]{coefficients[1],coefficients[2]});
        this.a = coefficients[0];
    }

    public QuadraticEquation(QuadraticEquation other){
        super(new double[]{other.b,other.c});
        this.a = other.a;

    }
    @Override
    public double[] solve(){
        if(a==0){
            return super.solve();
        }
        double D = b*b - 4*a*c;
        if(D<0){
            throw new ArithmeticException("The equation has zero roots");
        } else if (D==0) {
            return new double[]{-b/(2*a)};
        }else{
            return new double[]{(-b+Math.sqrt(D)/(2*a)),(-b-Math.sqrt(D)/(2*a))};
        }
    }

    @Override
    public void printEquation() {
        System.out.println(a+"x^2+"+b+"x+"+c+"=0");
    }

    @Override
    public EquationInterface clone() {
        return new QuadraticEquation(this);
    }
}
