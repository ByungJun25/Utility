package com.bjstudio.utility.encryption;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class Encrytor {

	private static final Logger logger = Logger.getLogger(Encrytor.class.getName());
	private final String MD2 = "MD2";
	private final String MD5 = "MD5";
	private final String SHA1 = "SHA-1";
	private final String SHA256 = "SHA-256";
	private final String SHA384 = "SHA-384";
	private final String SHA512 = "SHA-512";
	private boolean isLazy = false;
	private boolean isKeyStretching = false;
	private long delay = 500;
	private int count = 5;
	
	public String encryptedBCrypt(String plainText) {
		String encryptedText = BCrypt.hashpw(plainText, BCrypt.gensalt());
		
		return encryptedText;
	}
	
	public String encryptedBCrypt(String plainText, int workflow) {
		String encryptedText = BCrypt.hashpw(plainText, BCrypt.gensalt(workflow));
		
		return encryptedText;
	}
	
	public String encryptedPlainText(String algorithm, String plainText) throws NoSuchAlgorithmException, InterruptedException {
		String hashedText = "";
		hashedText = encryptedText(algorithm, plainText);
		if(hashedText != null && isLazy) {
			try {
				Thread.sleep(this.delay);
			} catch (InterruptedException e) {
				logger.info("This thread was interrupted. - encryptedMD2");
				throw new InterruptedException(e.getMessage());
			}
		}
		return hashedText;
	}

	public String encryptedMD2(String plainText) throws NoSuchAlgorithmException, InterruptedException {
		String hashedText = "";
		hashedText = encryptedText(this.MD2, plainText);
		if(hashedText != null && isLazy) {
			try {
				Thread.sleep(this.delay);
			} catch (InterruptedException e) {
				logger.info("This thread was interrupted. - encryptedMD2");
				throw new InterruptedException(e.getMessage());
			}
		}
		return hashedText;
	}
	
	public String encryptedMD5(String plainText) throws NoSuchAlgorithmException, InterruptedException {
		String hashedText = "";
		hashedText = encryptedText(this.MD5, plainText);
		if(hashedText != null && isLazy) {
			try {
				Thread.sleep(this.delay);
			} catch (InterruptedException e) {
				logger.info("This thread was interrupted. - encryptedMD5");
				throw new InterruptedException(e.getMessage());
			}
		}
		return hashedText;
	}
	
	public String getSHA1(String plainText) throws NoSuchAlgorithmException, InterruptedException {
		String hashedText = "";
		hashedText = encryptedText(this.SHA1, plainText);
		if(hashedText != null && isLazy) {
			try {
				Thread.sleep(this.delay);
			} catch (InterruptedException e) {
				logger.info("This thread was interrupted. - getSHA1");
				throw new InterruptedException(e.getMessage());
			}
		}
		return hashedText;
	}
	
	public String getSHA256(String plainText) throws NoSuchAlgorithmException, InterruptedException {
		String hashedText = "";
		hashedText = encryptedText(this.SHA256, plainText);
		if(hashedText != null && isLazy) {
			try {
				Thread.sleep(this.delay);
			} catch (InterruptedException e) {
				logger.info("This thread was interrupted. - getSHA256");
				throw new InterruptedException(e.getMessage());
			}
		}
		return hashedText;
	}
	
	public String getSHA384(String plainText) throws NoSuchAlgorithmException, InterruptedException {
		String hashedText = "";
		hashedText = encryptedText(this.SHA384, plainText);
		if(hashedText != null && isLazy) {
			try {
				Thread.sleep(this.delay);
			} catch (InterruptedException e) {
				logger.info("This thread was interrupted. - getSHA384");
				throw new InterruptedException(e.getMessage());
			}
		}
		return hashedText;
	}
	
	public String getSHA512(String plainText) throws NoSuchAlgorithmException, InterruptedException {
		String hashedText = "";
		hashedText = encryptedText(this.SHA512, plainText);
		if(hashedText != null && isLazy) {
			try {
				Thread.sleep(this.delay);
			} catch (InterruptedException e) {
				logger.info("This thread was interrupted. - getSHA512");
				throw new InterruptedException(e.getMessage());
			}
		}
		return hashedText;
	}
	
	public boolean isLazy() {
		return isLazy;
	}

	public void setLazy(boolean isLazy) {
		this.isLazy = isLazy;
	}

	public long getDelay() {
		return delay;
	}

	public void setDelay(long delay) {
		this.delay = delay;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean isKeyStretching() {
		return isKeyStretching;
	}

	public void setKeyStretching(boolean isKeyStretching) {
		this.isKeyStretching = isKeyStretching;
	}

	private String encryptedText(String algorithm, String plainText) throws NoSuchAlgorithmException {
		String hashedText = "";

		try {
			MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
			
			messageDigest.update(plainText.getBytes());
			byte byteDate[] = messageDigest.digest();
			
			if(this.isKeyStretching()) {
				for(int i = 0; i < this.getCount(); i++) {
					messageDigest.update(byteDate);
					byteDate = messageDigest.digest();
				}
			}
			
			hashedText = new BigInteger(1, byteDate).toString(16);
			
		} catch (NoSuchAlgorithmException e) {
			logger.info(algorithm + " is not supported.");
			throw new NoSuchAlgorithmException(algorithm + " is not supported.");
		}
		
		return hashedText;
	}

}
