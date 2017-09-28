import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;

public class Calculator extends JFrame
{
   private JPanel pnl1;
   private JTextField textField;
   private JButton button0;
   private JButton button1;
   private JButton button2;
   private JButton button3;
   private JButton button4;
   private JButton button5;
   private JButton button6;
   private JButton button7;
   private JButton button8;
   private JButton button9;
   private JButton buttonDott;
   private JButton buttonEqual;
   private JButton buttonMinus;
   private JButton buttonPlus;
   private JButton buttonDivide;
   private JButton buttonMultiply;

   private MyButtonListener listener;

   private double value1;
   private double value2;
   private char operation;

   public Calculator()
   {

      super("Calculator");
      listener = new MyButtonListener();

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

      button0.addActionListener(listener);
      button1.addActionListener(listener);
      button2.addActionListener(listener);
      button3.addActionListener(listener);
      button4.addActionListener(listener);
      button5.addActionListener(listener);
      button6.addActionListener(listener);
      button7.addActionListener(listener);
      button8.addActionListener(listener);
      button9.addActionListener(listener);
      buttonPlus.addActionListener(listener);
      buttonMinus.addActionListener(listener);
      buttonDivide.addActionListener(listener);
      buttonMultiply.addActionListener(listener);
      buttonDott.addActionListener(listener);
      buttonEqual.addActionListener(listener);

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

      pnl1.setLayout(new GridLayout(4, 4));

      add(textField, BorderLayout.NORTH);
      add(pnl1, BorderLayout.CENTER);

      setSize(400, 500);
      setVisible(true);
   }

   private class MyButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // numbers
         if (e.getSource() == button0)
         {
            String input = textField.getText();
            textField.setText(input + "0");
         }
         else if (e.getSource() == button1)
         {
            String input = textField.getText();
            textField.setText(input + "1");
         }
         else if (e.getSource() == button2)
         {
            String input = textField.getText();
            textField.setText(input + "2");
         }
         else if (e.getSource() == button3)
         {
            String input = textField.getText();
            textField.setText(input + "3");
         }
         else if (e.getSource() == button4)
         {
            String input = textField.getText();
            textField.setText(input + "4");
         }
         else if (e.getSource() == button5)
         {
            String input = textField.getText();
            textField.setText(input + "5");
         }
         else if (e.getSource() == button6)
         {
            String input = textField.getText();
            textField.setText(input + "6");
         }
         else if (e.getSource() == button7)
         {
            String input = textField.getText();
            textField.setText(input + "7");
         }
         else if (e.getSource() == button8)
         {
            String input = textField.getText();
            textField.setText(input + "8");
         }
         else if (e.getSource() == button9)
         {
            String input = textField.getText();
            textField.setText(input + "9");
         }
         else if (e.getSource() == buttonDott)
         {
            String input = textField.getText();
            
            if(input.indexOf(".") == -1)
            {
              textField.setText(input + ".");
            }  
         }
         // operations
         else if (e.getSource() == buttonPlus)
         {
            String input = textField.getText();
            value1 = Double.parseDouble(input);
            operation = '+';
            textField.setText("");
         }
         else if (e.getSource() == buttonMinus)
         {
            String input = textField.getText();
            value1 = Double.parseDouble(input);
            operation = '-';
            textField.setText("");
         }
         else if (e.getSource() == buttonDivide)
         {
            String input = textField.getText();
            value1 = Double.parseDouble(input);
            operation = '/';
            textField.setText("");
         }
         else if (e.getSource() == buttonMultiply)
         {
            String input = textField.getText();
            value1 = Double.parseDouble(input);
            operation = '*';
            textField.setText("");
         }
         

         else if (e.getSource() == buttonEqual && operation=='+')
         {
            String input = textField.getText();
            operation = '=';
            value2 =  value1 + Double.parseDouble(input);
            textField.setText("" + value2);
         }
            else if (e.getSource() == buttonEqual && operation=='-')
            {
               String input = textField.getText();
               operation = '=';
               value2 = value1 - Double.parseDouble(input);
               textField.setText("" + value2);
            }
         
            else if (e.getSource() == buttonEqual && operation=='/')
            {
               String input = textField.getText();
               operation = '=';
               value2 = value1 / Double.parseDouble(input);
               textField.setText("" + value2);
            }
            else if (e.getSource() == buttonEqual && operation=='*')
            {
               String input = textField.getText();
               operation = '=';
               value2 = value1 * Double.parseDouble(input) ;
               textField.setText("" + value2);
            }
      }
   }

   public static void main(String[] args)
   {
      Calculator calc = new Calculator();
   }

}
