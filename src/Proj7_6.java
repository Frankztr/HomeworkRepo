public class Proj7_6 {
    public static void main(String[] args) {
        Dice a =new Dice();
        int tot=0;

        for(int i=0;i<100;i++){
            a.roll();
            tot+=a.getCurrentNum();

        }
        System.out.println(tot/100.0);
    }
}
