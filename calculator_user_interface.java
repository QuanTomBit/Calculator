import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator_user_interface implements ActionListener{
	
	JFrame frame = new JFrame("Calculator");
	JPanel panel = new JPanel(new FlowLayout());
	
	JTextArea text = new JTextArea(1,20);
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	JButton button0 = new JButton("0");
	
	JButton buttonAdd = new JButton("+");
	JButton buttonSub = new JButton("-");
	JButton buttonMul = new JButton("*");
	JButton buttonDiv = new JButton("/");
	JButton buttonEqu = new JButton("=");
	
	JButton buttonCle = new JButton("C");
	
	Double number1, number2, result;
	int addc = 0, subc = 0, mulc = 0, divc = 0;
	
	public void ui()
	{
		
		frame.setVisible(true);
		
		frame.setSize(250, 200);;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		panel.add(text);
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		
		panel.add(buttonAdd);
		panel.add(buttonSub);
		panel.add(buttonMul);
		panel.add(buttonDiv);
		panel.add(buttonEqu);
		
		panel.add(buttonCle);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		
		buttonAdd.addActionListener(this);
		buttonSub.addActionListener(this);
		buttonMul.addActionListener(this);
		buttonDiv.addActionListener(this);
		buttonEqu.addActionListener(this);
		
		buttonCle.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource();
		
		if(source == button1)
		{
			text.append("1");
		}else if(source == button2)
		{
			text.append("2");
		}else if(source == button3)
		{
			text.append("3");
		}else if(source == button4)
		{
			text.append("4");
		}else if(source == button5)
		{
			text.append("5");
		}else if(source == button6)
		{
			text.append("6");
		}else if(source == button7)
		{
			text.append("7");
		}else if(source == button8)
		{
			text.append("8");
		}else if(source == button9)
		{
			text.append("9");
		}else if(source == button0)
		{
			text.append("0");
		}else if(source == buttonAdd)
		{
			number1 = number_reader();
			text.setText("");
			addc = 1;
			subc = 0;
			mulc = 0;
			divc = 0;
		}else if(source == buttonSub)
		{
			number1 = number_reader();
			text.setText("");
			addc = 0;
			subc = 1;
			mulc = 0;
			divc = 0;
		}else if(source == buttonMul)
		{
			number1 = number_reader();
			text.setText("");
			addc = 0;
			subc = 0;
			mulc = 1;
			divc = 0;
		}else if(source == buttonDiv)
		{
			number1 = number_reader();
			text.setText("");
			addc = 0;
			subc = 0;
			mulc = 0;
			divc = 1;
		}else if(source == buttonEqu)
		{
			number2 = number_reader();
			if(addc > 0)
			{
				result = number1 + number2;
				text.setText(Double.toString(result));
			}else if(subc > 0)
			{
				result = number1 - number2;
				text.setText(Double.toString(result));
			}else if(mulc > 0)
			{
				result = number1 * number2;
				text.setText(Double.toString(result));
			}else if(divc > 0)
			{
				result = number1 / number2;
				text.setText(Double.toString(result));
			}
		}else if(source == buttonCle)
		{
			number1 = 0.0;
			number2 = 0.0;
			text.setText("");
			
		}
		
	}
	
	public double number_reader(){
		
		Double num1;
		String s;
		s = text.getText();
		num1 = Double.valueOf(s);
		
		return num1;
		
	}
	
}



