package com.ihamen;

import com.ihamen.Algorithm.AESCryptoAlgorithm;
import com.ihamen.Algorithm.Base64CryptoAlgorithm;
import com.ihamen.Context.CryptoChat;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here

        String upComingMessage, inComingMessage;
        byte [] cypher;
        CryptoChat cryptoChat = new CryptoChat(new AESCryptoAlgorithm());

        //Testing crypto Chat
        System.out.println("Algorithm - " + cryptoChat.getCryptoAlgorithm().getClass().getSimpleName());

        upComingMessage = "Hello world! I want to congratulate everybody! Bay!";
        System.out.println("upcoming: "+ upComingMessage);

        cypher = cryptoChat.encryptMessage(upComingMessage);
        System.out.println("cypher: "+new String(cypher));

        inComingMessage = cryptoChat.decryptMessage(cypher);
        System.out.println("incoming: "+ inComingMessage);

        //Change crypto algorithm
        cryptoChat.setCryptoAlgorithm(new Base64CryptoAlgorithm());
        System.out.println();

        System.out.println("Algorithm - " + cryptoChat.getCryptoAlgorithm().getClass().getSimpleName());

        upComingMessage = "Hello world! I want to congratulate everybody! Bay!";
        System.out.println("upcoming: "+ upComingMessage);

        cypher = cryptoChat.encryptMessage(upComingMessage);
        System.out.println("cypher: "+new String(cypher));

        inComingMessage = cryptoChat.decryptMessage(cypher);
        System.out.println("incoming: "+ inComingMessage);
    }
}
