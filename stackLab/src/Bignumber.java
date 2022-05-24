public class Bignumber {
    String number;

    public Bignumber(String number) {
        this.number = number;
    }

    public Bignumber(int number) {
        this.number = number+"";
    }

    public Bignumber add(Bignumber number2){
        // 523 + 6789 = 7312
        //number+number2 = answer
        String answer="";
        ourStack operand1 = new ourStack(number.length());
        ourStack operand2 = new ourStack(number2.toString().length());
        for (int i=0; i<number.length(); i++){
            operand1.push(number.charAt(i)-48);
        }
        for (int i=0; i<number2.toString().length(); i++){
            operand2.push(number2.toString().charAt(i)-48);
        }
        int size = Math.max(number.length(),number2.toString().length())+1;
        ourStack answerStack = new ourStack(size);
        int carry=0;
        while (!operand1.isEmpty() || !operand2.isEmpty()){
            int a = (operand1.isEmpty()?0 : operand1.pop()) + (operand2.isEmpty()?0 : operand2.pop()) + carry;
            answerStack.push(a%10);
            carry = a/10;
        }
        if (carry>0){
            answerStack.push(carry);
        }
        while(!answerStack.isEmpty()){
            answer += answerStack.pop();
        }
        return new Bignumber(answer);
    }

    public String toString(){
        return number;
    }
}
