package com.qs.main;

import java.util.List;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

import com.qs.model.Book;
import com.qs.util.UrlFecter;

/**
 * @author 作者 QS:
 * @date 创建时间：2017年10月26日 上午11:31:35
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class TsetMain {

	public static void main(String[] args) throws Exception {
		HttpClient client = new DefaultHttpClient();
		String url = "https://search.jd.com/Search?keyword=java&enc=utf-8&wq=java&pvid=0415a8941e3c45408d4390ce18aa942d";
		List<Book> list = UrlFecter.URLParser(client, url);
		for (Book book : list) {
			System.out.println(
					"书的名字： " + book.getBookName() + "书的价格： " + book.getBookPrice() + "书的id： " + book.getBookID());
		}

	}

}
