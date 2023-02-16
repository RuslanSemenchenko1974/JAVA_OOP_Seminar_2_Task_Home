public class Ski {
    private final int distance;
    
    public Ski(int distance){
        this.distance = distance;
    }

      public boolean pass(CanSki canSki) {
        // TODO Auto-generated method stub
        return canSki.getSki()>=distance;
}
}
