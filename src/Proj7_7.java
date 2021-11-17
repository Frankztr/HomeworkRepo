import java.util.ArrayList;

public class Proj7_7 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Double>> Arraylists=new ArrayList<>();
        ArrayList<ArrayList<Double>> anotherArraylists=new ArrayList<>();
        System.out.print("     ");
        for (int i=1;i<=10;i++){
            System.out.print(i+"     ");
        }
        System.out.println();
        for(int width=1;width<=10;width++){
            ArrayList<Double> perimeters=new ArrayList<>();
            ArrayList<Double> areas=new ArrayList<>();
            Arraylists.add(perimeters);
            anotherArraylists.add(areas);
            for(int height=1;height<=10;height++){
                perimeters.add(2.0*(width+height));
                areas.add(width*height*1.0);
            }
            System.out.print(width+"  ");
            System.out.println(perimeters);
        }
        System.out.print("    ");
        for (int i=1;i<=10;i++){
            System.out.print(i+"    ");
        }
        System.out.println();
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+"  ");
            System.out.println(anotherArraylists.get(i-1));
        }
    }
}
