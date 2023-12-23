package ua.edu.ucu.apps.lab10;

import ua.edu.ucu.apps.lab10.documents.SmartDocument;

public class Main {
    public static void main(String[] args) {
        // paste file name below
        String fileName = "";
        SmartDocument sd = new SmartDocument(fileName);
        System.out.println(sd.parse());
    }
}
