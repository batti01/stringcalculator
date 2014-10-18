package is.ru.stringcalculator;

public class Calculator {
	
	

	public static int add(String text){
		String delimiter;
		
		if(text.startswith("//"){
			if(text.contains([)
			{
				String[] delimiters = text.split([|]);
				for(int i = 0; i < delimiters.length; i++)
				{
					if(i%2 != 0)
					{
						delimiter += delimiters[i];
						delimiter += "|";
					}
						
				}
				delimiter += ",";
			}
			else
			{
				delimiter = text.substring(2,3);
			}
			
		}
		else{ String delimiter = ",|\n";
		}

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
	for (String number : numbers){
		if(toint(number > 1000) {
			continue;}
	}
        int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
    }



}
