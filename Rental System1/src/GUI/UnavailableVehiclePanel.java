package GUI;
import Code.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UnavailableVehiclePanel extends JPanel
{

   private JLabel lblType, lblModel, lblStatus, lblBookingID, lblTimeLeft;
   private JTextField txfSearch, txfType, txfModel, txfStatus, txfBookingID,
         txfTimeLeft;
   private JButton btnSearchID;

   private JTextArea txaType, txaModel, txaStatus, txaBookingID, txaTimeLeft;

   // buttons

   public UnavailableVehiclePanel()
   {
      this.setLayout(null);

      // Create Type label
      lblType = new JLabel("Type");
      lblType.setBounds(100, 60, 120, 25);
      add(lblType);
      // create Model label

      lblModel = new JLabel("Model");
      lblModel.setBounds(250, 60, 120, 25);
      add(lblModel);

      // status label
      lblStatus = new JLabel("Status");
      lblStatus.setBounds(400, 60, 120, 25);
      add(lblStatus);
      // Booking label
      lblBookingID = new JLabel("BookingID");
      lblBookingID.setBounds(550, 60, 120, 25);
      add(lblBookingID);

      lblTimeLeft = new JLabel("TimeLeft");
      lblTimeLeft.setBounds(700, 60, 120, 25);
      add(lblTimeLeft);

      btnSearchID = new JButton("SearchID");
      btnSearchID.setBounds(510, 20, 120, 25);
      add(btnSearchID);

      txfSearch = new JTextField();
      txfSearch.setBounds(635, 20, 120, 25);
      add(txfSearch);

      // text fields for labels

      txfType = new JTextField();
      txfType.setBounds(50, 80, 120, 400);
      add(txfType);

      txfModel = new JTextField();
      txfModel.setBounds(205, 80, 120, 400);
      add(txfModel);

      txfStatus = new JTextField();
      txfStatus.setBounds(360, 80, 120, 400);
      add(txfStatus);

      txfBookingID = new JTextField();
      txfBookingID.setBounds(520, 80, 120, 400);
      add(txfBookingID);

      txfTimeLeft = new JTextField();
      txfTimeLeft.setBounds(680, 80, 120, 400);
      add(txfTimeLeft);

   }
}