package shopfactory;

abstract class ShopAcc {

private int accNo;
private String accNm;
private float charges;


public void setNo(int i) {       // getter and setter methods for private variable
accNo = i;
}

public int getNo( ) {
return accNo;
}

public void setNm(String j) {
accNm = j;
}

public String getNm( ) {
return accNm;
}

public void setch(float k) {
charges = k;
}

public float getch( ) {
return charges;
}                                  // getter and setter end;


abstract public void bookProduct();


public void items()
{

}


abstract public String toString();

}



abstract class PrimeAcc extends ShopAcc {

private boolean isPrime;
private float deliveryCharges;


public void setPr(boolean l) {       // getter and setter methods for private variable
isPrime = l;
}

public boolean getPr( ) {
return isPrime;
}


public void setd(float m) {      
deliveryCharges = m;
}

public float getd( ) {
return deliveryCharges;
}                                  // getter and setter methods end;


abstract public void bookProduct();


abstract public String toString();

}



abstract class NormalAcc extends ShopAcc {

private float deliveryCharges;

    abstract public void bookProduct();
    abstract public String toString();

}



class GSPrimeAcc extends PrimeAcc {

static private float Charges;

public void bookProduct() {

}


public String toString() {
String demo = "demo";
return demo;
}


}



class GSNormalAcc extends NormalAcc {

public void bookProduct() {

}


public String toString() {
String demo2 = "demo_2";
return demo2;
}

}



class GSShopFactory extends ShopFactory  {

	public getNewPrimeAcc() {
		return null;

}    

	
	public  getNewNormalAcc() {
		return null;

}



}



abstract public class ShopFactory {

abstract public PrimeAcc getNewPrimeAcc();


abstract public NormalAcc getNewNormalAcc();

}
class GSPrimeAcc extends PrimeAcc{
	
	public GSPrimeAcc(int AccNo, String AccNm, float charges, boolean isPrime) {
		super(AccNo, AccNm, charges, isPrime);
	}

	private static final float Charges = 5;

	
	public void bookproduct() {
	}
	
	
	public String toString() {
		return null;
	}
public class GSNormalAcc extends NormalAcc {

		public GSNormalAcc(int AccNo, String AccNm, float charges, float deliveryCharges) {
			super(AccNo, AccNm, charges, deliveryCharges);		
		}
		
		public void bookproduct() {
			
		}

		
		public String toString() {
		    String demo ="demo";
		    return demo;
		
		}
		
	}



public static void main(String[] args) {
// TODO Auto-generated method stub

}

}