public class Hole_2 implements RoundHole{
  private final RoundPeg peg;
  
  public Hole_2(RoundPeg peg)  {
    this.peg = peg;
  }

@Override
public double getRadius() {
    
    return peg.getRadius();
} 
}
