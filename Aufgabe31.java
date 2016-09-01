package com.tobiasstraub.hfu.treffpunkt.fmud;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Aufgabe31 {
    private static int druckerCounter = 1;

    public static void main(String args[]) {
        Aufgabe31 controller = new Aufgabe31();

        DocumentBuilder builder = null;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setValidating(true);
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException ex) {
            System.out.println("Can't configure the parser.");
            System.exit(1);
        }

        Document reader = controller.parseXml(builder, "treffpunkt_fmud_a30.xml");
        HashMap<Integer, Aufgabe31Drucker> drucker = controller.getDrucker(reader);
        for (Integer druckerId : drucker.keySet()) {
            System.out.println("Drucker#" + druckerId + "\n" + drucker.get(druckerId) + "\n");
        }
    }

    private HashMap<Integer, Aufgabe31Drucker> getDrucker(Document reader) {
        HashMap<Integer, Aufgabe31Drucker> druckerMap = new HashMap<>();

        NodeList druckerNodes = reader.getElementsByTagName("drucker");
        for (int i = 0; i < druckerNodes.getLength(); i++) {
            Element druckerNode = (Element) druckerNodes.item(i);
            Aufgabe31Drucker drucker = new Aufgabe31Drucker(druckerNode.getAttribute("art"), druckerNode.getAttribute("seriennummer"), druckerNode.getAttribute("hersteller"));
            druckerMap.put(druckerCounter++, drucker);
        }

        return druckerMap;
    }

    private Document parseXml(DocumentBuilder builder, String file) {
        try {
            return builder.parse(new File(file));
        } catch (SAXException | IOException ex) {
            System.out.println("Sorry. There was a problem with the parsing.");
            System.exit(1);
        }
        return null;
    }
}