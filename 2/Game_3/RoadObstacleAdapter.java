public class RoadObstacleAdapter implements Obstacle{
private final Road road;
private final String name ="Дорога";

public RoadObstacleAdapter(Road road) {
    this.road = road;
}
    @Override
    public boolean pass(Participant participant) {
        // TODO Auto-generated method stub
        return road.pass(participant);
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }
    
}
