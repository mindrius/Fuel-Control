package com.mindrius.fuelcontrol.model;

import java.math.BigDecimal;

public class MonetaryValue {

	private BigDecimal value;
	private Currency currencyType;

	public MonetaryValue(BigDecimal value, Currency currencyType) {
		this.value = value;
		this.currencyType = currencyType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((currencyType == null) ? 0 : currencyType.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		MonetaryValue other = (MonetaryValue) obj;
		if (currencyType != other.currencyType)
			return false;

		return value.compareTo(other.value) == 0;
	}

	public BigDecimal getValue() {
		return value;
	}

	public Currency getCurrencyType() {
		return currencyType;
	}
}
