public class Dice {
    private int currentNum;
    Dice(){
        currentNum=1;
        roll();
    }
    public int getCurrentNum(){
        return currentNum;
    }
    public void roll(){
        currentNum=(int)(Math.random()*5+1);
    }

}
