package com.ihamen.Context;

import com.ihamen.Algorithm.CryptoAlgorithm;

/**
 * Created by stepanenko.sg on 04.11.2017.
 */
public class CryptoChat {
    CryptoAlgorithm cryptoAlgorithm;

    public CryptoChat(CryptoAlgorithm cryptoAlgorithm) {
        this.cryptoAlgorithm = cryptoAlgorithm;
    }

    public byte[] encryptMessage(String message)throws Exception{
        return cryptoAlgorithm.encrypt(message.getBytes());
    }

    public String decryptMessage(byte[] cypher)throws Exception{
        String message = new String(cryptoAlgorithm.decrypt(cypher),"UTF-8");
        return message;
    }

    public void setCryptoAlgorithm(CryptoAlgorithm cryptoAlgorithm){
        this.cryptoAlgorithm = cryptoAlgorithm;
    }

    public CryptoAlgorithm getCryptoAlgorithm() {
        return cryptoAlgorithm;
    }
}
