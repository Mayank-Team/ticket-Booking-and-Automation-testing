package ticektBooking;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.JOptionPane;
public class MovieTicket {
    static JButton b;
    static String movieName;
    static String inputStr;
    static String outputStr;
    static double adultTicketPrice;
    static double childTicketPrice;
    static int noOfAdultTicketsSold;
    static int noOfChildTicketsSold;
    static double percentDonation;
    static double amountDonated;
    static double netSaleAmount;
    static double grossAmount;
    static double adultage,childage;
public static void main (String[] args )
{   

    movieName = JOptionPane.showInputDialog("Enter the movie name: ");
    inputStr = JOptionPane.showInputDialog("Enter the price of an adult ticket: ");
    adultTicketPrice = Double.parseDouble(inputStr);
    if (adultTicketPrice <0) {
        System.out.println("Please Enter the valid adult ticket price");
        System.exit(0);

        }
    inputStr = JOptionPane.showInputDialog("Enter the price of an child ticket: ");
    childTicketPrice = Double.parseDouble(inputStr);
    if (adultTicketPrice <0) {
        System.out.println("Please Enter the valid child ticket price");
        System.exit(0);}
    inputStr = JOptionPane.showInputDialog("Enter the number of an adult ticket sold : ");
    noOfAdultTicketsSold = Integer.parseInt(inputStr);
    if (adultTicketPrice <0) {
        System.out.println("Please Enter the valid adult ticket sold");
        System.exit(0);}
    inputStr = JOptionPane.showInputDialog("Enter the number of an child ticket sold : ");
    noOfChildTicketsSold = Integer.parseInt(inputStr);
    if (adultTicketPrice <0) {
        System.out.println("Please Enter the valid child ticket sold");
        System.exit(0);}
    inputStr = JOptionPane.showInputDialog("Enter the percentage of the donation : ");
    percentDonation = Double.parseDouble(inputStr);
    if (adultTicketPrice <0) {
        System.out.println("Please Enter the valid percentage of the donation");
        System.exit(0);}
    grossAmount = adultTicketPrice * noOfAdultTicketsSold + childTicketPrice * noOfChildTicketsSold; amountDonated = grossAmount * percentDonation / 100; netSaleAmount = grossAmount - amountDonated; outputStr = " Movie Name: " + movieName + "\n"+ "Number of Ticket Sold: "
    + (noOfAdultTicketsSold + noOfChildTicketsSold) + "\n"
    + " Gross Amount: Rs"
    + String.format("%.2f", grossAmount) + "\n"
    + " Percentage of the Gross Amount Donated: "
    + String.format("%.2f%%", percentDonation) + "\n"
    + "Amount Donated: Rs"
    + String.format("%.2f", amountDonated) + "\n"
    + "Net Sale: Rs"
    + String.format("%.2f", netSaleAmount);
     JOptionPane.showMessageDialog(null, outputStr,
    "Theater Sales Data",
    JOptionPane.INFORMATION_MESSAGE);
     JFrame jframe = new JFrame("Print Your Invoice");
        jframe.setSize(300, 300);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        jframe.add(panel);
        JButton button = new JButton("Print");
        button.setVisible(true);
        button.setSize(100, 100);
        panel.add(button);


    }
}