package tools;

/**
 * @ Author: JunkJumper
 * @ Link: https://github.com/JunkJumper
 * @ Copyright: Creative Common 4.0 (CC BY 4.0)
 * @ Create Time: 09-11-2020
 * @ Modified by: JunkJumper
 * @ Modified time: 09-11-2020
 */

public class ColorConverter {
	
	public static String convert(String hsl) {
		
		String[] tab = hsl.split(" ");
		int[] colors = {Integer.parseInt(tab[0]), Integer.parseInt(tab[1]), Integer.parseInt(tab[2])};
		
		return converterC(colors[0], colors[1], colors[2]);
	}
	
	private static String converterC(int h, int s, int l) {
		HSLColor c = new HSLColor(h, s, l);
		return String.format("#%02x%02x%02x", c.getRGB().getRed(), c.getRGB().getGreen(), c.getRGB().getBlue());  
	}
	
}
