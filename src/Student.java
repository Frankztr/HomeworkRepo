public class Student {

    private  String name;
    private int test1;
    private int test2;
    private int test3;


    public Student(){
        name="";
        test1=0;
        test2=0;
        test3=0;
    }
    public Student(String name,int test1,int test2,int test3){
        this.name=name;
        this.test1=test1;
        this.test2=test2;
        this.test3=test3;

    }
    public void setName(String nm){
        name=nm;
    }
    public String getName(){
        return name;
    }
    public void setScore(int i, int score){
        if(i==1) test1=score;
        else if(i==2) test2=score;
        else test3=score;
    }
    public int getScore(int i){
        if(i==1) return test1;
        else if(i==2) return test2;
        else return test3;
    }

    public int getAverage(){
        return (int)Math.round((test1+test2+test3)/3.0);
    }
    public int getHighScore(){
        int highScore=test1;
        if(highScore<test2)highScore=test2;
        if(highScore<test3)highScore=test3;
        return highScore;
    }
    public String validateData(){
        if(name.length()==0){
            return "SORRY: name required";
        }else if(test1>100||test1<0){
            return "SORRY: must have 0 <= test score <= 100";
        }else if(test2>100||test2<0){
            return "SORRY: must have 0 <= test score <= 100";
        }else if(test3>100||test3<0){
            return "SORRY: must have 0 <= test score <= 100";
        }else{
            return null;
        }
    }
    @Override
    public String toString(){
        String str;
        str="Name:    "+ name + "\n"+
            "Test1:   "+ test1+ "\n"+
            "Test2:   "+test2+"\n"+
            "Test3:   "+test3+"\n"+
            "Average: "+getAverage();
        return str;
    }


}
