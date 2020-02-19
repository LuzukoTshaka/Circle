import javax.swing.*;

public class CircleMain {


    public static void main (String [] args) {



        Circle cr = new Circle();


        String change1= JOptionPane.showInputDialog("ENTER RADIUS");

        double radius = Double.parseDouble(change1);

        cr.setradius(radius);
        //cr.display();

        JOptionPane.showMessageDialog(null,cr.toString());


    }
}
