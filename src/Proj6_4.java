public class Proj6_4 {
    public static void main(String[] args) {
        Dice a=new Dice();
        Dice b=new Dice();
            a.roll();
            b.roll();
            if(a.getCurrentNum()+b.getCurrentNum()==7){
                System.out.println("The sum of numbers equals 7");
        }


    }
}
