package is.ru.stringcalculator;

public class Calculator {
	
	private final String delimiter = ",|\n";

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else if(text.contains(delimiter)){
			return sum(splitNumbers(text));
		}
		else
			return 1;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	    return numbers.split(delimiter);
	}
    private static int sum(String[] numbers) throws Exception{
        for (String number : numbers){
		if(toInt(number) < 0)   {
			throw new Exception("Negative input");
		}
	}
        int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
    }



}
