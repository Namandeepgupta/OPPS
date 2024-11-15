public class PracticeQuestion1{
    public static void main(String args[]){
        Complex c1 = new Complex(8,7);
        Complex c2 = new Complex(2, 3);
        
        Complex c3 = Complex.add(c1,c2);
        Complex c4 = Complex.sub(c1,c2);
        Complex c5 = Complex.mul(c1,c2);

        c3.printComplex();
        c4.printComplex();
        c5.printComplex();
    }
}
class Complex{
    int real;
    int img;
        
    Complex(int r, int i){
        real = r;
        img = i;
    }

    public static Complex add(Complex a, Complex b){
        return new Complex ((a.real + b.real) , (a.img + b.img));
    }

    public static Complex sub(Complex a, Complex b){
        return new Complex ((a.real - b.real) , (a.img - b.img));
    }

    public static Complex mul(Complex a, Complex b){
        return new Complex( ((a.real * b.real) - (a.img * b.img)) , 
                            ((a.real * b.img) + (a.img * b.real)) );
    }

    public void printComplex(){
        if(real == 0 && img != 0){
            System.out.println(img + "i");
        }
        else if(real != 0 && img == 0){
                System.out.println(real);
        }
        else{
            System.out.println(real + " + " + img + "i");
        }
    }
}