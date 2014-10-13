package common;

import java.util.ArrayList;
import java.util.List;

public class SpiderSE{
	final int maxPages = 10;
	
	public SpiderSE(){
		
	}
	
	public List<SearchResult> SpiderSE_Baidu(String keyword)
	{
		List<SearchResult> resultList = new ArrayList<SearchResult>();
		for(int i =0;i<maxPages;i++)
		{
			SpiderBaidu spider = new SpiderBaidu("http://www.baidu.com/s?wd"+"="+keyword+"&pn="+i+"0");
			List<SearchResult> resultListByPage = spider.Parse();
			resultList.addAll(resultListByPage);
		}
		return resultList;
	}
	
	public List<SearchResult> SpiderSE_Bing(String keyword)
	{
		List<SearchResult> resultList = new ArrayList<SearchResult>();
		for(int i = 0; i < maxPages; i++)
		{
			SpiderBing spider = new SpiderBing("TODO");
			List<SearchResult> resultListByPage = spider.Parse();
			resultList.addAll(resultListByPage);
		}
		return resultList;
	}
	
	public static void main(String[] args) {
		SpiderSE sb = new SpiderSE();
		sb.SpiderSE_Baidu("南京大学");
		
		
	}
}
