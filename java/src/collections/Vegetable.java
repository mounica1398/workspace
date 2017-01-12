package collections;

public class Vegetable {

	public String vegetable_name;
	public int count = 0;
	
	Vegetable(String s){
		vegetable_name = s;
	}
	public void count(String ch){
		if (ch.equals("G")||ch.equals("g")){
			count++;
		}
	}
}
