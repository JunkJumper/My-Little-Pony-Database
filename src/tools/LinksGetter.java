package tools;

/**
 * @ Author: JunkJumper
 * @ Link: https://github.com/JunkJumper
 * @ Copyright: Creative Common 4.0 (CC BY 4.0)
 * @ Create Time: 09-11-2020
 * @ Modified by: JunkJumper
 * @ Modified time: 09-11-2020
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class LinksGetter {
	
	private final static String MAIN_URL = "https://mlp.fandom.com/wiki/List_of_ponies";
	private final static String WEBSITE_URL = "https://mlp.fandom.com";
	
	  public static void getLinks() throws IOException {
		  File links = new File("./export/links.txt");
		  links.createNewFile();
		  write(getTxtListFile());
		  System.out.println("DONE ! :D");
	  }
	  
	  private static void write(List<String> l) throws IOException {
		  FileWriter wr = new FileWriter("./export/links.txt");
		      
		  for (String string : l) {
		  	  wr.write(WEBSITE_URL + string + "\n");
		  }
		  wr.close();
	  }
	  
	  private static List<String> getTxtListFile() throws IOException {
		  return parseList(getList());
	  }
	  
	  private static Elements getList() throws IOException {
		  Document doc = Jsoup.connect(MAIN_URL).get();

		  Elements ul = doc.select("li > a[href]:containsOwn(List)");
		  return ul;
	  }
	  
	  private static List<String> parseList(Elements e) {
		  List<String> l = new ArrayList<>();
		  String[] current = {""};		  
		  
		  for (int i = 1; i < e.size()-2; ++i) {
			  current = e.get(i).toString().split("\"");
			  l.add(current[1]);
		  }
		  return l;
	  }
}
