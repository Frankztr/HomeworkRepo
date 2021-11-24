import java.util.ArrayList;

public class Space {
    private int width;
    private int height;
    public static int secRefresh=10;
    public static double gravity=0;
    private ArrayList<Circle> list;
    Space(){
        this.width=100;
        this.height=100;
        list=new ArrayList<>();
    }
    public void add(Circle circle){
        list.add(circle);
    }

    private double distance(Circle c1,Circle c2){
        double ans=Math.sqrt(Math.pow(c1.getLoc()[0]-c2.getLoc()[0],2)+Math.pow(c1.getLoc()[1]-c2.getLoc()[1],2));
        return ans;

    }


    private boolean isCollide(Circle c1,Circle c2){
        if(distance(c1,c2)<=c1.getRadius()+c2.getRadius()){
            if(c1.absV()==0&&c2.absV()==0){
                return false;
            }else return true;
        }else{
            return false;
        }
    }

    public ArrayList<Circle> getList(){
        return this.list;
    }

    public void gravity(){
        for(int i=0;i<list.size();i++){
            if(list.get(i).isCircle){
                list.get(i).gravity();
            }
        }
    }
    public void changeLoc(){
        for(Circle circle:list){
            circle.newLoc();
        }
    }
    public void run(){
        changeLoc();
        for(Circle c1:list){
            for(Circle c2:list){
                if(isCollide(c1,c2)){
                    returnToPreCollisionState(c1,c2);
                }
            }
        }
        gravity();
    }

    private void returnToPreCollisionState(Circle c1,Circle c2){
        c1.returnLoc();
        c2.returnLoc();
        boolean k=false;
        for(int i=0;i<100;i++){
            if(isCollide(c1,c2)&&!k){
                afterCollision(c1,c2);
                k=true;
            }
            c1.slowNewLoc();
            c2.slowNewLoc();
        }
    }
    private void afterCollision(Circle c1,Circle c2){
        if(c1.isCircle&&c2.isCircle){
            double e=Math.min(c1.gete(),c2.gete());
            double[] relativeVel=new double[]{c1.getVelX()-c2.getVelX(),c1.getVelY()-c2.getVelY()};
            double Jx=-1*(1+c1.gete())*relativeVel[0]/(1/c1.getMass()+1/c2.getMass());
            double Jy=-1*(1+c1.gete())*relativeVel[1]/(1/c1.getMass()+1/c2.getMass());
            c1.changeVelX(c1.getVelX()+Jx/c1.getMass());
            c1.changeVelY(c1.getVelY()+Jy/c1.getMass());
            c2.changeVelX(c2.getVelX()-Jx/c2.getMass());
            c2.changeVelY(c2.getVelY()-Jx/c2.getMass());
        }else if(c1.isCircle&&!c2.isCircle){
            if(c1.isCircle&&c2.isHorizon){
                c1.changeVelX(c1.getVelX());
                c1.changeVelY(-1*c1.getVelY());
            }else{
                c1.changeVelX(-1*c1.getVelX());
                c1.changeVelY(c1.getVelY());
            }
        }else if(!c1.isCircle&&c2.isCircle){
            if(c1.isHorizon&&c2.isCircle){
                c2.changeVelX(c2.getVelX());
                c2.changeVelY(-1*c2.getVelY());
            }else{
                c2.changeVelX(-1*c2.getVelX());
                c2.changeVelY(c2.getVelY());
            }
        }else{
            return;
        }

    }





}