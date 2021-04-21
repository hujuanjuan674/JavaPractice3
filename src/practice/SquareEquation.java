package practice;
public class SquareEquation {
    double a,b,c;
    double root1,root2;
    boolean boo;
    public SquareEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
        if(a!=0)
            boo=true;
        else
            boo=false;
    }
    public void getRoots(){
        if(boo){
            double disk=b*b-4*a*c;
            if(disk>=0){
                root1=(-b+Math.sqrt(disk))/(2*a);
                root2=(-b-Math.sqrt(disk))/(2*a);
                System.out.printf("方程的根:%f,%f\n",root1,root2);
            }
            else{
                System.out.println("方程没有实根\n");
            }
        }
        else{
            System.out.println("不是一元二次方程");
        }
    }
    public void setCoefficient(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
        if(a!=0)
            boo=true;
        else
            boo=false;
    }

    public static class SunRise {
        public static void main(String args[]){
            SquareEquation equation=new SquareEquation(4,5,1);
            equation.getRoots();
            equation.setCoefficient(-3,4,5);
            equation.getRoots();
        }
    }
}
