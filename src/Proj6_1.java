public class Proj6_1 {
    public static void main(String[] args) {
        Student a=new Student("Frank",1,10,3);
        System.out.println(a);
        System.out.println(a.getAverage());
        System.out.println(a.getHighScore());
        System.out.println(a.getName());
        System.out.println(a.getScore(2));
        System.out.println(a.validateData());
    }
}
