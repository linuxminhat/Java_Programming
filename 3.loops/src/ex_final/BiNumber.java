package loops_finalexercise;

public class BiNumber {
    private int number1;//10
    private int number2;//10
    int lcm = 2;
    public BiNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public int getNumber1() {
        return number1;
    }
    public int getNumber2() {
        return number2;
    }

    public int calculateLCM() {
        if(number1 <0 || number2<0){
            return -1;
        }
        if(number1 ==0 || number2 ==0){
            return 0;
        }
        if(number1 >0 && number2>0) {
            for(int i=1;i>=number1 && i>=number2;i++){
                if(i%number1==0 && i%number2==0){
                    break;
                }
                lcm=i;
            }
        }
        return lcm;
        
        
    }
}
