package cn.zmy.day22.itcast_01;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
//			write();
			read();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void write() throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\Documents\\files\\dos.txt"));
		dos.writeByte(123);// int
		dos.writeShort(123);//
		dos.writeBoolean(true);
		dos.writeDouble(123.00);
		dos.writeFloat(1232.50F);
		dos.close();
	}

	public static void read() throws IOException {
		DataInputStream dis = new DataInputStream(new FileInputStream("E:\\Documents\\files\\dos.txt"));
		System.out.println(dis.readByte());
		System.out.println(dis.readShort());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readDouble());
		System.out.println(dis.readFloat());
		dis.close();
	}

}
