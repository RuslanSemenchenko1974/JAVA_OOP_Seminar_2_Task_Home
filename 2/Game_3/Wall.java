public class Wall {
    private final int height;
    public Wall(int height){
        this.height = height;
    }

      public boolean pass(CanJump canJump) {
        // TODO Auto-generated method stub
        return canJump.getJump()>=height;
    }
}
