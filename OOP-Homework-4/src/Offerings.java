public abstract class Offerings {
	abstract double calculateTotalSale();
}



class Product extends Offerings{
	private String productName;
	
	private double price;
	private double quantitySold;
	
	public Product (String productName, double price, double quantitySold) {
		this.productName = productName;
		this.price = price;
		this.quantitySold = quantitySold;
	}
	
	@Override
	double calculateTotalSale() {
		return price*quantitySold;
	}
}

class Service extends Offerings{
	private String serviceName;
	
	private double pricePerHour;
	private double numberOfHours;
	
	public Service (String serviceName, double pricePerHours, double numberOfHours) {
		this.serviceName = serviceName;
		this.pricePerHour = pricePerHours;
		this.numberOfHours = numberOfHours;
	}
	
	@Override
	double calculateTotalSale() {
		return pricePerHour*numberOfHours;
	}
}
