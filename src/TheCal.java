import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TheCal {
	
	static JLabel LabelMonth, LabelYear;
	static JButton buttonPrev, buttonNext;
	static JTable tabelCal;
	static JComboBox comboYear;
	static JFrame mainFrame;
	static Container pane;
	static JScrollPane theScrollPane;
	static JPanel panelCal;
	static int Year, Month, Day, currentYear, currentMonth;
	

public static void main (String args[]){
	

	mainFrame = new JFrame ("Yuuugee"); 
	mainFrame.setSize(330, 375); 
	pane = mainFrame.getContentPane();
	pane.setLayout(null); 
	mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	labelMonth = new JLabel ("January");
	labelYear = new JLabel ("Change year:");
	comboYear = new JComboBox();
	buttonPrev = new JButton ("<<");
	buttonNext = new JButton (">>");
	theScrollPane = new JScrollPane(tabelCalendar);
	panelCal = new JPanel(null);
	}

}