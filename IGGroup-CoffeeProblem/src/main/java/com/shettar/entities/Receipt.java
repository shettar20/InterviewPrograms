/**
 * 
 */
package com.shettar.entities;

/**
 * @author Pradeep.Shettar
 *
 *         Entity class to store the receipt data.
 */
public class Receipt {

	/**
	 * Default constructor for the Receipt type.
	 */
	public Receipt() {
	}

	/**
	 * receiptNumber to store the unique id of the Receipt.
	 */
	private String receiptNumber;

	/**
	 * order to store the order details made by the customer.
	 */
	private Order order;

	/**
	 * totalCost to store the total cost of the orders made.
	 */
	private Double totalCost;

	/**
	 * @param receiptNumber
	 * @param order
	 * @param totalCost
	 */
	public Receipt(String receiptNumber, Order order, Double totalCost) {
		super();
		this.receiptNumber = receiptNumber;
		this.order = order;
		this.totalCost = totalCost;
	}

	/**
	 * @return the receiptNumber
	 */
	public String getReceiptNumber() {
		return receiptNumber;
	}

	/**
	 * @param receiptNumber
	 *            the receiptNumber to set
	 */
	public void setReceiptNumber(String receiptNumber) {
		this.receiptNumber = receiptNumber;
	}

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @param order
	 *            the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 * @return the totalCost
	 */
	public Double getTotalCost() {
		return totalCost;
	}

	/**
	 * @param totalCost
	 *            the totalCost to set
	 */
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((order == null) ? 0 : order.hashCode());
		result = prime * result + ((receiptNumber == null) ? 0 : receiptNumber.hashCode());
		result = prime * result + ((totalCost == null) ? 0 : totalCost.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Receipt other = (Receipt) obj;
		if (order == null) {
			if (other.order != null)
				return false;
		} else if (!order.equals(other.order))
			return false;
		if (receiptNumber == null) {
			if (other.receiptNumber != null)
				return false;
		} else if (!receiptNumber.equals(other.receiptNumber))
			return false;
		if (totalCost == null) {
			if (other.totalCost != null)
				return false;
		} else if (!totalCost.equals(other.totalCost))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Receipt [receiptNumber=" + receiptNumber + ", order=" + order + ", totalCost=" + totalCost + "]";
	}

}