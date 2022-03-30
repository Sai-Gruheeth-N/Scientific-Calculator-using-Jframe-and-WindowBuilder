import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View {
        Controller controller;
        JLabel result;
        String op;
        private final ButtonGroup buttonGroup = new ButtonGroup();

        public void setController(Controller controller)
        {
            this.controller = controller;
        }

        public void show()
        {
            JFrame frame = new JFrame("Scientific Calculator");
		    frame.setPreferredSize(new Dimension(600, 200));
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel();
            
            JTextField input1 = new JTextField(10);
            input1.setEnabled(false);
            
            JComboBox<String> operator = new JComboBox<String>(
                new String[] { "+", "-", "*", "/", "%", "^", "1/n", "n^2", "n^3", "sin", "cos", "tan", "n!", "sqrt"}
            );
            operator.setEnabled(false);
                
            JTextField input2 = new JTextField(10);
            input2.setEnabled(false);
            
            JButton calcbutton = new JButton("Calculate");
            calcbutton.setEnabled(false);

            result = new JLabel("    ");
            result.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            result.setEnabled(false);

            operator.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    op = operator.getSelectedItem().toString();
                    if(op == "1/n" | op == "n^2" | op == "n^3" | op == "sin" | op == "cos" | op == "tan" | op == "n!" | op == "sqrt")
                    {
                        input2.setEnabled(false);
                        input2.setText(null);
                    }
                    if(op == "+" | op == "-" | op == "*" | op == "/" | op == "%" | op == "^")
                    {
                        input2.setEnabled(true);
                    }
                }
            });
            
            calcbutton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String s1 = input1.getText();
                    op = operator.getItemAt(operator.getSelectedIndex());
                    if(op == "+" | op == "-" | op == "*" | op == "/" | op == "%" | op == "^")
                    {
                        String s2 = input2.getText();
                        controller.handleUserInput(s1, op, s2);
                    }
                    else if(op == "1/n" | op == "n^2" | op == "n^3" | op == "sin" | op == "cos" | op == "tan" | op == "n!" | op == "sqrt")
                    {
                        controller.handleUserInput(s1, op);
                    }
                }
            });

            JRadioButton rdbtnNewRadioButton = new JRadioButton("On");
		    rdbtnNewRadioButton.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
                    input1.setEnabled(true);
                    operator.setEnabled(true);
                    input2.setEnabled(true);
                    calcbutton.setEnabled(true);
                    result.setEnabled(true);
		    	}
		    });
            buttonGroup.add(rdbtnNewRadioButton);

            JRadioButton rdbtnOff = new JRadioButton("Off");
		    rdbtnOff.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
                    input1.setEnabled(false);
                    input1.setText(null);
                    operator.setEnabled(false);
                    input2.setEnabled(false);
                    input2.setText(null);
                    calcbutton.setEnabled(false);
                    result.setEnabled(false);
                    result.setText("    ");;
			    }
		    });
		    buttonGroup.add(rdbtnOff);


            panel.add(rdbtnNewRadioButton);
            panel.add(rdbtnOff);
            panel.add(input1);
            panel.add(operator);
            panel.add(input2);
            panel.add(calcbutton);
            panel.add(result);
            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
        }

        public void setResult(String res) {
            this.result.setText(res);
        }
}
