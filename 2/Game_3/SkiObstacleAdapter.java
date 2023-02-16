public class SkiObstacleAdapter  implements Obstacle{
    private final Ski ski;
    private final String name ="Лыжная трасса";

    public SkiObstacleAdapter(Ski ski){
        this.ski = ski;
    }

    @Override
    public boolean pass(Participant participant) {
        // TODO Auto-generated method stub
        return ski.pass(participant);
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }
    
}
