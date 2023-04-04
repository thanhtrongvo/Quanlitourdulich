package DTO;

public class BookingDTO {
	
	int intBookingId, intTourID, intUserId, intAdultNumber, intChildrenNumber,intStatus  ;
	String strCreatedAt   ;
	double totalCost; 
	public BookingDTO() {
		
	}
	public int getIntBookingId() {
		return intBookingId;
	}
	public void setIntBookingId(int intBookingId) {
		this.intBookingId = intBookingId;
	}
	public int getIntTourID() {
		return intTourID;
	}
	public void setIntTourID(int intTourID) {
		this.intTourID = intTourID;
	}
	public int getIntUserId() {
		return intUserId;
	}
	public void setIntUserId(int intUserId) {
		this.intUserId = intUserId;
	}
	public int getIntAdultNumber() {
		return intAdultNumber;
	}
	public void setIntAdultNumber(int intAdultNumber) {
		this.intAdultNumber = intAdultNumber;
	}
	public int getIntChildrenNumber() {
		return intChildrenNumber;
	}
	public void setIntChildrenNumber(int intChildrenNumber) {
		this.intChildrenNumber = intChildrenNumber;
	}
	public int getIntStatus() {
		return intStatus;
	}
	public void setIntStatus(int intStatus) {
		this.intStatus = intStatus;
	}
	public String getStrCreatedAt() {
		return strCreatedAt;
	}
	public void setStrCreatedAt(String strCreatedAt) {
		this.strCreatedAt = strCreatedAt;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	

	
}

