public class Sit {
    public Sit[] direction;
    public String subject;
    public String text;
    public int dK;
    public int dA;
    public int dR;
    public Sit(String subject, String text, int variants, int dk, int da, int dr) {
        this.subject = subject;
        this.text = text;
        dK = dk;
        dA = da;
        dR = dr;
        direction = new Sit[variants];
    }
}
