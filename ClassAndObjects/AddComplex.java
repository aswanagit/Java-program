class Complex {

double real;
double imag;
void add(double a,double b,double c,double d) {
real=a+c;
imag=b+d;
System.out.println("Addition of complex numbers is="+real+"+"+imag+"i");
}
}
class AddComplex {
public static void main(String args[]) {
Complex co=new Complex();
co.add(4.5,6,6.7,2.4);
}
}

    
