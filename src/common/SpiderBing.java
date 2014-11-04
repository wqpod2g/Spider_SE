package common;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SpiderBing extends Spider{
	public SpiderBing(String url) {
		super(url);
	}
	public List<SearchResult> Parse()
	{
		List<SearchResult> resultList = new ArrayList<SearchResult>();
		//Element div = document.select("#b_content").first(); 
		
			Elements ts = document.select(".b_algo");
			for(Element t:ts){
			Element a = t.select("a").first();
			String title = a.text();
			String url = a.attr("href").toString();
			
			SearchResult sr = new SearchResult();
			sr.title = title;
			System.out.println(title);
			sr.url = url;
			resultList.add(sr);
			}
				
		return resultList;
	}
	public static void main(String[] args) {
		String s="";
		try {
			s=URLEncoder.encode("南京大学","utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SpiderBing sb = new SpiderBing("http://cn.bing.com/search?q="+s+"&first=1");
		sb.Parse();
	}
}
