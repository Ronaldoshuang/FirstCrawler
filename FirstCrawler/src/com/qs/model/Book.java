package com.qs.model;

/**
 * @author 作者 QS:
 * @date 创建时间：2017年10月26日 上午11:05:09
 * @version 1.0
 * @parameter 实体类，
 * @since
 * @return
 */
public class Book {
	private String bookID;
	private String bookName;
	private String bookPrice;

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}

}
