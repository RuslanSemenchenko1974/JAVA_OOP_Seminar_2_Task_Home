public class WallObstacleAdapter implements Obstacle{
    private final Wall wall;
    private final String name ="Стена";


public WallObstacleAdapter (Wall wall){
this.wall = wall;
}
@Override
public boolean pass(Participant participant) {
    // TODO Auto-generated method stub
    return wall.pass(participant);
}
@Override
public String getName() {
    // TODO Auto-generated method stub
    return name;
}
}
