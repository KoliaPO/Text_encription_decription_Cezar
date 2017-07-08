package com.kolia.encrypt;

import static com.kolia.encrypt.Decrypt.decrypted;
import static com.kolia.encrypt.Encrypt.encrypt;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String text;
        System.out.print("Enter text: ");
        text = sc.nextLine();
        int offset = 5;

        String enc = encrypt(text,offset);
        System.out.println("Encrypted text: " + enc);

        String dec = decrypted(enc,offset);
        System.out.println("Decrypted text: " + dec);

    }
}
