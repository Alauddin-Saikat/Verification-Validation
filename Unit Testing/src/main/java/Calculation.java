public class Calculation {
    private Operation operation;

    public void serInterface(Operation operation){
        this.operation = operation;
    }

    public double ADD(int a, int b){
        return operation.add(a,b);
    }
    public  double DIV(int a, int b){
        return operation.div(a,b);
    }
}
