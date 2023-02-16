public abstract class BaseParticipant implements Participant {
    private final int jump;
    private final int run;
    private final int swim;
    private final String name;
    private final int ski;

    public BaseParticipant(String name, int jump, int run, int swim, int ski) {
        this.jump = jump;
        this.name = name;
        this.run= run;
        this.swim = swim;
        this.ski = ski;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public int getRun() {
        // TODO Auto-generated method stub
        return run;
    }

    @Override
    public int getJump() {
        // TODO Auto-generated method stub
        return jump;
    }

    @Override
    public int getSwim() {
        // TODO Auto-generated method stub
        return swim;
    }
    @Override
    public int getSki() {
        // TODO Auto-generated method stub
        return ski;
    }
}

