package com.ihamen.Algorithm;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by stepanenko.sg on 04.11.2017.
 */
public class AESCryptoAlgorithm implements CryptoAlgorithm {
    @Override
    public byte[] encrypt(byte[] data) {
        try{

            Cipher cipher = Cipher.getInstance("AES");

            SecretKeySpec key = new SecretKeySpec("keyMostBe16Bytes".getBytes(),"AES");

            cipher.init(Cipher.ENCRYPT_MODE,key);

            return cipher.doFinal(data);

        }catch (Exception ex){
            ex.printStackTrace();
        }

        return null;
    }

    @Override
    public byte[] decrypt(byte[] data) {
        try{

            SecretKeySpec key = new SecretKeySpec("keyMostBe16Bytes".getBytes(),"AES");
            Cipher decipher = Cipher.getInstance("AES");
            decipher.init(Cipher.DECRYPT_MODE,key);
            return decipher.doFinal(data);

        }catch (Exception ex){
            ex.printStackTrace();
        }

        return null;
    }
}
