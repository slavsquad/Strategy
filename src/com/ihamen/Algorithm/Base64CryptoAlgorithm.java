package com.ihamen.Algorithm;

import java.util.Base64;

/**
 * Created by stepanenko.sg on 04.11.2017.
 */
public class Base64CryptoAlgorithm implements CryptoAlgorithm {
    @Override
    public byte[] decrypt(byte[] data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return result;
    }

    @Override
    public byte[] encrypt(byte[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] += (byte) 1;
        }
        return Base64.getEncoder().encode(data);
    }
}
