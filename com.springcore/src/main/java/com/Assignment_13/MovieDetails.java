package com.Assignment_13;

public class MovieDetails {

    String mName;
    String ShowTime;
    double ticketPrice;
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getShowTime() {
		return ShowTime;
	}
	public void setShowTime(String showTime) {
		ShowTime = showTime;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	@Override
	public String toString() {
		return "MovieDetails [mName=" + mName + ", ShowTime=" + ShowTime + ", ticketPrice=" + ticketPrice + "]";
	}
    


}