public class CalculatorModel {
    private double first,second,result;
	private String operation,answer;

    public void Model(double first, double second)
    {
        this.first = first;
        this.second = second;
    }

    public void setFirst(double first){
        this.first = first;
    }

    public void setSecond(double second){
        this.second = second;
    }

    public double getFirst(){
        return first;
    }
    public double getSecond(){
        return second;
    }
}
