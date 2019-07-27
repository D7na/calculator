package learning;

// Add count based operation input
class Calc {
    String add(String rawValue1, String rawValue2){
        Convert value = new Convert();
        int intResult = value.convert(rawValue1)+value.convert(rawValue2);

        String result = value.reverseConvert(intResult, value.getType(rawValue1));

        result=result+"("+value.getType(rawValue1)+")";
        System.out.println(rawValue1+"+"+rawValue2+"="+result);

        return result;
    }
}

    public int calculate() {
        switch (operation) {
            case "+": result = num1 + num2; break;
            case "-": result = num1 - num2; break;
            case "*": result = num1 * num2; break;
            case "/": result = num1 / num2; break;
            default:
                System.out.println("The operation is not recognized. Repeat entry.");
        }
        return result;
    }