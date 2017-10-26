package com.qs.parse;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.qs.model.Book;
/** 
		<div class="p-price">
<strong class="J_12122571" data-done="1"><em>￥</em><i>94.00</i></strong>		</div>
		<div class="p-name p-name-type-2">
			<a target="_blank" title="一书阅尽互联网轻量级框架SSM（Spring+Spring MVC+MyBatis）+Redis的全部奥秘" href="//item.jd.com/12122571.html" onclick="searchlog(1,12122571,3,1,'','flagsClk=1077940872')">
				<em><font class="skcolor_ljg">Java</font> EE互联网轻量级框架整合开发 SSM框架（Spring MVC+Spring+MyBatis）和Redis实现</em>
				<i class="promo-words" id="J_AD_12122571">一书阅尽互联网轻量级框架SSM（Spring+Spring MVC+MyBatis）+Redis的全部奥秘</i>
			</a>
		</div> 
		
		
		解析页面的类
*/

public class Parse {
	 public static List<Book> getData (String entity) throws Exception{
	        //获取的数据，存放在集合中
	        List<Book> data = new ArrayList<Book>();
	        //采用Jsoup解析
	        Document doc = Jsoup.parse(entity);
	        //获取html标签中的内容
	        Elements elements=doc.select("ul[class=gl-warp clearfix]").select("li[class=gl-item]");
	        for (Element ele:elements) {
	            String bookID=ele.attr("data-sku");//<div class="p-price">  <strong class="J_12122571" data-done="1">
	            String bookPrice=ele.select("div[class=p-price]").select("i").text();
	            String bookName=ele.select("div[class=p-name p-name-type-2]").select("em").text();
	            //创建一个对象，这里可以看出，使用Model的优势，直接进行封装
	            Book book=new Book();
	            //对象的值
	            book.setBookID(bookID);
	            book.setBookName(bookName);
	            book.setBookPrice(bookPrice);
	            //将每一个对象的值，保存到List集合中
	            data.add(book);
	        }
	        //返回数据
	        return data;
	    }
}
