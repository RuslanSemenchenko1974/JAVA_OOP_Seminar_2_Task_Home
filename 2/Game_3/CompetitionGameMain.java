/**
 * CompetitionGameMain
 */
public class CompetitionGameMain {

    public static void main(String[] args) {

        Obstacle[] obstacles = createObstacles();
        Participant[] participants = createParticipants();

        for(Participant participant:participants){
            for(Obstacle obstacle:obstacles){
                boolean result = obstacle.pass(participant);
                if(result){
                    System.out.println("Участник " + participant.getName()+" преодолел препятствие : " + obstacle.getName());
                }
                else{System.out.println("Участник " + participant.getName()+" НЕ преодолел препятствие" + obstacle.getName());}
            }
        }
        
        
    }
    private static Obstacle[] createObstacles() {
        return new Obstacle[]{
            new RoadObstacleAdapter(new Road(100)), 
            new RoadObstacleAdapter(new Road(45)), 
            new SwimmingPollObstacleAdapetor(new SwimmingPoll(20)), 
            new WallObstacleAdapter(new Wall(40)),
            new SkiObstacleAdapter(new Ski(10))
        };
    }
    private static Participant[] createParticipants(){
        return new Participant[] {
            new StandartParticipant("Igor", 40, 50, 20, 15),
            new Cat("Murzik", 60, 25),
            new Cheater("Cheater")
        };
    }
}