package class2;

public class Calc {
    Double sum(Double num1, Double num2){
        return num1 + num2;
    }

    Double sub(Double num1, Double num2){
        return num1 - num2;
    }
    
    Double multiply(Double num1, Double num2){
        return num1 * num2;
    }
    
    Double divide(Double num1, Double num2){
        return num1 / num2;
    }
    boolean isPrime(Double num) {
    	if(num <= 1) {
    		return false;
    	}
    	for(int i = 2; i <= Math.sqrt(num); i++) {
    		if (num % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
}
