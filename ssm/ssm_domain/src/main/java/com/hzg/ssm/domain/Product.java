package com.hzg.ssm.domain;

import java.util.Date;

import org.springframework.stereotype.Repository;

/**
 * ��Ʒ��Ϣ
 * @author Administrator
 *
 */
@Repository
public class Product {
	private String id; // ����
	private String productNum; // ��� Ψһ 
	private String productName; // ���� 
	private String cityName; // ��������
	private Date departureTime; // ����ʱ�� 
	private String departureTimeStr; 
	private double productPrice; // ��Ʒ�۸�
	private String productDesc; // ��Ʒ���� 
	private Integer productStatus; // ״̬ 0 �ر� 1 ���� 
	private String productStatusStr;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public String getDepartureTimeStr() {
		return departureTimeStr;
	}
	public void setDepartureTimeStr(String departureTimeStr) {
		this.departureTimeStr = departureTimeStr;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public Integer getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(Integer productStatus) {
		this.productStatus = productStatus;
	}
	public String getProductStatusStr() {
		return productStatusStr;
	}
	public void setProductStatusStr(String productStatusStr) {
		this.productStatusStr = productStatusStr;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productNum=" + productNum + ", productName=" + productName + ", cityName="
				+ cityName + ", departureTime=" + departureTime + ", departureTimeStr=" + departureTimeStr
				+ ", productPrice=" + productPrice + ", productDesc=" + productDesc + ", productStatus=" + productStatus
				+ ", productStatusStr=" + productStatusStr + "]";
	}
	
	
	
}
