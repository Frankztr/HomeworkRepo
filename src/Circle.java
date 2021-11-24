import java.awt.*;

public class Circle {
    private double mass;
    private double density;
    private int light_Intensity;
    private int R;
    private int G;
    private int B;
    private double e=1;
    private double[] vel;
    public static int secRefresh=10;
    private double[] loc;
    private double radius=10;
    public boolean isCircle=true;
    public boolean isHorizon=false;

    private Color color;
    Circle(double density,int R,int G,int B,int light_Intensity){
        this.density=density;
        this.R=R;
        this.G=G;
        this.B=B;
        this.light_Intensity=light_Intensity;
        this.color=new Color((R*light_Intensity/100),(G*light_Intensity/100),(B*light_Intensity/100));
        this.mass=Math.pow(radius,2)*Math.PI*density;
        this.vel= new double[]{0, 0};
        this.loc=new double[]{0,0};
    }

    Circle(double density,int R,int G,int B,int light_Intensity,double locx,double locy,double vx,double vy){
        this.density=density;
        this.R=R;
        this.G=G;
        this.B=B;
        this.light_Intensity=light_Intensity;
        this.color=new Color((R*light_Intensity/100),(G*light_Intensity/100),(B*light_Intensity/100));
        this.mass=Math.pow(radius,2)*Math.PI*density;
        this.vel= new double[]{vx, vy,0};
        this.loc=new double[]{locx,locy};
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return this.radius;
    }
    public double[] getLoc(){
        return this.loc;
    }

    public double getVelX(){
        return this.vel[0];
    }
    public double getVelY(){
        return this.vel[1];
    }
    public void gravity(){
        this.vel[1]=this.vel[1]+Space.gravity*secRefresh/1000;
    }

    public void changeVelX(double velX){
        this.vel[0]=velX;
    }
    public void changeVelY(double velY){
        this.vel[1]=velY;
    }
    public void newLoc(){
        this.loc=new double[]{this.loc[0]+getVelX()*secRefresh/1000,this.loc[1]+getVelY()*secRefresh/1000};
    }
    public void returnLoc(){
        this.loc=new double[]{this.loc[0]-getVelX()*secRefresh/1000,this.loc[1]-getVelY()*secRefresh/1000};
    }
    public void slowNewLoc(){
        this.loc=new double[]{this.loc[0]+getVelX()*secRefresh/100000,this.loc[1]+getVelY()*secRefresh/100000};
    }
    public double gete(){
        return this.e;
    }
    public double getMass(){
        return mass;
    }
    public double absV(){
        return Math.sqrt(Math.pow(vel[0],2)+Math.pow(vel[1],2));
    }

    public void setLoc(double[] loc) {
        this.loc = loc;
    }
}
