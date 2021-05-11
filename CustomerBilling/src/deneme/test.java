package deneme;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

import org.w3c.dom.stylesheets.MediaList;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.JCheckBox;
import java.awt.Point;
import java.awt.TextArea;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Path2D.Double;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.DropMode;



public class test {

	private JFrame frame;
	private JTextField customerRefTxt;
	private JTextField FirstNameTxt;
	private JTextField SurnameTxt;
	private JTextField AddressTxt;
	private JTextField PostCodeTxt;
	private JTextField CustomerMobileTxt;
	private JTextField EmailTxt;
	private JTextField Jtxtkim;
	private JTextField Jtextkerry;
	private JTextField Jtxtcoffe;
	private JTextField Jtxtswindon;
	private JTextField Jtxtyorkcream;
	private JTextField Jtxtblackforest;
	private JTextField Jtxtlogos;
	private JTextField Jtxtkilburn;
	private JTextField TaxTxt;
	private JTextField SubTotalTxt;
	private JTextField TotalTxt;
	

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public class CustomerBilling extends javax.swing.JFrame
	{
		 String iTax,iSubTotal,iTotal;
		 public double[] itemcost= new double[20];
	
	}

	/**
	 * Create the application.
	 */
	
	
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	
	
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				
				Jtxtkim.setEnabled(false);
				Jtextkerry.setEnabled(false);
				Jtxtblackforest.setEnabled(false);
				Jtxtcoffe.setEnabled(false);
				Jtxtkilburn.setEnabled(false);
				Jtxtswindon.setEnabled(false);
				Jtxtlogos.setEnabled(false);
				Jtxtyorkcream.setEnabled(false);
				
				
				customerRefTxt.setText(null);
				customerRefTxt.setEnabled(false);
				
				int refs=5015+(int) (Math.random()*17238);
				String cRef="";
				cRef+=refs+1560;
				
