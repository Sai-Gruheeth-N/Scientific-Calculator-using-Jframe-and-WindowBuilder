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


public class CalculatorView {
    JFrame frame;
	JTextField textField;
    private final ButtonGroup buttonGroup = new ButtonGroup();

    JButton btn_root,btn_inv,btn_xy,btn_unary,btn_cube,btn_square,btn_fact,btn_exp,btn_log,btn_perc,btn7,btn4,btn1,btn_equal,btn_tan,btn_tanh,btn_div,btn_mul,btn_sub,btn_add,btn0,btn_sin,btn_sinh,btn_clear,btn8,btn5,btn2,btn_dec,btn_cos,btn_cosh,btn_backspace,btn9,btn6,btn3;
    JLabel lblNewLabel;
    JRadioButton rdbtnNewRadioButton,rdbtnOff;
    
    CalculatorView(){
        frame = new JFrame();
		frame.setBounds(100, 100, 586, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

        lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
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
		btn_root.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 22));
		btn_root.setBounds(220, 416, 60, 60);
		frame.getContentPane().add(btn_root);
		
		JButton btn_inv = new JButton("1/N");
		btn_inv.setEnabled(false);
		btn_inv.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btn_inv.setBounds(220, 205, 60, 60);
		frame.getContentPane().add(btn_inv);
		
		JButton btn_xy = new JButton("m^n");
		btn_xy.setEnabled(false);
		btn_xy.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btn_xy.setBounds(150, 205, 60, 60);
		frame.getContentPane().add(btn_xy);
		
		JButton btn_unary = new JButton("+/-");
		btn_unary.setEnabled(false);
		btn_unary.setFont(new Font("Spectral SC SemiBold", Font.BOLD, 18));
		btn_unary.setBounds(220, 346, 60, 60);
		frame.getContentPane().add(btn_unary);
		
