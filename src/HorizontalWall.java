public class HorizontalWall extends Wall{
    HorizontalWall(double density, int R, int G, int B, int light_Intensity, double locx, double locy, double vx, double vy) {
        super(density, R, G, B, light_Intensity, locx, locy, vx, vy);
        isHorizon=true;
    }

}