				customerRefTxt.setText(cRef);
				FirstNameTxt.setText(null);
				SurnameTxt.setText(null);
				AddressTxt.setText(null);
				EmailTxt.setText(null);
				PostCodeTxt.setText(null);
				CustomerMobileTxt.setText(null);
				TaxTxt.setText(null);
				TotalTxt.setText(null);
				SubTotalTxt.setText(null);
			    
				
				
			}
		});
		frame.getContentPane().setPreferredSize(new Dimension(1300, 800));
		frame.setBounds(100, 100, 1295, 765);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 153));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(153, 0, 102)));
		panel.setBounds(-18, 11, 1269, 726);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(44, 56, 395, 631);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(153, 0, 102)));
		panel_1.setBackground(new Color(255, 204, 153));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Ref :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(41, 49, 145, 14);
		panel_1.add(lblNewLabel);
		
		customerRefTxt = new JTextField();
		customerRefTxt.setFont(new Font("Tahoma", Font.BOLD, 12));
		customerRefTxt.setBounds(212, 47, 145, 20);
		panel_1.add(customerRefTxt);
		customerRefTxt.setColumns(10);
		
		JLabel lblFirsrtname = new JLabel("Firsrtname :");
		lblFirsrtname.setHorizontalAlignment(SwingConstants.LEFT);
		lblFirsrtname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFirsrtname.setBounds(41, 71, 109, 14);
		panel_1.add(lblFirsrtname);
		
		JLabel lblSurname = new JLabel("Surname :");
		lblSurname.setHorizontalAlignment(SwingConstants.LEFT);
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSurname.setBounds(41, 96, 109, 14);
		panel_1.add(lblSurname);
		
		JLabel lblAddress = new JLabel("Address 1 :");
		lblAddress.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(39, 127, 111, 14);
		panel_1.add(lblAddress);
		
		JLabel lblPostCode = new JLabel("Post Code :");
		lblPostCode.setHorizontalAlignment(SwingConstants.LEFT);
		lblPostCode.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPostCode.setBounds(41, 137, 109, 45);
		panel_1.add(lblPostCode);
		
		JLabel lblCustomerMobile = new JLabel("Customer Mobile :");
		lblCustomerMobile.setHorizontalAlignment(SwingConstants.LEFT);
		lblCustomerMobile.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCustomerMobile.setBounds(39, 179, 145, 14);
		panel_1.add(lblCustomerMobile);
		
		FirstNameTxt = new JTextField();
		FirstNameTxt.setFont(new Font("Tahoma", Font.BOLD, 12));
		FirstNameTxt.setColumns(10);
		FirstNameTxt.setBounds(212, 71, 145, 20);
		panel_1.add(FirstNameTxt);
		
		SurnameTxt = new JTextField();
		SurnameTxt.setFont(new Font("Tahoma", Font.BOLD, 12));
		SurnameTxt.setColumns(10);
		SurnameTxt.setBounds(212, 96, 145, 20);
		panel_1.add(SurnameTxt);
		
		AddressTxt = new JTextField();
		AddressTxt.setFont(new Font("Tahoma", Font.BOLD, 12));
		AddressTxt.setColumns(10);
		AddressTxt.setBounds(212, 125, 145, 20);
		panel_1.add(AddressTxt);
		
		PostCodeTxt = new JTextField();
		PostCodeTxt.setFont(new Font("Tahoma", Font.BOLD, 12));
		PostCodeTxt.setColumns(10);
		PostCodeTxt.setBounds(212, 150, 145, 20);
		panel_1.add(PostCodeTxt);
		
		JDateChooser chooser1 = new JDateChooser();
		chooser1.setBounds(246, 227, 111, 20);
		panel_1.add(chooser1);
		
		JDateChooser chooser2 = new JDateChooser();
		chooser2.setBounds(246, 320, 111, 20);
		panel_1.add(chooser2);
		
		JDateChooser chooser3 = new JDateChooser();
		chooser3.setBounds(246, 351, 111, 20);
		panel_1.add(chooser3);
		
		CustomerMobileTxt = new JTextField();
		CustomerMobileTxt.setFont(new Font("Tahoma", Font.BOLD, 12));
		CustomerMobileTxt.setColumns(10);
		CustomerMobileTxt.setBounds(212, 177, 145, 20);
		panel_1.add(CustomerMobileTxt);
		
		JLabel lblNationality = new JLabel("Email :");
		lblNationality.setHorizontalAlignment(SwingConstants.LEFT);
		lblNationality.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNationality.setBounds(41, 204, 127, 14);
		panel_1.add(lblNationality);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth :");
		lblDateOfBirth.setHorizontalAlignment(SwingConstants.LEFT);
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDateOfBirth.setBounds(41, 227, 145, 14);
		panel_1.add(lblDateOfBirth);
		
		JLabel lblIdType = new JLabel("ID Type :");
		lblIdType.setHorizontalAlignment(SwingConstants.LEFT);
		lblIdType.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIdType.setBounds(41, 252, 127, 31);
		panel_1.add(lblIdType);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGender.setBounds(41, 294, 109, 14);
		panel_1.add(lblGender);
		
		JLabel lblMeal = new JLabel("Meal :");
		lblMeal.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblMeal.setHorizontalAlignment(SwingConstants.LEFT);
		lblMeal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMeal.setBounds(41, 378, 109, 14);
		panel_1.add(lblMeal);
		
		JLabel lblRoomType = new JLabel("Room Type :");
		lblRoomType.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblRoomType.setHorizontalAlignment(SwingConstants.LEFT);
		lblRoomType.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRoomType.setBounds(41, 410, 109, 14);
		panel_1.add(lblRoomType);
		
		EmailTxt = new JTextField();
		EmailTxt.setFont(new Font("Tahoma", Font.BOLD, 12));
		EmailTxt.setColumns(10);
		EmailTxt.setBounds(212, 202, 145, 20);
		panel_1.add(EmailTxt);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select ID Type", "Driving Licence", "Passport", "Pilot Lience", "Student ID"}));
		comboBox.setBounds(246, 258, 111, 20);
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		comboBox_1.setToolTipText("");
		comboBox_1.setBounds(246, 289, 111, 20);
		panel_1.add(comboBox_1);
		
		JLabel lblCheckInDate = new JLabel("Check In Date :");
		lblCheckInDate.setHorizontalAlignment(SwingConstants.LEFT);
		lblCheckInDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCheckInDate.setBounds(41, 326, 145, 14);
		panel_1.add(lblCheckInDate);
		
		JLabel lblCheckOutDate = new JLabel("Check Out Date :");
		lblCheckOutDate.setHorizontalAlignment(SwingConstants.LEFT);
		lblCheckOutDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCheckOutDate.setBounds(41, 351, 145, 14);
		panel_1.add(lblCheckOutDate);
		
		JComboBox Meal1 = new JComboBox();
		Meal1.setFont(new Font("Tahoma", Font.BOLD, 11));
		Meal1.setModel(new DefaultComboBoxModel(new String[] {"Select No.Of Meal", "1", "2", "3"}));
		Meal1.setToolTipText("");
		Meal1.setBounds(246, 382, 111, 20);
		panel_1.add(Meal1);
		
		
		JComboBox RoomType1 = new JComboBox();
		RoomType1.setFont(new Font("Tahoma", Font.BOLD, 11));
		RoomType1.setModel(new DefaultComboBoxModel(new String[] {"Select Room Type", "Single", "Double", "Family"}));
		RoomType1.setToolTipText("");
		RoomType1.setBounds(246, 413, 111, 20);
		panel_1.add(RoomType1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(153, 0, 102)));
		panel_6.setBackground(new Color(255, 204, 153));
		panel_6.setBounds(41, 461, 320, 144);
		panel_1.add(panel_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(859, 56, 366, 631);
		panel_3.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(153, 0, 102)));
		panel_3.setBackground(new Color(255, 204, 153));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JTextArea JtxtReceipt = new JTextArea();
		JtxtReceipt.setBounds(25, 28, 320, 413);
		panel_3.add(JtxtReceipt);
		
		JButton button = new JButton("Total");
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			
			CustomerBilling c = new CustomerBilling();
			c.itemcost[0]=java.lang.Double.parseDouble(Jtxtkim.getText())*1.5;
			c.itemcost[1]=java.lang.Double.parseDouble(Jtextkerry.getText())*1.5;
			c.itemcost[3]=java.lang.Double.parseDouble(Jtxtcoffe.getText())*2;
			c.itemcost[4]=java.lang.Double.parseDouble(Jtxtyorkcream.getText())*1.30;
			c.itemcost[5]=java.lang.Double.parseDouble(Jtxtswindon.getText())*3;
			c.itemcost[6]=java.lang.Double.parseDouble(Jtxtkilburn.getText())*2.50;
			c.itemcost[7]=java.lang.Double.parseDouble(Jtxtlogos.getText())*1.5;
			c.itemcost[8]=java.lang.Double.parseDouble(Jtxtblackforest.getText())*2.85;
			
			c.itemcost[9]=c.itemcost[0]+ c.itemcost[1]+ c.itemcost[2]+ c.itemcost[3];
			c.itemcost[10]=c.itemcost[4]+ c.itemcost[5]+ c.itemcost[6]+ c.itemcost[7]+ c.itemcost[8];
			
			c.itemcost[11]=c.itemcost[9]+c.itemcost[10];
			c.iTax=String.format("$ %.2f", c.itemcost[11]/100);
			c.iSubTotal=String.format("$ %.2f", c.itemcost[11]);
			c.iTotal=String.format("$ %.2f",c.itemcost[11]+(c.itemcost[11]/100));
			
			TaxTxt.setText(c.iTax);
			TotalTxt.setText(c.iTotal);
			SubTotalTxt.setText(c.iSubTotal);
			
			
			//--------------------------------------------------------------------------
			JtxtReceipt.setEnabled(true);
			//--------------------------------------------------------------------------
			
			int refs=1325+(int) (Math.random()*4238);
			
			
			//--------------------------------------------------------------------------
			Calendar timer=Calendar.getInstance();
			timer.getTime();
			SimpleDateFormat tTime= new SimpleDateFormat("HH:mm:ss");
			tTime.format(timer.getTime());
			SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
			Tdate.format(timer.getTime());
			
			//---------------------------------------------------------------------------
			
			JtxtReceipt.append("\tCustomer Billing System\n" +
			"Reference:\t\t\t" + refs +
			"\n-----------------------------------------------\t" +
			
			        "\n-------------------------------------------------\t"+
			        "\nCustomer Ref:\t\t\t" + customerRefTxt.getText()+
			        "\nFirstname:\t\t\t" + FirstNameTxt.getText()+
			        "\nSurname:\t\t\t" +SurnameTxt.getText() +
			        "\nKim's Cake:\t\t\t" +Jtxtkim.getText() +
			        "\nKerry's Cake:\t\t\t" + Jtextkerry.getText()
			        +"\nLogos :\t\t\t" +Jtxtlogos.getText() +
			        "\nSwindon :\t\t\t" +Jtxtswindon.getText()+
			        "\nBlack Forest:\t\t\t"+Jtxtblackforest.getText()+
			        "\nYork Cake:\t\t\t"+Jtxtyorkcream.getText()+
			
			
			         "\nTax:\t\t\t"+ c.iTax +
			         "\nSub Total:\t\t\t" +c.iSubTotal+
			         "\nTotal:\t\t\t"+ c.iTotal +
			         "\n---------------------------------------------------\t"+
			         "\nDate: "+Tdate.format(timer.getTime())+
			          "\t\tTime:"+tTime.format(timer.getTime())+
			          "\n\n\tThank you for Shopping at iShop\n"
			         
					
					);
	
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBounds(35, 40, 111, 81);
		panel_6.add(button);
		
	
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(153, 0, 102)));
		panel_2.setBounds(449, 56, 382, 631);
		panel_2.setBackground(new Color(255, 204, 153));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 204, 153));
		panel_4.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(153, 0, 102)));
		panel_4.setBounds(39, 44, 303, 397);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JCheckBox chckbxKimCake = new JCheckBox("Kim Cake");
		chckbxKimCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxKimCake.isSelected())
				{
					Jtxtkim.setEnabled(true);
					Jtxtkim.setText("");
					Jtxtkim.requestFocus();
				}
				else{
					
					Jtxtkim.setEnabled(false);
					Jtxtkim.setText("0");
				}
			}
		});
		chckbxKimCake.setBounds(19, 27, 154, 23);
		chckbxKimCake.setBackground(new Color(255, 204, 153));
		chckbxKimCake.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_4.add(chckbxKimCake);
		
		JCheckBox chckbxKerryCake = new JCheckBox("Kerry Cake");
		chckbxKerryCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxKerryCake.isSelected())
				{
					Jtextkerry.setEnabled(true);
					Jtextkerry.setText("");
					Jtextkerry.requestFocus();
				}
				else{
					
					Jtextkerry.setEnabled(false);
					Jtextkerry.setText("0");
				}
			}
		});
		chckbxKerryCake.setBounds(19, 71, 192, 23);
		chckbxKerryCake.setBackground(new Color(255, 204, 153));
		chckbxKerryCake.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_4.add(chckbxKerryCake);
		
		JCheckBox chckbxCoffeCake = new JCheckBox("Coffe Cake");
		chckbxCoffeCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxCoffeCake.isSelected())
				{
					Jtxtcoffe.setEnabled(true);
					Jtxtcoffe.setText("");
					Jtxtcoffe.requestFocus();
				}
				else{
					
					Jtxtcoffe.setEnabled(false);
					Jtxtcoffe.setText("0");
				}
			}
		});
		chckbxCoffeCake.setBounds(19, 115, 192, 23);
		chckbxCoffeCake.setBackground(new Color(255, 204, 153));
		chckbxCoffeCake.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_4.add(chckbxCoffeCake);
		
		JCheckBox chckbxSwindonCake = new JCheckBox("Swindon Cake");
		chckbxSwindonCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxSwindonCake.isSelected())
				{
					Jtxtswindon.setEnabled(true);
					Jtxtswindon.setText("");
					Jtxtswindon.requestFocus();
				}
				else{
					
					Jtxtswindon.setEnabled(false);
					Jtxtswindon.setText("0");
				}
			}
		});
		chckbxSwindonCake.setBounds(19, 165, 192, 23);
		chckbxSwindonCake.setBackground(new Color(255, 204, 153));
		chckbxSwindonCake.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_4.add(chckbxSwindonCake);
		
		JCheckBox chckbxYorkCreamCake = new JCheckBox("York Cream Cake");
		
		chckbxYorkCreamCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxYorkCreamCake.isSelected())
				{
					Jtxtyorkcream.setEnabled(true);
					Jtxtyorkcream.setText("");
					Jtxtyorkcream.requestFocus();
				}
				else{
					
					Jtxtyorkcream.setEnabled(false);
					Jtxtyorkcream.setText("0");
				}
			}
		});
		chckbxYorkCreamCake.setBounds(19, 206, 192, 23);
		chckbxYorkCreamCake.setBackground(new Color(255, 204, 153));
		chckbxYorkCreamCake.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_4.add(chckbxYorkCreamCake);
		
		JCheckBox chckbxBlackForestCake = new JCheckBox("Black Forest Cake");
		chckbxBlackForestCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxBlackForestCake.isSelected())
				{
					Jtxtblackforest.setEnabled(true);
					Jtxtblackforest.setText("");
					Jtxtblackforest.requestFocus();
				}
				else{
					
					Jtxtblackforest.setEnabled(false);
					Jtxtblackforest.setText("0");
				}
			}
		});
		chckbxBlackForestCake.setBounds(19, 250, 192, 23);
		chckbxBlackForestCake.setBackground(new Color(255, 204, 153));
		chckbxBlackForestCake.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_4.add(chckbxBlackForestCake);
		
		JCheckBox chckbxLogosChocalateCkae = new JCheckBox("Logos Chocalate Ckae");
		chckbxLogosChocalateCkae.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxLogosChocalateCkae.isSelected())
				{
					Jtxtlogos.setEnabled(true);
					Jtxtlogos.setText("");
					Jtxtlogos.requestFocus();
				}
				else{
					
					Jtxtlogos.setEnabled(false);
					Jtxtlogos.setText("0");
				}
			}
		});
		chckbxLogosChocalateCkae.setBounds(19, 294, 192, 23);
		chckbxLogosChocalateCkae.setBackground(new Color(255, 204, 153));
		chckbxLogosChocalateCkae.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_4.add(chckbxLogosChocalateCkae);
		
		JCheckBox chckbxKilburnChocolateCake = new JCheckBox("Kilburn Chocolate Cake");
		chckbxKilburnChocolateCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxKilburnChocolateCake.isSelected())
				{
					Jtxtkilburn.setEnabled(true);
					Jtxtkilburn.setText("");
					Jtxtkilburn.requestFocus();
				}
				else{
					
					Jtxtkilburn.setEnabled(false);
					Jtxtkilburn.setText("0");
				}
			}
		});
		chckbxKilburnChocolateCake.setBounds(19, 344, 192, 23);
		chckbxKilburnChocolateCake.setBackground(new Color(255, 204, 153));
		chckbxKilburnChocolateCake.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_4.add(chckbxKilburnChocolateCake);
		
		Jtxtkim = new JTextField();
		Jtxtkim.setBounds(210, 28, 65, 20);
		Jtxtkim.setHorizontalAlignment(SwingConstants.CENTER);
		Jtxtkim.setFont(new Font("Tahoma", Font.BOLD, 13));
		Jtxtkim.setText("0");
		panel_4.add(Jtxtkim);
		Jtxtkim.setColumns(10);
		
		Jtextkerry = new JTextField();
		Jtextkerry.setBounds(210, 72, 65, 20);
		Jtextkerry.setHorizontalAlignment(SwingConstants.CENTER);
		Jtextkerry.setText("0");
		Jtextkerry.setFont(new Font("Tahoma", Font.BOLD, 13));
		Jtextkerry.setColumns(10);
		panel_4.add(Jtextkerry);
		
		Jtxtcoffe = new JTextField();
		Jtxtcoffe.setBounds(210, 116, 65, 20);
		Jtxtcoffe.setHorizontalAlignment(SwingConstants.CENTER);
		Jtxtcoffe.setText("0");
		Jtxtcoffe.setFont(new Font("Tahoma", Font.BOLD, 13));
		Jtxtcoffe.setColumns(10);
		panel_4.add(Jtxtcoffe);
		
		Jtxtswindon = new JTextField();
		Jtxtswindon.setBounds(210, 165, 65, 20);
		Jtxtswindon.setHorizontalAlignment(SwingConstants.CENTER);
		Jtxtswindon.setText("0");
		Jtxtswindon.setFont(new Font("Tahoma", Font.BOLD, 13));
		Jtxtswindon.setColumns(10);
		panel_4.add(Jtxtswindon);
		
		Jtxtyorkcream = new JTextField();
		Jtxtyorkcream.setBounds(210, 209, 65, 20);
		Jtxtyorkcream.setHorizontalAlignment(SwingConstants.CENTER);
		Jtxtyorkcream.setText("0");
		Jtxtyorkcream.setFont(new Font("Tahoma", Font.BOLD, 13));
		Jtxtyorkcream.setColumns(10);
		panel_4.add(Jtxtyorkcream);
		
		Jtxtblackforest = new JTextField();
		Jtxtblackforest.setBounds(210, 253, 65, 20);
		Jtxtblackforest.setHorizontalAlignment(SwingConstants.CENTER);
		Jtxtblackforest.setText("0");
		Jtxtblackforest.setFont(new Font("Tahoma", Font.BOLD, 13));
		Jtxtblackforest.setColumns(10);
		panel_4.add(Jtxtblackforest);
		
		Jtxtlogos = new JTextField();
		Jtxtlogos.setBounds(210, 295, 65, 20);
		Jtxtlogos.setHorizontalAlignment(SwingConstants.CENTER);
		Jtxtlogos.setText("0");
		Jtxtlogos.setFont(new Font("Tahoma", Font.BOLD, 13));
		Jtxtlogos.setColumns(10);
		panel_4.add(Jtxtlogos);
		
		Jtxtkilburn = new JTextField();
		Jtxtkilburn.setBounds(210, 345, 65, 20);
		Jtxtkilburn.setHorizontalAlignment(SwingConstants.CENTER);
		Jtxtkilburn.setText("0");
		Jtxtkilburn.setFont(new Font("Tahoma", Font.BOLD, 13));
		Jtxtkilburn.setColumns(10);
		panel_4.add(Jtxtkilburn);
		
		JLabel lblNewLabel_1 = new JLabel("Tax Paid");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_1.setBounds(39, 508, 122, 14);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Dialog", Font.BOLD, 18));
		lblSubTotal.setBounds(39, 549, 122, 14);
		panel_2.add(lblSubTotal);
		
		JLabel lblTotalCoast = new JLabel("Total Coast");
		lblTotalCoast.setFont(new Font("Dialog", Font.BOLD, 18));
		lblTotalCoast.setBounds(39, 593, 122, 14);
		panel_2.add(lblTotalCoast);
		
		TaxTxt = new JTextField();
		TaxTxt.setBackground(UIManager.getColor("CheckBox.light"));
		TaxTxt.setText("0");
		TaxTxt.setHorizontalAlignment(SwingConstants.CENTER);
		TaxTxt.setFont(new Font("Dialog", Font.BOLD, 16));
		TaxTxt.setColumns(10);
		TaxTxt.setBounds(211, 502, 86, 20);
		panel_2.add(TaxTxt);
		
		SubTotalTxt = new JTextField();
		SubTotalTxt.setBackground(UIManager.getColor("CheckBox.light"));
		SubTotalTxt.setText("0");
		SubTotalTxt.setHorizontalAlignment(SwingConstants.CENTER);
		SubTotalTxt.setFont(new Font("Dialog", Font.BOLD, 16));
		SubTotalTxt.setColumns(10);
		SubTotalTxt.setBounds(211, 543, 86, 20);
		panel_2.add(SubTotalTxt);
		
		TotalTxt = new JTextField();
		TotalTxt.setBackground(UIManager.getColor("CheckBox.light"));
		TotalTxt.setText("0");
		TotalTxt.setHorizontalAlignment(SwingConstants.CENTER);
		TotalTxt.setFont(new Font("Dialog", Font.BOLD, 16));
		TotalTxt.setColumns(10);
		TotalTxt.setBounds(211, 587, 86, 20);
		panel_2.add(TotalTxt);
		
		JLabel lblNewLabel_2 = new JLabel("Total and Tax Sum");
		lblNewLabel_2.setBackground(new Color(153, 102, 153));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(91, 452, 201, 39);
		panel_2.add(lblNewLabel_2);
		
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(25, 459, 320, 144);
		panel_5.setBackground(new Color(255, 204, 153));
		panel_5.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(153, 0, 102)));
		panel_3.add(panel_5);
		
		JButton btnNewButton = new JButton("Print");
		btnNewButton.setBounds(35, 40, 115, 81);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					JtxtReceipt.print();
				} catch (java.awt.print.PrinterException e1) {
					System.err.format("no printer found", e1.getMessage());
				}
			}
		});
		panel_5.setLayout(null);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_5.add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(170, 40, 110, 81);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame =new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Customer Billing System",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_5.add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Jtxtkim.setEnabled(false);
				Jtextkerry.setEnabled(false);
				Jtxtblackforest.setEnabled(false);
				Jtxtcoffe.setEnabled(false);
				Jtxtkilburn.setEnabled(false);
				Jtxtswindon.setEnabled(false);
				Jtxtlogos.setEnabled(false);
				Jtxtyorkcream.setEnabled(false);
				
				Jtxtkim.setText("0");
				Jtextkerry.setText("0");
				Jtxtblackforest.setText("0");
				Jtxtcoffe.setText("0");
				Jtxtkilburn.setText("0");
				Jtxtswindon.setText("0");
				Jtxtlogos.setText("0");
				Jtxtyorkcream.setText("0");
				Meal1.setToolTipText("");
				chckbxYorkCreamCake.setSelected(false);
				
				
				customerRefTxt.setText(null);
				FirstNameTxt.setText(null);
				SurnameTxt.setText(null);
				AddressTxt.setText(null);
				EmailTxt.setText(null);
				PostCodeTxt.setText(null);
				CustomerMobileTxt.setText(null);
				TaxTxt.setText(null);
				TotalTxt.setText(null);
				SubTotalTxt.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(169, 40, 111, 81);
		panel_6.add(btnReset);
	}
}
