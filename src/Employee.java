public class Employee {
    private String name;
    private int type;
    private double rate;
    private int hours;
    // Public Methods:
    public Employee(){
        name = "";
        type = 0;
        rate = 0;
        hours = 0;
    }
    public String getNameRules(){
        return "nonblank";
    }
    public String getTypeRules(){
        return "1 or 2";
    }
    public String getRateRules(){
        return "between 6.75 and 30.50, inclusive";
    }
    public String getHoursRules(){
        return "between 1 and 60, inclusive";
    }
    public boolean setName(String nm){
        if (nm.equals(""))
            return false;
        else{
            name = nm;
            return true;
        }
    }
    public boolean setType(int tp){
        if (tp != 1 && tp != 2)
            return false;
        else{
            type = tp;
            return true;
        }
    }
    public boolean setRate(double rt){
        if (!(6.75 <= rt && rt <= 30.50))
            return false;
        else{
            rate = rt;
            return true;
        }
    }
    public boolean setHours(int hrs){
        if (!(1 <= hrs && hrs <= 60))
            return false;
        else{
            hours = hrs;
            return true;
        }
    }
    public String getName(){
        return name;
    }
    public double getPay(){
        double pay;
        if (hours <= 40 || type == 2)
            pay = rate * hours;
        else
            pay = rate * 40 + rate * 2 * (hours - 40);
        return pay;
    }
}
