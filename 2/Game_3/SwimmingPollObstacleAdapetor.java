public class SwimmingPollObstacleAdapetor implements Obstacle{
    private final SwimmingPoll swimmingPoll;
    private final String name ="Бассейн";

    public SwimmingPollObstacleAdapetor(SwimmingPoll swimmingPoll){
        this.swimmingPoll = swimmingPoll;
    }

    @Override
    public boolean pass(Participant participant) {
        // TODO Auto-generated method stub
        return swimmingPoll.pass(participant);
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }
}
