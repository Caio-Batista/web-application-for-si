package controllers;

import io.jsonwebtoken.impl.crypto.MacProvider;

import java.security.Key;

/**
 * Created by Yago on 27/05/2016.
 */
public class KeyToken {

    private static KeyToken keyToken = new KeyToken();
    private static Key key;

    private KeyToken(){
        key = MacProvider.generateKey();
    }

    public static KeyToken getInstance(){
        return keyToken;
    }

    public static Key getKey(){
        return key;
    }
}
