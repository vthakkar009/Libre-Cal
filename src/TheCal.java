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
	static DefaultTableModel mtabelCal;

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
	
	panelCal.setBorder(BorderFactory.createTitledBorder("Calendar"));
	
	buttonPrev.addActionListener(new buttonPrev_Action());
	buttonNext.addActionListener(new buttonNext_Action());
	comboYear.addActionListener(new comboYear_Action());
	
	pane.add(panelCal);
	panelCal.add(LabelMonth);
	panelCal.add(LabelYear);
	panelCal.add(comboYear);
	panelCal.add(buttonPrev);
	panelCal.add(buttonNext);
	panelCal.add(theScrollPane);
	
	panelCal.setBounds(0, 0, 1920, 1920);
	LabelMonth.setBounds(500, 50, 200, 50);
	LabelYear.setBounds(30, 575, 150, 50);
	comboYear.setBounds(30, 600, 100, 30);
	buttonPrev.setBounds(10, 25, 150, 40);
	buttonNext.setBounds(1090, 25, 150, 40);
	theScrollPane.setBounds(10, 100, 1240, 525);
	
	mainFrame.setResizable(true);
	mainFrame.setVisible(true);
	
	GregorianCalendar cal = new GregorianCalendar(); //Create calendar
	Day = cal.get(GregorianCalendar.DAY_OF_MONTH); //Get day
	Month = cal.get(GregorianCalendar.MONTH); //Get month
	Year = cal.get(GregorianCalendar.YEAR); //Get year
	currentMonth = Month; //Match month and year
	currentYear = Year;
		
	String[] headers = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun",}; //All headers
	for (int i=0; i<7; i++){
	mtabelCal.addColumn(headers[i]);
	}
	
	tabelCal.getParent().setBackground(tabelCal.getBackground());
	tabelCal.getTableHeader().setResizingAllowed(true);
	tabelCal.getTableHeader().setReorderingAllowed(true);
	tabelCal.setColumnSelectionAllowed(true);
	tabelCal.setRowSelectionAllowed(true);
	tabelCal.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	tabelCal.setRowHeight(75);
	mtabelCal.setColumnCount(7);
	mtabelCal.setRowCount(6);
	
	for (int i=Year-100; i<=Year+100; i++){
		comboYear.addItem(String.valueOf(i));
	}
	
	refreshCalendar (Month, Year);
}
	public static void refreshCalendar(int month, int year){
		String[] months =  {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int nod, som;
		
	buttonPrev.setEnabled(true);
	buttonNext.setEnabled(true);
	if (month == 0 && year <= Year-10){buttonPrev.setEnabled(false);}
	if (month == 11 && year >= Year+100){buttonNext.setEnabled(false);}
	LabelMonth.setText(months[month]);
	LabelMonth.setBounds(550, 25, 25, 25);
	comboYear.setSelectedItem(String.valueOf(year));

	for (int i=0; i<6; i++){
	for (int j=0; j<7; j++){
	mtabelCal.setValueAt(null, i, j);
	}
}
	GregorianCalendar cal = new GregorianCalendar(year, month, 1);
	nod = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
	som = cal.get(GregorianCalendar.DAY_OF_WEEK);
			
	for (int i=1; i<=nod; i++){
		int row = new Integer((i+som-2)/7);
		int column  =  (i+som-2)%7;
		mtabelCal.setValueAt(i, row, column);
	}

	tabelCal.setDefaultRenderer(tabelCal.getColumnClass(0), new tabelCalRenderer());
}

	for (int i=0; i<6; i++){
	for (int j=0; j<7; j++){
	mtabelCal.setValueAt(null, i, j);
	}
}
		
	GregorianCalendar cal = new GregorianCalendar(year, month, 1);
	nod = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
	som = cal.get(GregorianCalendar.DAY_OF_WEEK);

	for (int i=1; i<=nod; i++){
	int row = new Integer((i+som-2)/7);
	int column  =  (i+som-2)%7;
	mtabelCal.setValueAt(i, row, column);}
	tabelCal.setDefaultRenderer(tabelCal.getColumnClass(0), new tabelCalRenderer());
		}
	static class tabelCalRenderer extends DefaultTableCellRenderer{
		public Component getTableCellRendererComponent (JTable table, Object value, boolean selected, boolean focused, int row, int column){
			super.getTableCellRendererComponent(table, value, selected, focused, row, column);
			if (column == 0 || column == 6){ //Week-end
				setBackground(new Color(255, 220, 220));
			}
			else{ //Week
				setBackground(new Color(255, 255, 255));
			}
			if (value != null){
				if (Integer.parseInt(value.toString()) == Day && currentMonth == Month && currentYear == Year){ //Today
					setBackground(new Color(220, 220, 255));
				}
			}
			setBorder(null);
			setForeground(Color.black);
			return this;
		}
	}
	
	
	
	
	
	
	
	}

}
