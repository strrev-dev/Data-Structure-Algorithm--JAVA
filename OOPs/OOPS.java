public class OOPS {
    public static void main(String[] args){
        //creating object constructor

        Pen P1 =new Pen();
        P1.setColor("Blue");
        P1.setTip(5);
        System.out.println(P1.Color + " and " + P1.Tip);
        P1.Color = "Red";
        System.out.println(P1.Color + " and " + P1.Tip);
    }

}
class Pen {
    String Color;
    int Tip;

    void setColor (String newColor){
        Color = newColor;

    }
    void setTip(int newTip){
        Tip = newTip;
    }
}
