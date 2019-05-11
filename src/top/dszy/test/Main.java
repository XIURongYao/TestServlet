package top.dszy.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;

/**
 * 
 * @author dashuizhuyu@qq.com
 *
 */
public class Main {
	
	public static void main(String[] args) throws Exception {
		String str = "name=dszy&age=dszy";
		DataInputStream inputStream = new DataInputStream(new ByteArrayInputStream(str.getBytes()));
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		byte[] buffer = new byte[2048];
		int n;
		while((n=inputStream.read(buffer)) != -1) {
			outputStream.write(buffer,0,n);
		}
		String insStr = new String(outputStream.toByteArray());
		inputStream.close();
		outputStream.close();
		System.out.println("解析后的字符串：" + insStr);
		
		
		
	}

}
