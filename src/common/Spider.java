package common;

import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public abstract class Spider {
	Document document;
	public Spider(String url)
	{
		try {
			document = Jsoup.connect(url)
					.data("query", "Java")
					.userAgent("Mozilla/5.0 (Windows NT 6.1)")
					.cookie("auth", "token")
					.timeout(30000)
					.get();   //.get();
//Elements tds = document.getElementsByTag("td");
//				Elements recomms = document.select("div.recommendations-bd");
//				Elements dds = recomms.get(0).select("dd");
//				for (Element dd : dds) {
//					String newurl = dd.select("a[href]").get(0).absUrl("href");
//					newurl = newurl.substring(0,newurl.indexOf("/?from"));
//					System.out.println(newurl);
//					newurllist.add(newurl);
//				}
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
		public static void main(String[] args) {
			

		}
	}

