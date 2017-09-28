import javax.swing.*;
import java.awt.*;

public class Align extends JFrame
{

   private JPanel check;
   private JPanel axes;
   private JPanel buttons;

   private JCheckBox check1;
   private JCheckBox check2;

   private JLabel yLabel;
   private JLabel xLabel;

   private JTextField txtFx;
   private JTextField txtFy;

   private JButton okButton;
   private JButton cancelButton;
   private JButton clearButton;

   public Align()
   {
      super("Align");
      

      // Exit the application when the window is closed
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);

      // /1
      check = new JPanel();
      check.setLayout(new BoxLayout(check, BoxLayout.Y_AXIS));

      check1 = new JCheckBox("Exit on OK");
      check2 = new JCheckBox("Exit on Cancel");
      check.add(check1);
      check.add(check2);

      // /2
      axes = new JPanel();
      axes.setPreferredSize(new Dimension(10, 25));
      

      xLabel = new JLabel("X");

      axes.add(xLabel);
      txtFx = new JTextField(5);
      axes.add(txtFx);

      yLabel = new JLabel("Y");
      axes.add(yLabel);
      txtFy = new JTextField(5);

      axes.add(txtFy);

      // /3
      buttons = new JPanel();

      okButton = new JButton("OK");
      okButton.setPreferredSize(new Dimension(100, 25));
      buttons.add(okButton, BorderLayout.NORTH);

      cancelButton = new JButton("Cancel");
      cancelButton.setPreferredSize(new Dimension(100, 25));
      buttons.add(cancelButton, BorderLayout.CENTER);

      clearButton = new JButton("Clear");
      clearButton.setPreferredSize(new Dimension(100, 25));
      buttons.add(clearButton, BorderLayout.SOUTH);

      buttons.setPreferredSize(new Dimension(140, 200));
      buttons.add(okButton);
      buttons.add(cancelButton);
      buttons.add(clearButton);

      add(check);
      add(axes);
      add(buttons);

      add(check, BorderLayout.WEST);
      add(axes, BorderLayout.CENTER);
      add(buttons, BorderLayout.EAST);
      setVisible(true);
      setResizable(false);
      setSize(330, 150);
   }

   public static void main(String[] args)
   {
      Align align = new Align();

   }

}
