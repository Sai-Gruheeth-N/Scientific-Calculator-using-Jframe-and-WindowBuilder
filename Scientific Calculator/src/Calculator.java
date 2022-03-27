import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double first,second,result;
	String operation,answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 586, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 19));
		lblNewLabel.setBounds(10, 11, 550, 25);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setBounds(10, 47, 550, 74);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn_root = new JButton("\u221A");
		btn_root.setEnabled(false);
		btn_root.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn_root.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 22));
		btn_root.setBounds(220, 416, 60, 60);
		frame.getContentPane().add(btn_root);
		
		JButton btn_inv = new JButton("1/N");
		btn_inv.setEnabled(false);
		btn_inv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn_inv.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btn_inv.setBounds(220, 205, 60, 60);
		frame.getContentPane().add(btn_inv);
		
		JButton btn_xy = new JButton("m^n");
		btn_xy.setEnabled(false);
		btn_xy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "X^Y";
			}
		});
		btn_xy.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btn_xy.setBounds(150, 205, 60, 60);
		frame.getContentPane().add(btn_xy);
		
		JButton btn_unary = new JButton("+/-");
		btn_unary.setEnabled(false);
		btn_unary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btn_unary.setFont(new Font("Spectral SC SemiBold", Font.BOLD, 18));
		btn_unary.setBounds(220, 346, 60, 60);
		frame.getContentPane().add(btn_unary);
		
		JButton btn_cube = new JButton("n^3");
		btn_cube.setEnabled(false);
		btn_cube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn_cube.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 14));
		btn_cube.setBounds(150, 277, 60, 60);
		frame.getContentPane().add(btn_cube);
		
		JButton btn_square = new JButton("n^2");
		btn_square.setEnabled(false);
		btn_square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn_square.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 14));
		btn_square.setBounds(150, 348, 60, 60);
		frame.getContentPane().add(btn_square);
		
		JButton btn_fact = new JButton("n!");
		btn_fact.setEnabled(false);
		btn_fact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact = 1;
				while(a!=0){
					fact = fact * a;
					a -= 1;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btn_fact.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 16));
		btn_fact.setBounds(150, 418, 60, 60);
		frame.getContentPane().add(btn_fact);
		
		JButton btn_exp = new JButton("e^n");
		btn_exp.setEnabled(false);
		btn_exp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn_exp.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btn_exp.setBounds(10, 418, 60, 60);
		frame.getContentPane().add(btn_exp);
		
		JButton btn_log = new JButton("Ln");
		btn_log.setEnabled(false);
		btn_log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn_log.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btn_log.setBounds(80, 418, 60, 60);
		frame.getContentPane().add(btn_log);
		
		JButton btn_perc = new JButton("%");
		btn_perc.setEnabled(false);
		btn_perc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btn_perc.setFont(new Font("Spectral SC SemiBold", Font.BOLD, 16));
		btn_perc.setBounds(220, 276, 60, 60);
		frame.getContentPane().add(btn_perc);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 20));
		btn7.setBounds(290, 204, 60, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 20));
		btn4.setBounds(290, 275, 60, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn1.setBounds(290, 346, 60, 60);
		frame.getContentPane().add(btn1);
		
		JButton btn_equal = new JButton("=");
		btn_equal.setEnabled(false);
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if(operation == "+"){
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "-"){
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "*"){
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "/"){
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "%"){
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "X^Y"){

					double temp = 1;
					for(int i=0 ; i < second ; i++)
					{
						temp = first * temp;
					}
					answer = String.format("%.2f", temp);
					textField.setText(answer);
				}
			}
		});
		btn_equal.setFont(new Font("Spectral SC SemiBold", Font.BOLD, 20));
		btn_equal.setBounds(430, 417, 60, 60);
		frame.getContentPane().add(btn_equal);
		
		JButton btn_tan = new JButton("Tan");
		btn_tan.setEnabled(false);
		btn_tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText())*(Math.PI/180));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn_tan.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btn_tan.setBounds(80, 205, 60, 60);
		frame.getContentPane().add(btn_tan);
		
		JButton btn_tanh = new JButton("Tanh");
		btn_tanh.setEnabled(false);
		btn_tanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn_tanh.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btn_tanh.setBounds(10, 206, 60, 60);
		frame.getContentPane().add(btn_tanh);
		
		JButton btn_div = new JButton("/");
		btn_div.setEnabled(false);
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btn_div.setFont(new Font("Spectral SC SemiBold", Font.BOLD, 20));
		btn_div.setBounds(500, 132, 60, 60);
		frame.getContentPane().add(btn_div);
		
		JButton btn_mul = new JButton("X");
		btn_mul.setEnabled(false);
		btn_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btn_mul.setFont(new Font("Spectral SC SemiBold", Font.BOLD, 16));
		btn_mul.setBounds(500, 205, 60, 60);
		frame.getContentPane().add(btn_mul);
		
		JButton btn_sub = new JButton("-");
		btn_sub.setEnabled(false);
		btn_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
						textField.setText("");
						operation = "-";
			}
		});
		btn_sub.setFont(new Font("Spectral SC SemiBold", Font.BOLD, 20));
		btn_sub.setBounds(500, 275, 60, 60);
		frame.getContentPane().add(btn_sub);
		
		JButton btn_add = new JButton("+");
		btn_add.setEnabled(false);
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btn_add.setFont(new Font("Spectral SC SemiBold", Font.BOLD, 20));
		btn_add.setBounds(500, 345, 60, 131);
		frame.getContentPane().add(btn_add);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Spectral SC SemiBold", Font.BOLD, 20));
		btn0.setBounds(290, 417, 60, 60);
		frame.getContentPane().add(btn0);
		
		JButton btn_sin = new JButton("Sin");
		btn_sin.setEnabled(false);
		btn_sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText())*(Math.PI/180));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn_sin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btn_sin.setBounds(80, 347, 60, 60);
		frame.getContentPane().add(btn_sin);
		
		JButton btn_sinh = new JButton("Sinh");
		btn_sinh.setEnabled(false);
		btn_sinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn_sinh.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btn_sinh.setBounds(10, 348, 60, 60);
		frame.getContentPane().add(btn_sinh);
		
		JButton btn_clear = new JButton("C");
		btn_clear.setEnabled(false);
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btn_clear.setFont(new Font("Spectral SC SemiBold", Font.BOLD, 16));
		btn_clear.setBounds(360, 133, 60, 60);
		frame.getContentPane().add(btn_clear);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 20));
		btn8.setBounds(360, 204, 60, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 20));
		btn5.setBounds(360, 275, 60, 60);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 20));
		btn2.setBounds(360, 346, 60, 60);
		frame.getContentPane().add(btn2);
		
		JButton btn_dec = new JButton(".");
		btn_dec.setEnabled(false);
		btn_dec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn_dec.getText();
				textField.setText(number);
			}
		});
		btn_dec.setFont(new Font("Spectral SC SemiBold", Font.BOLD, 20));
		btn_dec.setBounds(360, 417, 60, 60);
		frame.getContentPane().add(btn_dec);
		
		JButton btn_cos = new JButton("Cos");
		btn_cos.setEnabled(false);
		btn_cos.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btn_cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText())*(Math.PI/180));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn_cos.setBounds(80, 276, 60, 60);
		frame.getContentPane().add(btn_cos);
		
		JButton btn_cosh = new JButton("Cosh");
		btn_cosh.setEnabled(false);
		btn_cosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn_cosh.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btn_cosh.setBounds(10, 277, 60, 60);
		frame.getContentPane().add(btn_cosh);
		
		JButton btn_backspace = new JButton("\uF0E7");
		btn_backspace.setEnabled(false);
		btn_backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()>0){
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btn_backspace.setFont(new Font("Wingdings", Font.PLAIN, 16));
		btn_backspace.setBounds(430, 132, 60, 60);
		frame.getContentPane().add(btn_backspace);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 20));
		btn9.setBounds(430, 204, 60, 60);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 20));
		btn6.setBounds(430, 275, 60, 60);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 20));
		btn3.setBounds(430, 346, 60, 60);
		frame.getContentPane().add(btn3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("On");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btn0.setEnabled(true);
				btn_add.setEnabled(true);
				btn_backspace.setEnabled(true);
				btn_clear.setEnabled(true);
				btn_cos.setEnabled(true);
				btn_cosh.setEnabled(true);
				btn_cube.setEnabled(true);
				btn_dec.setEnabled(true);
				btn_div.setEnabled(true);
				btn_equal.setEnabled(true);
				btn_exp.setEnabled(true);
				btn_fact.setEnabled(true);
				btn_inv.setEnabled(true);
				btn_log.setEnabled(true);
				btn_mul.setEnabled(true);
				btn_perc.setEnabled(true);
				btn_root.setEnabled(true);
				btn_sin.setEnabled(true);
				btn_sinh.setEnabled(true);
				btn_square.setEnabled(true);
				btn_sub.setEnabled(true);
				btn_tan.setEnabled(true);
				btn_tanh.setEnabled(true);
				btn_unary.setEnabled(true);
				btn_xy.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBounds(10, 128, 60, 71);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("Off");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btn0.setEnabled(false);
				btn_add.setEnabled(false);
				btn_backspace.setEnabled(false);
				btn_clear.setEnabled(false);
				btn_cos.setEnabled(false);
				btn_cosh.setEnabled(false);
				btn_cube.setEnabled(false);
				btn_dec.setEnabled(false);
				btn_div.setEnabled(false);
				btn_equal.setEnabled(false);
				btn_exp.setEnabled(false);
				btn_fact.setEnabled(false);
				btn_inv.setEnabled(false);
				btn_log.setEnabled(false);
				btn_mul.setEnabled(false);
				btn_perc.setEnabled(false);
				btn_root.setEnabled(false);
				btn_sin.setEnabled(false);
				btn_sinh.setEnabled(false);
				btn_square.setEnabled(false);
				btn_sub.setEnabled(false);
				btn_tan.setEnabled(false);
				btn_tanh.setEnabled(false);
				btn_unary.setEnabled(false);
				btn_xy.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 12));
		rdbtnOff.setBounds(80, 132, 60, 66);
		frame.getContentPane().add(rdbtnOff);
	}
}
