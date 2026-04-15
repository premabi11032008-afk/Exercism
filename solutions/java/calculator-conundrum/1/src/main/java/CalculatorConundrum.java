class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {

        if (operation==null)throw new IllegalArgumentException("Operation cannot be null");
        if (operation=="")throw new IllegalArgumentException("Operation cannot be empty");
        
        if (!operation.equals("+")&&!operation.equals("*")&&!operation.equals("/")){throw new IllegalOperationException("Operation '"+operation+"' does not exist"); }
        
        int result=0;
        
        try{
        if (operation.equals("+")) result = operand1+operand2;
        if (operation.equals("*")) result = operand1*operand2;
        if (operation.equals("/")) result = operand1/operand2;}

        catch(ArithmeticException e){throw new IllegalOperationException("Division by zero is not allowed", e);}

        return (operand1+" "+operation+" "+operand2+" = "+result);
    }
}
