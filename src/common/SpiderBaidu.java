package common;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SpiderBaidu extends Spider{
	public SpiderBaidu(String url) {
		super(url);
	}
	public List<SearchResult> Parse()
	{
		List<SearchResult> resultList = new ArrayList<SearchResult>();
		Elements divs = document.select("div.result").select(".c-container"); //class��".",id��"#"
		for (Element div : divs) {
			Element t = div.select("h3.t").first();
			Element a = t.select("a").first();
			String title = a.html();
			String url = a.attr("href").toString();
			
			SearchResult sr = new SearchResult();
			sr.title = title;
			System.out.println(url);
			
			sr.url = url;
			resultList.add(sr);
		}
		return resultList;
	}
	public static void main(String[] args) {
		SpiderBaidu sb = new SpiderBaidu("http://www.baidu.com/s?wd=南京大学&pn=20");
		sb.Parse();
		
	}
}
