package com.tobiasstraub.hfu.treffpunkt.fmud;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Aufgabe32 {
    private static int druckerCounter = 1;

    public static void main(String args[]) {
        Aufgabe32 controller = new Aufgabe32();

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
        HashMap<Integer, Aufgabe32Drucker> drucker = controller.getDrucker(reader);
        for (Integer druckerId : drucker.keySet()) {
            System.out.println("Drucker#" + druckerId + "\n" + drucker.get(druckerId) + "\n");
        }

        Document document = builder.newDocument();
        Element root = document.createElement("druckerliste");
        document.appendChild(root);
        HashMap<Integer, Aufgabe32Drucker> sortedDrucker = controller.sortDrucker(drucker);
        for (Aufgabe32Drucker sortedDruckerVal : sortedDrucker.values()) {
            Element druckerNode = document.createElement("drucker");
            druckerNode.setAttribute("art", sortedDruckerVal.getArt());
            druckerNode.setAttribute("seriennummer", sortedDruckerVal.getSeriennummer());
            druckerNode.setAttribute("hersteller", sortedDruckerVal.getHersteller());
            root.appendChild(druckerNode);
        }
        controller.createXml(document, "treffpunkt_fmud_a32.xml", "treffpunkt_fmud_a29.dtd");
    }

    private HashMap<Integer, Aufgabe32Drucker> getDrucker(Document reader) {
        HashMap<Integer, Aufgabe32Drucker> druckerMap = new HashMap<>();

        NodeList druckerNodes = reader.getElementsByTagName("drucker");
        for (int i = 0; i < druckerNodes.getLength(); i++) {
            Element druckerNode = (Element) druckerNodes.item(i);
            Aufgabe32Drucker drucker = new Aufgabe32Drucker(druckerNode.getAttribute("art"), druckerNode.getAttribute("seriennummer"), druckerNode.getAttribute("hersteller"));
            druckerMap.put(druckerCounter++, drucker);
        }

        return druckerMap;
    }

    private HashMap<Integer, Aufgabe32Drucker> sortDrucker(HashMap<Integer, Aufgabe32Drucker> hashMap) {
        Set<Map.Entry<Integer, Aufgabe32Drucker>> entries = hashMap.entrySet();
        List<Map.Entry<Integer, Aufgabe32Drucker>> listToSort = new LinkedList<>(entries);
        Collections.sort(listToSort, new Comparator<Map.Entry<Integer, Aufgabe32Drucker>>() {
            @Override
            public int compare(Map.Entry<Integer, Aufgabe32Drucker> obj1, Map.Entry<Integer, Aufgabe32Drucker> obj2) {
                return obj1.getValue().compareTo(obj2.getValue());
            }
        });

        LinkedHashMap<Integer, Aufgabe32Drucker> sortedHashMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Aufgabe32Drucker> entry : listToSort) {
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }

        return sortedHashMap;
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

    private void createXml(Document document, String xmlFilename, String dtdFilename) {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, dtdFilename);
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(new DOMSource(document), new StreamResult(new File(xmlFilename)));
        } catch (TransformerException ex) {
            System.out.println("Sorry. There was a problem with creating the XML document.");
            System.exit(1);
        }
    }
}