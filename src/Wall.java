public class Wall extends Circle {

    Wall(double density, int R, int G, int B, int light_Intensity, double locx, double locy, double vx, double vy) {
        super(density, R, G, B, light_Intensity, locx, locy, vx, vy);
        density=1000000000;
        setRadius(10);
        isCircle=false;
    }
    @Override
    public void gravity(){
        return;
    }
}
