package com.qs.util;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.message.BasicHttpResponse;

/** 
* @author  作者 QS: 
* @date 创建时间：2017年10月26日 上午11:07:47
* @version 1.0 
* @parameter  访问url，获得reapone
* @since  
* @return  
*/
public class HttpUtils {
	//请求url得到response
  public static HttpResponse getRawHtml(HttpClient client,String url) throws ClientProtocolException, IOException{
	  HttpGet getMethod=new HttpGet(url);
	  HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1,
              HttpStatus.SC_OK, "OK");
	  response=client.execute(getMethod);
	  return response;
  }
}
