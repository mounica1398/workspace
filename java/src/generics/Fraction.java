package generics;

public class Fraction {
	
	protected int numerator;
	protected int denominator;
	/*setter section*/
	public void setNumerator(int n) {
	this.numerator = n;
	}
	public void setDenominator(int d) {
	this.denominator = d;
	}

	/*getter section*/

	public int getNumerator() {
	return numerator;
	}
	public int getDenominator() {
	return denominator;
	}

	/*constructor section*/

	Fraction() {
		this.numerator = 1;
		this.denominator = 1;
	}
	Fraction(int n) {
		this.numerator = n;
		this.numerator = 1;
	}
	Fraction(int n,int d) {
		this.numerator = n;
		this.denominator = d;
	}

	public Fraction inverse() 
	{
		// Swap numerator and denominator.
		 Fraction f1 = new Fraction();
		 f1.numerator = this.denominator;
		 f1.denominator = this.numerator;
		 return f1;
		
	}
	public void reduce() 
	{
		int x;
		x = gcd();
		numerator = numerator/x;
		denominator =denominator/x;
		
	}
	public int gcd()
	{
		int g = 1;
		for(int i=1;i<=numerator && i<=denominator;i++)
		{
				if(numerator%i==0 && denominator%i==0)
						g = i;
		}
		return g ;
	}
			
	public boolean isProper() 
	{
			
	// Check and return true or false.
		if(this.numerator > this.denominator)
				return false;
		else 
				return true;
					
	}
	public Fraction computeInverse() 
	{
			
		return ( new Fraction(denominator,numerator) );
	}
		
	/*print section*/

	public void print()
	{
		System.out.print(this.numerator + "/" + this.denominator);
	}
	// Fraction Addition
	public static Fraction add (Fraction first, Fraction second) 
	{ 
		int numerSum,d,n; 
		if ( first.getDenominator() == second.getDenominator() ) 
		{ 
			        numerSum = first.getNumerator() + second.getNumerator(); 
			        return ( new Fraction(numerSum, first.getDenominator()) ); 
		} 
		else 
		{
			d = first.getDenominator() * second.getDenominator() ;
			n = (first.getNumerator()*second.getDenominator()) + (first.getDenominator()*second.getNumerator());
			return (new Fraction(n,d));
				     
		}
         
	} 
	// Fraction multiplication
	public static Fraction multiply (Fraction one , Fraction two )
	{
		Fraction product = new Fraction();
		product.numerator   = one.getNumerator()*two.getNumerator();
		product.denominator = one.getDenominator()*two.getDenominator();
		return(product);
	}
	// Fraction Subtraction 
	public static Fraction sub (Fraction first, Fraction second) 
	{ 
		int numerSum,d,n; 
		if ( first.getDenominator() == second.getDenominator() ) 
		{ 
			        numerSum = first.getNumerator() - second.getNumerator(); 
			        return ( new Fraction(numerSum, first.getDenominator()) ); 
		} 
		else 
		{
			d = first.getDenominator() * second.getDenominator() ;
			n = (first.getNumerator()*second.getDenominator()) - (first.getDenominator()*second.getNumerator());
			return (new Fraction(n,d));
				     
		}
	} 
	public static Fraction div (Fraction first, Fraction second)
	{
		Fraction res = new Fraction ();
		res.numerator = first.getNumerator()*second.getDenominator();
		res.denominator = first.getDenominator()*second.getNumerator();
		return res;
		
	}
	public String toString()
	{
		return (numerator + "/" + denominator);
	}

}
	

