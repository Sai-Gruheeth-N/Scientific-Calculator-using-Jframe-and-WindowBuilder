public class Model {

    public double calculate(Double val,String op)
    {
        double res;
        switch(op){
            case "1/n":
                res = 1.0/val;
                break;
            case "n^2":
                res = val*val;
                break;
            case "n^3":
                res = val*val*val;
                break;
            case "sin":
                res = Math.sin(val*(Math.PI/180));
                break;
            case "cos":
                res = Math.cos(val*(Math.PI/180));
                break;
            case "tan":
                res = Math.tan(val*(Math.PI/180));
                break;
            case "n!":
                res = 1;
                while(val!=0)
                {
                    res = res*val;
                    val = val - 1;
                }
                break;
            case "sqrt":
                res = Math.sqrt(val);
                break;
            default:
                throw new RuntimeException("Invalid Operation");
        }
        return res;
    }

    public int calculate(int i1, String op, int i2) {
		int res;
		switch (op) {
		case "+":
			res = i1 + i2;
			break;
		case "-":
			res = i1 - i2;
			break;
		case "*":
			res = i1 * i2;
			break;
		case "/":
			res = i1 / i2;
			break;
		case "%":
			res = i1 % i2;
			break;
        case "^":
            res = 1;
            for(int i = 0 ; i < i2 ; i++)
            {
                res = i1 * res;
            }
            break;
		default:
			throw new RuntimeException("impossible operator");
		}
		return res;
	}

}
