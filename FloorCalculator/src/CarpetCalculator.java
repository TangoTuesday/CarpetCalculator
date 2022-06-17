import java.util.*;

public class CarpetCalculator implements Calculatable  {
	
	
	
	float pricePerSquareFoot;
	
	float serviceCharge; 

	ArrayList <Room> room = new ArrayList<>(); 
	
	public void addRoom(Room room) {
		
	this.room.add(room); 
		
	}

	public String getTotalCost() {
		
		float totalSquareFoot = 0; 
		
		for(Room room : room) {
			
		 totalSquareFoot += room.length * room.width; 
			
		}
		
		
		
	return	"$"+((totalSquareFoot * this.pricePerSquareFoot) + this.serviceCharge); 
	
	}

	public void addPercentDiscount(float percentDiscount) {
		
	this.pricePerSquareFoot = this.pricePerSquareFoot - (percentDiscount/100 * (this.pricePerSquareFoot)); 
	
	
	this.serviceCharge = this.serviceCharge - (percentDiscount/100 * (this.serviceCharge));
	
		
	}
	
 public CarpetCalculator () {} 

 public CarpetCalculator  (float pricePerSquareFoot) {

	 	this.pricePerSquareFoot = pricePerSquareFoot; 

}

public CarpetCalculator( float pricePerSquareFoot, float serviceCharge) {
	
	this.pricePerSquareFoot = pricePerSquareFoot; 
	this.serviceCharge = serviceCharge;
}


}
