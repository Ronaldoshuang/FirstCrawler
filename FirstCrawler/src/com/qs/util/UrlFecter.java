package com.qs.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.util.EntityUtils;

import com.qs.model.Book;
import com.qs.parse.Parse;

/** 
* @author  作者 QS: 
* @date 创建时间：2017年10月26日 上午11:19:11
* @version 1.0  抓取页面的类
* @parameter  
* @since  
* @return  
*/
public class UrlFecter {
   public static List<Book> URLParser (HttpClient client, String url) throws Exception, IOException{
	   List<Book> list=new ArrayList<>();
	   HttpResponse reponse=HttpUtils.getRawHtml(client, url);
	   int statusCode=reponse.getStatusLine().getStatusCode();
	   if(statusCode==200){
		   String entity=EntityUtils.toString(reponse.getEntity(),"UTF-8");
		   list=Parse.getData(entity);
		   EntityUtils.consume(reponse.getEntity());
	   }else{
		   EntityUtils.consume(reponse.getEntity());
	   }
	   return list;
   }
}
