package com.jai;

import org.apache.commons.lang3.StringUtils;

public class MaskStringExample {
	public static void main(String[] args) throws Exception {

		String str = "1234567812345678";

		// mask first 4 characters
		System.out.println(maskStringNormal(str, 0, 4, '*'));

		// mask everything but last 4 digits
		System.out.println(maskStringNormal(str, 0, 12, '*'));

		// mask everything
		System.out.println(maskStringNormal(str, 0, str.length(), '*'));

		// mask everything but first and last 4 digits
		System.out.println(maskStringNormal(str, 1, 12, '*'));

		// mask first 4 characters
		System.out.println(maskStringApacheAPI(str, 0, 4, '*'));

		// mask everything but last 4 digits
		System.out.println(maskStringApacheAPI(str, 0, 12, '*'));

		// mask everything
		System.out.println(maskStringApacheAPI(str, 0, str.length(), '*'));

		// mask everything but first and last 4 digits
		System.out.println(maskStringApacheAPI(str, 1, 12, '*'));

		 String[] emailIds = {
	                "a@abc.com",
	                "helloworld@gmail.com",
	                "alex@yahoo.com",
	                "gz@alpha.com"
	        };
	        
	        for(String emailId : emailIds)
	            System.out.println(maskEmailAddress(emailId, '*'));
		
	}

	private static String maskStringNormal(String strText, int start, int end, char maskChar) throws Exception {

		if (strText == null || strText.equals(""))
			return "";

		if (start < 0)
			start = 0;

		if (end > strText.length())
			end = strText.length();

		if (start > end)
			throw new Exception("End index cannot be greater than start index");

		int maskLength = end - start;

		if (maskLength == 0)
			return strText;

		StringBuilder sbMaskString = new StringBuilder(maskLength);

		for (int i = 0; i < maskLength; i++) {
			sbMaskString.append(maskChar);
		}

		return strText.substring(0, start) + sbMaskString.toString() + strText.substring(start + maskLength);
	}

	private static String maskStringApacheAPI(String strText, int start, int end, char maskChar) throws Exception {

		if (strText == null || strText.equals(""))
			return "";

		if (start < 0)
			start = 0;

		if (end > strText.length())
			end = strText.length();

		if (start > end)
			throw new Exception("End index cannot be greater than start index");

		int maskLength = end - start;

		if (maskLength == 0)
			return strText;

		String strMaskString = StringUtils.repeat(maskChar, maskLength);

		return StringUtils.overlay(strText, strMaskString, start, end);
	}
	
	   private static String maskEmailAddress(String strEmail, char maskChar)
		        throws Exception{
		        
		        String[] parts = strEmail.split("@");
		        
		        //mask first part
		        String strId = "";
		        if(parts[0].length() < 4)
		            strId = maskString(parts[0], 0, parts[0].length(), '*');
		        else
		            strId = maskString(parts[0], 1, parts[0].length()-1, '*');
		        
		        //now append the domain part to the masked id part
		        return strId + "@" + parts[1];
		    }
		 
		    private static String maskString(String strText, int start, int end, char maskChar) 
		        throws Exception{
		        
		        if(strText == null || strText.equals(""))
		            return "";
		        
		        if(start < 0)
		            start = 0;
		        
		        if( end > strText.length() )
		            end = strText.length();
		            
		        if(start > end)
		            throw new Exception("End index cannot be greater than start index");
		        
		        int maskLength = end - start;
		        
		        if(maskLength == 0)
		            return strText;
		        
		        StringBuilder sbMaskString = new StringBuilder(maskLength);
		        
		        for(int i = 0; i < maskLength; i++){
		            sbMaskString.append(maskChar);
		        }
		        
		        return strText.substring(0, start) 
		                + sbMaskString.toString() 
		                + strText.substring(start + maskLength);
		    }
}
