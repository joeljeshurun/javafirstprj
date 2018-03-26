package firstprj;

public class Rectangle {

	int _len;
	int _bred;
	private int _area;
		
	public void setLength(int len){
		_len = len;
	}
	
	public void setBred(int bred){
		_bred = bred;
	}
		
	private int calArea(){
		_area = _len*_bred;
		return _area;
	}
		
	public void displayArea(){
		
		System.out.println("Area: " + calArea());
	}
	
}