		JButton btn_cube = new JButton("n^3");
		btn_cube.setEnabled(false);
		btn_cube.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 14));
		btn_cube.setBounds(150, 277, 60, 60);
		frame.getContentPane().add(btn_cube);
		
		JButton btn_square = new JButton("n^2");
		btn_square.setEnabled(false);
		btn_square.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 14));
		btn_square.setBounds(150, 348, 60, 60);
		frame.getContentPane().add(btn_square);
		
		JButton btn_fact = new JButton("n!");
		btn_fact.setEnabled(false);
		btn_fact.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 16));
		btn_fact.setBounds(150, 418, 60, 60);
		frame.getContentPane().add(btn_fact);
		
		JButton btn_exp = new JButton("e^n");
		btn_exp.setEnabled(false);
		btn_exp.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btn_exp.setBounds(10, 418, 60, 60);
		frame.getContentPane().add(btn_exp);
		
		JButton btn_log = new JButton("Ln");
		btn_log.setEnabled(false);
		btn_log.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btn_log.setBounds(80, 418, 60, 60);
		frame.getContentPane().add(btn_log);
		
		JButton btn_perc = new JButton("%");
		btn_perc.setEnabled(false);
		btn_perc.setFont(new Font("Spectral SC SemiBold", Font.BOLD, 16));
		btn_perc.setBounds(220, 276, 60, 60);
		frame.getContentPane().add(btn_perc);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 20));
		btn7.setBounds(290, 204, 60, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 20));
		btn4.setBounds(290, 275, 60, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn1.setBounds(290, 346, 60, 60);
		frame.getContentPane().add(btn1);
		
		JButton btn_equal = new JButton("=");
		btn_equal.setEnabled(false);
		btn_equal.setFont(new Font("Spectral SC SemiBold", Font.BOLD, 20));
		btn_equal.setBounds(430, 417, 60, 60);
		frame.getContentPane().add(btn_equal);
		
		JButton btn_tan = new JButton("Tan");
		btn_tan.setEnabled(false);
		btn_tan.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btn_tan.setBounds(80, 205, 60, 60);
		frame.getContentPane().add(btn_tan);
		
		JButton btn_tanh = new JButton("Tanh");
		btn_tanh.setEnabled(false);
		btn_tanh.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btn_tanh.setBounds(10, 206, 60, 60);
		frame.getContentPane().add(btn_tanh);
		
		JButton btn_div = new JButton("/");
		btn_div.setEnabled(false);
		btn_div.setFont(new Font("Spectral SC SemiBold", Font.BOLD, 20));
		btn_div.setBounds(500, 132, 60, 60);
		frame.getContentPane().add(btn_div);
		
		JButton btn_mul = new JButton("X");
		btn_mul.setEnabled(false);
		btn_mul.setFont(new Font("Spectral SC SemiBold", Font.BOLD, 16));
		btn_mul.setBounds(500, 205, 60, 60);
		frame.getContentPane().add(btn_mul);
		
		JButton btn_sub = new JButton("-");
		btn_sub.setEnabled(false);
		btn_sub.setFont(new Font("Spectral SC SemiBold", Font.BOLD, 20));
		btn_sub.setBounds(500, 275, 60, 60);
		frame.getContentPane().add(btn_sub);
		
		JButton btn_add = new JButton("+");
		btn_add.setEnabled(false);
		btn_add.setFont(new Font("Spectral SC SemiBold", Font.BOLD, 20));
		btn_add.setBounds(500, 345, 60, 131);
		frame.getContentPane().add(btn_add);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.setFont(new Font("Spectral SC SemiBold", Font.BOLD, 20));
		btn0.setBounds(290, 417, 60, 60);
		frame.getContentPane().add(btn0);
		
		JButton btn_sin = new JButton("Sin");
		btn_sin.setEnabled(false);
		btn_sin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btn_sin.setBounds(80, 347, 60, 60);
		frame.getContentPane().add(btn_sin);
		
		JButton btn_sinh = new JButton("Sinh");
		btn_sinh.setEnabled(false);
		btn_sinh.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btn_sinh.setBounds(10, 348, 60, 60);
		frame.getContentPane().add(btn_sinh);
		
		JButton btn_clear = new JButton("C");
		btn_clear.setEnabled(false);
		btn_clear.setFont(new Font("Spectral SC SemiBold", Font.BOLD, 16));
		btn_clear.setBounds(360, 133, 60, 60);
		frame.getContentPane().add(btn_clear);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 20));
		btn8.setBounds(360, 204, 60, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 20));
		btn5.setBounds(360, 275, 60, 60);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 20));
		btn2.setBounds(360, 346, 60, 60);
		frame.getContentPane().add(btn2);
		
		JButton btn_dec = new JButton(".");
		btn_dec.setEnabled(false);
		btn_dec.setFont(new Font("Spectral SC SemiBold", Font.BOLD, 20));
		btn_dec.setBounds(360, 417, 60, 60);
		frame.getContentPane().add(btn_dec);
		
		JButton btn_cos = new JButton("Cos");
		btn_cos.setEnabled(false);
		btn_cos.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btn_cos.setBounds(80, 276, 60, 60);
		frame.getContentPane().add(btn_cos);
		
		JButton btn_cosh = new JButton("Cosh");
		btn_cosh.setEnabled(false);
		btn_cosh.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btn_cosh.setBounds(10, 277, 60, 60);
		frame.getContentPane().add(btn_cosh);
		
		JButton btn_backspace = new JButton("\uF0E7");
		btn_backspace.setEnabled(false);
		btn_backspace.setFont(new Font("Wingdings", Font.PLAIN, 16));
		btn_backspace.setBounds(430, 132, 60, 60);
		frame.getContentPane().add(btn_backspace);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 20));
		btn9.setBounds(430, 204, 60, 60);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 20));
		btn6.setBounds(430, 275, 60, 60);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 20));
		btn3.setBounds(430, 346, 60, 60);
		frame.getContentPane().add(btn3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("On");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBounds(10, 128, 60, 71);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("Off");
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Spectral SC SemiBold", Font.PLAIN, 12));
		rdbtnOff.setBounds(80, 132, 60, 66);
		frame.getContentPane().add(rdbtnOff);
    }

}
