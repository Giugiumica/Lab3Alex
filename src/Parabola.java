import java.math.*;
public class Parabola {
    //declararea parametri functie matematica
    private int a;
    private int b;
    private int c;
    public Parabola(int A,int B, int C){
        this.a=A;//curenta
        this.b=B;
        this.c=C;
    }

    public int calcParabola_x(){
        return (-b)/(2*a);
    }
    public int calcParabola_y(){
        return (-b^2)+(4*a*c)/(4*a);
    }
    @Override
    public String toString() {
        System.out.println("Expresia analitica a functiei este : ");
        return "f(x)="+ a +"x^2"+ b +"x" + c;
    }
    public String retCoordonate(int latA ,int latB, int latC){
        System.out.println("Coordonatele punctului sunt : ");
        return "("+(-latB/2*latA)+" ; "+(-latB^2+4*latA*latC/4*latA)+")";
    }

    static String retMijloc(Parabola A, Parabola B){
        System.out.println("coordonatele mijlocului segmentului de dreptă care uneşte vârfurile este : ");
        return "M=("+(A.calcParabola_x()+B.calcParabola_x())/2+";"+(A.calcParabola_y()+B.calcParabola_y())/2+")";
    }

    public Double lungParabola(Parabola A){
        System.out.println(" lungimea segmentului de dreptă care unește vârful parabolei curente cu varful parabolei transmisă este : ");
        return Math.hypot(this.calcParabola_x()-A.calcParabola_x(),this.calcParabola_y()-A.calcParabola_y());
    }

    static double lungDreapta(Parabola A, Parabola B){
        System.out.println("lungimea segmentului de dreapta ce unește vârfurile celor două parabole este : ");
        return Math.hypot(B.calcParabola_x()-A.calcParabola_x(),B.calcParabola_y()-B.calcParabola_y());
    }

}
