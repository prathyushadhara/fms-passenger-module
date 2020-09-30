package com.dxc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Passenger_Data")
public class Passenger {

	@Id
	@GeneratedValue
	private long pnrNumber;
	private String passengerName;
	private int passengerAge;
	private long passengerUIN;

	public Passenger() {
	}

	public Passenger(String passengerName, int passengerAge, long passengerUIN) {
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerUIN = passengerUIN;

	}

	public long getPnrNumber() {
		return pnrNumber;
	}

	public void setPnrNumber(long pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public long getPassengerUIN() {
		return passengerUIN;
	}

	public void setPassengerUIN(long passengerUIN) {
		this.passengerUIN = passengerUIN;
	}

	@Override
	public boolean equals(Object arg) {
		if (this == arg) {
			return true;
		}

		if (arg == null || !(arg instanceof Passenger)) {
			return false;
		}

		Passenger that = (Passenger) arg;
		boolean isequal = this.pnrNumber == that.pnrNumber;
		return isequal;
	}

}
