package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;
@Entity
@Table(name = "prod_table")
@EnableTransactionManagement
public class Product {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "productId")
		private int id;
		@Column(name = "productname")
		private String productName;
		
		@Column(name = "season")
		private String season;
		
		@Column(name = "brand")
		private String brand;
		
		@Column(name = "category")
		private String category;
		
		@Column(name = "price")
		private int price;
		
		@Column(name = "color")
		private String color;
		
		@Column(name = "createddate")
		private String createdDate;
		
		@Column(name = "discount")
		private int discount;
		
		@Column(name = "quantity")
		private int quantity;
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getproductName() {
			return productName;
		}

		public void setproductName(String productName) {
			this.productName = productName;
		}

		public String getseason() {
			return season;
		}

		public void setseason(String season) {
			this.season = season;
		}
		public String getbrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getcatagory() {
			return category;
		}

		public void setcategory(String catagory) {
			this.category = catagory;
		}
		public int getprice() {
			return price;
		}

		public void setprice(int price) {
			this.price = price;
		}
		public String getcolor() {
			return color;
		}

		public void setcolor(String color) {
			this.color = color;
		}
		
		public String getcreatedDate() {
			return createdDate;
		}

		public void setcreatedDate(String createdDate) {
			this.createdDate = createdDate;
		}
		public int getdiscount() {
			return discount;
		}

		public void setdiscount(int discount) {
			this.discount = discount;
		}
		public int getquantity() {
			return quantity;
		}

		public void setquantity(int quantity) {
			this.quantity = quantity;
		}
}
