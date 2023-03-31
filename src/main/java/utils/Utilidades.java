package utils;

import java.security.SecureRandom;
import java.util.Random;

public class Utilidades {

	 public static String generateRandomEmail() {
	        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "aol.com", "example.com", "test.com"};
	        Random rand = new Random();
	        int domainIndex = rand.nextInt(domains.length);
	        String domain = domains[domainIndex];
	        String username = getRandomString(8);
	        String email = username + "@" + domain;
	        return email;
	    }
	    
	    public static String getRandomString(int length) {
	        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        Random rand = new Random();
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < length; i++) {
	            int index = rand.nextInt(charSet.length());
	            char randomChar = charSet.charAt(index);
	            sb.append(randomChar);
	        }
	        return sb.toString();
	    }

	    public static String generatePassword() {
	    	String CHAR_SET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		    String SPECIAL_CHAR_SET = "$?¡/*-(),.+";
		    int MIN_LENGTH = 8;
		    int MAX_LENGTH = 16;
		    SecureRandom random = new SecureRandom();
	        StringBuilder passwordBuilder = new StringBuilder();
	        int length = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
	        boolean hasUpperCase = false;
	        boolean hasLowerCase = false;
	        boolean hasNumber = false;
	        boolean hasSpecialChar = false;
	        while (passwordBuilder.length() < length) {
	            char randomChar = CHAR_SET.charAt(random.nextInt(CHAR_SET.length()));
	            if (Character.isUpperCase(randomChar)) {
	                hasUpperCase = true;
	            } else if (Character.isLowerCase(randomChar)) {
	                hasLowerCase = true;
	            } else if (Character.isDigit(randomChar)) {
	                hasNumber = true;
	            } else if (SPECIAL_CHAR_SET.indexOf(randomChar) != -1) {
	                hasSpecialChar = true;
	            }
	            passwordBuilder.append(randomChar);
	        }
	        if (!hasUpperCase) {
	            char randomChar = Character.toUpperCase(CHAR_SET.charAt(random.nextInt(CHAR_SET.length())));
	            passwordBuilder.setCharAt(random.nextInt(passwordBuilder.length()), randomChar);
	        }
	        if (!hasLowerCase) {
	            char randomChar = Character.toLowerCase(CHAR_SET.charAt(random.nextInt(CHAR_SET.length())));
	            passwordBuilder.setCharAt(random.nextInt(passwordBuilder.length()), randomChar);
	        }
	        if (!hasNumber) {
	            char randomChar = Character.forDigit(random.nextInt(10), 10);
	            passwordBuilder.setCharAt(random.nextInt(passwordBuilder.length()), randomChar);
	        }
	        if (!hasSpecialChar) {
	            char randomChar = SPECIAL_CHAR_SET.charAt(random.nextInt(SPECIAL_CHAR_SET.length()));
	            passwordBuilder.setCharAt(random.nextInt(passwordBuilder.length()), randomChar);
	        }
	        return passwordBuilder.toString();
	    }

}
