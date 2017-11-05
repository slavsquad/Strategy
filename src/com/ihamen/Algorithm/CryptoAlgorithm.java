package com.ihamen.Algorithm;

/**
 * Created by stepanenko.sg on 04.11.2017.
 */
public interface CryptoAlgorithm {
    public byte[] encrypt(byte[] message);
    public byte[] decrypt(byte [] message);
}
