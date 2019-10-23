package com.cts.paypal.mysamples.Impl;

import java.util.Base64;
import java.util.UUID;

public class Base64EncodeDecode {

	public static void main(String[] args) {
		String originalInput = "My name is balaji";
		String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
		System.out.println(encodedString);
		byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
		String decodedString = new String(decodedBytes);
		System.out.println(decodedString);

		String originalUrl = "https://www.google.co.nz/?gfe_rd=cr&ei=dzbFV&gws_rd=ssl#q=java";
		String encodedUrl = Base64.getUrlEncoder().encodeToString(originalUrl.getBytes());
		System.out.println(encodedUrl);
		
		byte[] decodedBytesUrl = Base64.getUrlDecoder().decode(encodedUrl);
		String decodedUrl = new String(decodedBytesUrl);
		System.out.println(decodedUrl);
		
		
		byte[] encodedAsBytes = new StringBuilder("My encoded string").toString().getBytes();
		String encodedMime = Base64.getMimeEncoder().encodeToString(encodedAsBytes);
		System.out.println(encodedMime);
		String decodedMime = Base64.getMimeDecoder().decode(encodedMime).toString();
		System.out.println(decodedMime);

	}
	

}
