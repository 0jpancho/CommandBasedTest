package frc.robot.util;

public class PIDF{

    double p;
    double i;
    double d;
    double f;

    public PIDF(double p, double i, double d, double f){
        this.p = p;
        this.i = i;
        this.d = d;
        this.f = f;
    }

    public double getP(){
        return p;
    }

    public double getI(){
        return i;
    }

    public double getD(){
        return d;
    }

    public double getF(){
        return f;
    }
}