import java.awt.event.ActionEvent;

public class CalculatorController {
    CalculatorModel model;
    CalculatorView view;

    public CalculatorController(CalculatorModel model,CalculatorView view){
        this.model = model;
        this.view = view;
        
        view.btn_root.addActionListener(new Actions());
        view.btn_inv.addActionListener(new Actions());
        view.btn_xy.addActionListener(new Actions());
        view.btn_unary.addActionListener(new Actions());
        view.btn_cube.addActionListener(new Actions());
        view.btn_square.addActionListener(new Actions());
        view.btn_fact.addActionListener(new Actions());
        view.btn_exp.addActionListener(new Actions());
        view.btn_log.addActionListener(new Actions());
        view.btn_perc.addActionListener(new Actions());
        view.btn7.addActionListener(new Actions());
        view.btn4.addActionListener(new Actions());
        view.btn1.addActionListener(new Actions());
        view.btn_equal.addActionListener(new Actions());
        view.btn_tan.addActionListener(new Actions());
        view.btn_tanh.addActionListener(new Actions());
        view.btn_div.addActionListener(new Actions());
        view.btn_mul.addActionListener(new Actions());
        view.btn_sub.addActionListener(new Actions());
        view.btn_add.addActionListener(new Actions());
        view.btn0.addActionListener(new Actions());
        view.btn_sin.addActionListener(new Actions());
        view.btn_sinh.addActionListener(new Actions());
        view.btn_clear.addActionListener(new Actions());
        view.btn8.addActionListener(new Actions());
        view.btn5.addActionListener(new Actions());
        view.btn2.addActionListener(new Actions());
        view.btn_dec.addActionListener(new Actions());
        view.btn_cos.addActionListener(new Actions());
        view.btn_cosh.addActionListener(new Actions());
        view.btn_backspace.addActionListener(new Actions());
        view.btn9.addActionListener(new Actions());
        view.btn6.addActionListener(new Actions());
        view.btn3.addActionListener(new Actions());
    }

    class Actions implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == view.btn_add){

            }
        }
    }
    
}
