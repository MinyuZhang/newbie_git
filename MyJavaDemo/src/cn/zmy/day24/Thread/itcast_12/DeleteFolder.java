package cn.zmy.day24.Thread.itcast_12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class DeleteFolder {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String timeStr = "2019-08-21 10:05";
		Date date = sdf.parse(timeStr);
		Timer t = new Timer();
		DeleteFolderTask dft = new DeleteFolderTask();
		t.schedule(dft, date);
	}
}
