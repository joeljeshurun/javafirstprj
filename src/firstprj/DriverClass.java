package firstprj;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle();
		rec.setBred(12);
		rec.setLength(10);
		
		rec.displayArea();
				
		Rectangle rec1 = new Rectangle();
		
		rec1.displayArea();
		
		Rectangle temp = rec;
		
		temp.displayArea();
		temp.setBred(120);
		
		temp.displayArea();
		
		rec.displayArea();
			
		rec.displayArea();
			
	}

}
