package Week2;

class Shipment{
	
    public boolean checkProductNameValidity(String productName) {
        String regex="^[a-zA-Z]{1,15}\\s[a-zA-Z]{1,15}(?:\\s[a-zA-Z]{1,15})?$";
        if(productName.matches(regex)) {
        	return true;
        }
    	return false; 
	}
	
	public boolean checkProductIdValidity(String productId) {
	    String regex="[\\w]{2,20}";
	    if (productId.matches(regex)) {
	    	return true;
	    }
		//Implement your code here and change the return value accordingly
        return false; 
	}
	
	public boolean checkTrackerIdValidity(String trackerId) {
	    String regex="^[A-Z]{1}[\\:]{1}[A-Z]{4}[\\:][a-z]{3}[\\:][0-9]{2}$";
	    if(trackerId.matches(regex)) {
	    	return true;
	    }
		//Implement your code here and change the return value accordingly
        return false; 
	}
	
}

class ShipmentExp{
      
    public static void main(String[] args) {
            
        Shipment shipment = new Shipment();
        
        //Change the values for testing your code with different values
        
        String productName = "Digital Camera";
        System.out.println("The product name is "+ (shipment.checkProductNameValidity(productName) ? "valid!" : "invalid!"));

      
    
    }
}






