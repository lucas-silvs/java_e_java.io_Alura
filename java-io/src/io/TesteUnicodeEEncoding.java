package io;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "C";
		
		System.out.println(s.codePointAt(0));
		
		Charset chardefault = Charset.defaultCharset();
		System.out.println(chardefault.displayName());

		byte[] bytesc = s.getBytes("UTF-8");
		System.out.println(bytesc.length + ", UTF-8");
		String cEmUtf8 = new String(bytesc);
		System.out.println(cEmUtf8+" , UTF-8");
		
		byte[] bytesutf16 = s.getBytes("UTF-16");
		System.out.println(bytesutf16.length + ", UTF-16");
		String cEmUtf16 = new String(bytesutf16);
		System.out.println(cEmUtf16+ ", UTF-16");
		
		byte[] bytesAscii = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytesAscii.length + ", ASCII");
		String cEmUSAscii = new String(bytesAscii);
		System.out.println(cEmUSAscii+ ", ASCII");
		
	}
	
	
}
