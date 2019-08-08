package cn.zmy.day22.itcast.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import cn.zmy.day22.itcast.exception.Exception1;
import cn.zmy.day22.itcast.pojo.User;

/**
 * E:\\Documents\\files\\dir\\userinfo.properties存储信息
 * 
 * @author zmy
 *
 */
public class UserDaoImpl extends UserDao {
	private static String basePath;
	private static BufferedReader br;
	private static BufferedWriter bw;
	private static String directory;
	private static String file_name;
	private static String uri;
	private static String charsetName;
	private static String name_pwd_sep;
	private static final String seper = File.separator;
	private static final Properties pro = new Properties();

	static {
		try {
			basePath = new File("").getCanonicalPath() + seper + "src" + seper + "cn" + seper + "zmy" + seper + "day22"
					+ seper + "itcast" + seper + "resource" + seper + "info.properties";
			pro.load(Files.newInputStream(Paths.get(basePath)));
			directory = pro.getProperty("directory");
			file_name = pro.getProperty("file_name");
			charsetName = pro.getProperty("charsetName");
			name_pwd_sep = pro.getProperty("name_pwd_sep");
			uri = directory + seper + file_name;
			File f = new File(directory);
			if (!f.exists()) {
				f.mkdirs();
			}
			// new FileOutputStream(string filename, boolean append)启动追加模式
			br = new BufferedReader(new InputStreamReader(new FileInputStream(uri), charsetName));
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(uri, true), charsetName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean login(String username, String password) throws IOException {
		if (username.length() <= 0 || password.length() <= 0) {
			throw new Exception1("用户名或密码不能为空");
		}
		String line = null;
		boolean flag = false;// 登录标志true
		while ((line = br.readLine()) != null) {
			String[] info = line.split(name_pwd_sep);
			if (info[0].equals(username)) {
				if (info[1].equals(password)) {
					flag = true;// 登录成功
				}
			}
		}
		return flag ? true : false;
	}

	@Override
	public void registe(User user) throws IOException {
		String username = user.getUsername();
		String password = user.getPassword();
		bw.write(username + name_pwd_sep + password);
		bw.newLine();
		bw.flush();
	}

	public static void main(String[] args) throws IOException {
		System.out.println(uri);
		System.out.println(bw);
	}
}
