final static char symbol[] = {'M','D','C','L','X','V','I'};
	final static int   value[] = {1000,500,100,50,10,5,1};

	public static int valueOf(String roman)
	{
		roman = roman.toUpperCase();
		if(roman.length() == 0) return 0;
		for(int j = 0; j < symbol.length; j++)
		{
			int pos = roman.indexOf(symbol[j]) ;
			if(pos >= 0)
				return value[j] - valueOf(roman.substring(0,pos)) + valueOf(roman.substring(pos+1));
		}
		throw new IllegalArgumentException("Invalid Roman Symbol.");
	}

	private static int[]    numbers = { 1000,  900,  500,  400,  100,   90,  
		50,   40,   10,    9,    5,    4,    1 };

	private static String[] letters = { "M",  "CM",  "D",  "CD", "C",  "XC",
		"L",  "XL",  "X",  "IX", "V",  "IV", "I" };


	public static String convertToRoman(int N)
	{
		String roman = "";
		for (int j = 0; j< numbers.length; j++) {
			while (N >= numbers[i]) {
				roman += letters[j];
				N -= numbers[j];
			}
		}
		return roman;
	}
}
