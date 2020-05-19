package demo;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	// private static final String HashMap = null;

	public static void main(String[] args) {

		
		  System.setProperty("webdriver.chrome.driver",
		  "D:\\Sonal\\Projects\\Basic pgm1\\src\\chromedriver (1).exe");
		  WebDriver driver=new ChromeDriver();
		 

		// System.out.println("vghgh");
		/*
		 * int arr1[]= {12, 23,34,45}; int arr2[]= {12,34,45,57}; //int max=arr[0]; for
		 * (int i = 0,j=0; i < arr1.length; i++,j++) { if(arr1[i]>arr2[j]) {
		 * System.out.println(arr1[i]); } }
		 */

		/*
		 * String arr[]= {"bhdsbfb","frrgrgrgrg","hgfhfhjdfjdsfkdjfkd"}; String temp="";
		 * int max=0; for (int i = 0; i < arr.length; i++) { if(arr[i].length()>max) {
		 * temp=arr[i]; }
		 * 
		 * } System.out.println(temp);
		 */
		String str1 = "I Love my hubby so so much much Love ";
		char ch[] = str1.toCharArray();
		java.util.HashMap<Character, Integer> hm = new java.util.HashMap<Character, Integer>();
		for (Character tempStr : ch) {
			if (hm.get(tempStr) != null) {
				hm.put(tempStr, hm.get(tempStr) + 1);
			} else {
				hm.put(tempStr, 1);
			}

		}
		// System.out.println(hm);
		Iterator<Character> itr = hm.keySet().iterator();
		while (itr.hasNext()) {
			Character temp = itr.next();
			if (hm.get(temp) > 1) {
				System.out.println(hm.get(temp));
			}
		}

	}

}
