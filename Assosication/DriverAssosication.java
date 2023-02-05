package Week2;

class CabServiceProvider{
	private String cabsn;
	private int totalcabs;
	public double rewardprice;

CabServiceProvider(String cabsn, int totalcabs){
	this.cabsn=cabsn;
	this.totalcabs=totalcabs;
	
}


public String getCabsn() {
	return cabsn;
}

public void setCabsn(String cabsn) {
	this.cabsn = cabsn;
}

public int getTotalcabs() {
	return totalcabs;
}

public void setTotalcabs(int totalcabs) {
	this.totalcabs = totalcabs;
}

public double getRewardprice() {
	return rewardprice;
}


public void setRewardprice(double rewardprice) {
	this.rewardprice = rewardprice;
}


double crp(Driver driver) {
	if(cabsn=="Halo") {
		if(driver.getAverageRating()>=4.5 && driver.getAverageRating()<=5) {
			rewardprice=10*driver.getAverageRating();
		}
		else if(driver.getAverageRating()>=4 && driver.getAverageRating()<4.5) {
			rewardprice=5*driver.getAverageRating();
		}
		else {
			return rewardprice=0;
		}
	}
	else if(cabsn=="Aber") {
		if(driver.getAverageRating()>=4.5 && driver.getAverageRating()<=5) {
			rewardprice=8*driver.getAverageRating();
	}
		else if(driver.getAverageRating()>=4 && driver.getAverageRating()<4.5) {
			rewardprice=3*driver.getAverageRating();
		
		}
		else {
			return rewardprice=0;
		}
}
	return rewardprice;
}
}
class Driver {
	
	private String driverName;
	private float averageRating;
	
	public Driver(String driverName, float averageRating){
		this.driverName=driverName;
		this.averageRating=averageRating;
	}
	
	public String getDriverName(){
		return this.driverName;
	}
	
	public void setDriverName(String driverName){
		this.driverName=driverName;
	}
	
	public float getAverageRating(){
		return this.averageRating;
	}
	
	public void setAverageRating(float averageRating){
		this.averageRating=averageRating;
	}

    //DO NOT MODIFY THE METHOD
    //Your exercise might not be verified if the below method is modified
    public String toString(){
        return "Driver\ndriverName: "+this.driverName+"\naverageRating: "+this.averageRating;
    }
}

class DriverAssosiation {
	
	public static void main(String args[]){
	    CabServiceProvider cabServiceProvider1 = new CabServiceProvider("Halo", 50);

		Driver driver1 = new Driver("Luke", 4.8f);
		Driver driver2 = new Driver("Mark", 4.2f);
		Driver driver3 = new Driver("David", 3.9f);
		
		Driver[] driversList = { driver1, driver2, driver3 };
		for (Driver driver : driversList) {
			System.out.println("Driver Name: "+driver.getDriverName());
			double bonus = cabServiceProvider1.crp(driver);
			if (bonus>0)
				System.out.println("Bonus: $"+bonus+"\n");
			else
				System.out.println("Sorry, bonus is not available!");
		}
		
		//Create more objects of CabServiceProvider and Driver classes for testing your code
	}
}