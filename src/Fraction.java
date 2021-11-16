public class Fraction {
    final private int numerator;
    final private int denominator;
    Fraction(int n,int d){
        numerator=n;
        denominator=d;
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }


    Fraction add(Fraction b){
        int num=this.getNumerator()*b.getDenominator()+b.getNumerator()*this.getDenominator();
        int den=this.denominator*b.getDenominator();
        return new Fraction(num,den);
    }
    Fraction subtract(Fraction b){
        int num=this.getNumerator()*b.getDenominator()-b.getNumerator()*this.getDenominator();
        int den=this.denominator*b.getDenominator();
        return new Fraction(num,den);
    }
    Fraction multiply(Fraction b){
        int num = this.getNumerator()*b.getNumerator();
        int den=this.getDenominator()*b.getDenominator();
        return new Fraction(num,den);
    }
    Fraction divide(Fraction b){
        int num=this.getNumerator()*b.getDenominator();
        int den= this.getDenominator()*b.getNumerator();
        return new Fraction(num,den);
    }
    @Override
    public String toString(){
        return numerator+ "\n-\n"+denominator;
    }


}
