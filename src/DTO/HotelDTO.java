package DTO;

public class HotelDTO {
	int intStar,intTel ; 
	String strHotelName, strAddress,strHotelId ;
	public HotelDTO () {
		
	}
	public String getStrHotelId() {
		return strHotelId;
	}
	public void setStrHotelId(String strHotelId) {
		this.strHotelId = strHotelId;
	}
	public int getIntStar() {
		return intStar;
	}
	public void setIntStar(int intStar) {
		this.intStar = intStar;
	}
	public int getIntTel() {
		return intTel;
	}
	public void setIntTel(int intTel) {
		this.intTel = intTel;
	}
	public String getStrHotelName() {
		return strHotelName;
	}
	public void setStrHotelName(String strHotelName) {
		this.strHotelName = strHotelName;
	}
	public String getStrAddress() {
		return strAddress;
	}
	public void setStrAddress(String strAddress) {
		this.strAddress = strAddress;
	}
	public static int idASC(HotelDTO a, HotelDTO b) {
		return a.getStrHotelId().compareTo(b.getStrHotelId()) ;
	}
	public static int idDESC(HotelDTO a, HotelDTO b) {
		return b.getStrHotelId().compareTo(a.getStrHotelId()) ;
	}
	
}
