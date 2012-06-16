package com.mindrius.fuelcontrol.model;

import java.math.BigDecimal;

public class FuelAmount {

	private VolumeUnity volumeUnity;
	private BigDecimal amount;

	public FuelAmount(BigDecimal amount, VolumeUnity volumeUnity) {
		this.amount = amount;
		this.volumeUnity = volumeUnity;
	}

	public VolumeUnity getVolumeUnity() {
		return volumeUnity;
	}

	public BigDecimal getAmount() {
		return amount;
	}

}
