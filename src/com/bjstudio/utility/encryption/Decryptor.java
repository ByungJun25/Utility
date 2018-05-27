package com.bjstudio.utility.encryption;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class Decryptor {

	public boolean isValidBCryptedText(String plainText, String encryptedText) {
		boolean result = BCrypt.checkpw(plainText, encryptedText);
		
		return result;
	}
}
