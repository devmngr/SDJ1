import javax.swing.*;

import java.awt.*;
import java.util.*;

public class Calculator extends JFrame
{ 
   private JPanel pnl1;
   private JTextField textField;
   private JButton   button0;
   private JButton   button1;
   private JButton   button2;
   private JButton   button3;
   private JButton   button4;
   private JButton   button5;
   private JButton   button6;
   private JButton   button7;
   private JButton   button8;
   private JButton   button9;
   private JButton   buttonDott;
   private JButton   buttonEqual;
   private JButton   buttonMinus;
   private JButton   buttonPlus;
   private JButton   buttonDivide;
   private JButton   buttonMultiply;
   
   public Calculator()
   {
      
      super("Calculator");

      
      textField = new JTextField(); 
      textField.setPreferredSize(new Dimension(100, 50));
      
      pnl1 = new JPanel();
      button0 = new JButton("0");
      button1 = new JButton("1");
      button2 = new JButton("2");
      button3 = new JButton("3");
      button4 = new JButton("4");
      button5 = new JButton("5");
      button6 = new JButton("6");
      button7 = new JButton("7");
      button8 = new JButton("8");
      button9 = new JButton("9");
      buttonDivide = new JButton("/");
      buttonDott = new JButton(".");
      buttonEqual = new JButton("=");
      buttonMinus = new JButton("-");
      buttonMultiply = new JButton("*");
      buttonPlus = new JButton("+");  
      
      
      pnl1.add(button7);
      pnl1.add(button8);
      pnl1.add(button9);
      pnl1.add(buttonDivide);
      
      pnl1.add(button4);
      pnl1.add(button5);
      pnl1.add(button6);
      pnl1.add(buttonMultiply);
      
      pnl1.add(button1);
      pnl1.add(button2);
      pnl1.add(button3);
      pnl1.add(buttonMinus);
      
      pnl1.add(button0);
      pnl1.add(buttonDott);
      pnl1.add(buttonEqual);
      pnl1.add(buttonPlus);

      
      pnl1.setLayout( new GridLayout(4,4) );
      
      add(textField, BorderLayout.NORTH);
      add(pnl1, BorderLayout.CENTER);
      
      setSize(400, 500);
      setVisible(true);

      
      
   }
   
   public static void main(String[] args)
   {
      Calculator calc = new Calculator();
   }
   
   
}
