package com.kolia.encrypt;


import static com.kolia.encrypt.Encrypt.chars;

public class Decrypt {

    static String decrypted(String enc, int offset){
        char[] cipher = enc.toCharArray();
        for (int i = 0; i < cipher.length; i++)
            for (int j = 0; j < chars.length; j++)
            {
                if (j >= offset && cipher[i] == chars[j])
                {
                    cipher[i] = chars[j-offset];
                    break;
                }
                if (cipher[i] == chars[j] && j < offset)
                {
                    cipher[i] = chars[(chars.length - offset + 1) + j];
                    break;
                }
            }
        return String.valueOf(cipher);

    }
}
