package org.hazelcast.demo.nw.data.avro;

import java.util.Date;

/**
 * This class is generated by the PadoGrid Code Generator. You can modify this
 * class as needed. It will not be overwritten when you generate it again later.
 * 
 * The generated class has been modified to handle Date objects.
 * 
 * @since Thu Jul 09 11:13:59 EDT 2020
 * @author dpark
 * @see <a href=
 *      "https://github.com/padogrid/padogrid">https://github.com/padogrid/padogrid</a>
 */
public class Order extends org.hazelcast.demo.nw.data.avro.generated.__Order {
	
	private static int TIME_MICRO = 1000;
	
	public Order() {
		super();
	}

	public void setOrderDateObj(Date date) {
		if (date == null) {
			super.setOrderDate(null);
		} else {
			super.setOrderDate(date.getTime());
		}
	}

	public Date getOrderDateObj() {
		Long dateLong = super.getOrderDate();
		if (dateLong == null) {
			return null;
		} else {
			return new Date(dateLong/TIME_MICRO);
		}
	}

	public void setShippedDateObj(Date date) {
		if (date == null) {
			super.setShippedDate(null);
		} else {
			super.setShippedDate(date.getTime());
		}
	}

	public Date getShippedDateObj() {
		Long dateLong = super.getShippedDate();
		if (dateLong == null) {
			return null;
		} else {
			return new Date(dateLong/TIME_MICRO);
		}
	}

	public void setRequiredDateObj(Date date) {
		if (date == null) {
			super.setRequiredDate(null);
		} else {
			super.setRequiredDate(date.getTime());
		}
	}

	public Date getRequiredDateObj() {
		Long dateLong = super.getRequiredDate();
		if (dateLong == null) {
			return null;
		} else {
			return new Date(dateLong/TIME_MICRO);
		}
	}
	
	public String toString() {
		return super.toString() + ": getOrderDateObj()=" + getOrderDateObj() + ", getShippedDateObj()=" + getShippedDateObj() + "getRequiredDateObj()=" + getRequiredDateObj();
	}
}
