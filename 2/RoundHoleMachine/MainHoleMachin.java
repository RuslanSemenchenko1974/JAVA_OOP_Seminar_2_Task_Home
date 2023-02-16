public class MainHoleMachin {
    public static void main(String[] args) {
        RoundPeg  a = new Peg(10);
        RoundHoleMachine b = new RoundHoleMachine();
        RoundHole c = b.method(a);
        System.out.println(c.getRadius());

    }
}
