package cn.zmy.day22.itcast_08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 * 我有一个猜数字小游戏的程序，请写一个程序实现在测试类中只能用5次，超过5次提示：游戏试玩已结束，请付费。
 */
public class PropertiesTest2 {
	private static Properties prop;
	private static File file;
	
	static {
		prop = new Properties();
		file = new File("E:\\Documents\\files\\count.txt");
	}
	
	public static void main(String[] args) throws IOException {
		if (!file.exists()) {
			file.createNewFile();
			prop.setProperty("count", "1");
			Writer w = new FileWriter(file);
			prop.store(w, null);

			GuessNumber.start();
		} else {
			Reader r = new FileReader(file);
			prop.load(r);
			r.close();
			String value = prop.getProperty("count");
			int number = Integer.parseInt(value);
			
			if (number > 5) {
				System.out.println("游戏试玩已结束，请付费");
				System.exit(0);
			} else {
				number++;
				prop.setProperty("count", String.valueOf(number));
				Writer w = new FileWriter(file);
				prop.store(w, null);
				w.close();
				
				GuessNumber.start();
			}
		}
	}
	
}
