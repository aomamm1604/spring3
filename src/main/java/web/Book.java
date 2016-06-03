/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

/**
 *
 * @author wufan
 */
public class Book {
	private String title;
	private double price;

	public void setTitle(String t) {
		title = t;
	}
	public String getTitle() {
		return title;
	}
	public void setPrice(double p) {
		price = p;
	}
	public double getPrice() {
		return price;
	}
}
