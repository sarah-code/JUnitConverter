import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class testocalculator extends JFrame implements ActionListener
{
	static JLabel oUnitText;
	static JTextField oUnit;
	static JLabel conUnitText;
	static JTextField conUnit;
	static JButton convert;
	
	
	public void start()
	{
		try
		{
			
		
			int choice;
			double valuengdl;
			double valuengml;
			double valuenmoll;
			Scanner nmoll;
			Scanner nmoll1;
			String mode;
			Scanner ngdl;
			Scanner ngml;
			System.out.println("This programme calculates testosterone values\n================= \nfrom 1. nmol/L to ng/ml\n 2. nmol/L to ng/dL\n 3. ng/dL to nmol/L\n4. ng/mL to nmol/L\n5. Show stored values\n 6. Flush values. \n 7. EXIT.");
			Scanner menu = new Scanner(System.in);
			choice = menu.nextInt();
			
			switch(choice)
			{
				case 1: 
				mode = "nmol/L to ng/ml";
				System.out.println("You have selected "+mode+". Please enter your values:");
				nmoll = new Scanner(System.in);
				valuenmoll = nmoll.nextDouble();
				
				valuengml =  valuenmoll * 0.314465;
				System.out.println(valuenmoll+" nmol/L are "+valuengml+" ng/mL.");
				
				start();
				break;
				case 2: 
					mode = "nmol/L to ng/dL";
					System.out.println("You have selected "+mode+". Please enter your values:");
					nmoll1 = new Scanner(System.in);
					valuenmoll = nmoll1.nextDouble();
					
					valuengdl =  valuenmoll * 28.842;
					System.out.println(valuenmoll+" nmol/L are "+valuengdl+" ng/dL.");
					
					start();
					break;
				case 3: 
					mode = "ng/dL to nmol/L";
					System.out.println("You have selected "+mode+". Please enter your values:");
					ngdl = new Scanner(System.in);
					valuengdl = ngdl.nextDouble();
					
					valuenmoll =  valuengdl * 	0.0347;
					System.out.println(valuengdl+" ng/dL are "+valuenmoll+" nmol/L.");
					
					start();
					break;
				case 4: 
					mode = "ng/dL to nmol/L";
					System.out.println("You have selected "+mode+". Please enter your values:");
					ngml = new Scanner(System.in);
					valuengml = ngml.nextDouble();
					
					valuenmoll =  valuengml * 	0.314465;
					System.out.println(valuengml+" ng/mL are "+valuenmoll+" nmol/L.");
					
					start();
					break;
					default: System.out.println("Invalid entry."); start();
				
			}
			
			menu.close();
			
		}
		catch(Exception E)
		{
			System.out.println(E+"was caught");
		}
	}
	public static void main (String args[])
	{
		
		testocalculator tc = new testocalculator();
		JFrame frame = new JFrame("Convert Units");
		oUnitText = JTextField("Original Unit");
		
		frame.add(oUnitText);
		frame.setBounds(1000,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		frame.setVisible(true);
		
		
	}
}
