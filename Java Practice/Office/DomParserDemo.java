package Office;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class DomParserDemo {

        public static void main(String[] args) {

                try {
                        Document doc = convertStringToDocument(
                                        "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Rowsets>\n\t<Rowset>\n\t\t<Columns>\n\t\t\t<Column Description=\"Type of message S (Success), W (Warning), E (Error)\" MaxRange=\"1\" MinRange=\"0\" Name=\"Message_Type\" SQLDataType=\"1\" SourceColumn=\"Message_Type\"/>\n\t\t\t<Column Description=\"Text of the message\" MaxRange=\"1\" MinRange=\"0\" Name=\"Message\" SQLDataType=\"1\" SourceColumn=\"Message\"/>\n\t\t\t<Column Description=\"Production Comment Handle\" MaxRange=\"1\" MinRange=\"0\" Name=\"Production_Comment\" SQLDataType=\"1\" SourceColumn=\"Production_Comment\"/>\n\t\t\t<Column Description=\"User ID\" MaxRange=\"1\" MinRange=\"0\" Name=\"UserID\" SQLDataType=\"1\" SourceColumn=\"UserID\"/>\n\t\t</Columns>\n\t\t<Row>\n\t\t\t<Message_Type>S</Message_Type>\n\t\t\t<Message>Entry_Created</Message>\n\t\t\t<Production_Comment>ProductionCommentBO:FFF1,ShopOrderBO:FFF1,1000076910,22</Production_Comment>\n\t\t\t<UserID>NG8291D</UserID>\n\t\t</Row>\n\t</Rowset>\n</Rowsets>");

                        System.out.println(doc);

                        String str = convertDocumentToString(doc);

                        System.out.println(str);
                        // File inputFile = new File("Java Practice/Office/input.txt");
                        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                        // Document doc = dBuilder.parse(doc2);
                        doc.getDocumentElement().normalize();
                        System.out.println("Root element :" +
                                        doc.getDocumentElement().getNodeName());
                        NodeList nList = doc.getElementsByTagName("Row");
                        System.out.println("----------------------------");
                        Node nNode = nList.item(0);
                        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                Element eElement = (Element) nNode;
                                System.out.println(
                                                eElement.getElementsByTagName("Message_Type").item(0).getTextContent());
                        }
                        // for (int temp = 0; temp < nList.getLength(); temp++) {
                        // Node nNode = nList.item(temp);
                        // System.out.println("\nCurrent Element :" + nNode.getNodeName());

                        // if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        // Element eElement = (Element) nNode;
                        // System.out.println("Student roll no : "
                        // + eElement.getAttribute("rollno"));
                        // System.out.println("First Name : "
                        // + eElement
                        // .getElementsByTagName("firstname")
                        // .item(0)
                        // .getTextContent());
                        // System.out.println("Last Name : "
                        // + eElement
                        // .getElementsByTagName("lastname")
                        // .item(0)
                        // .getTextContent());
                        // System.out.println("Nick Name : "
                        // + eElement
                        // .getElementsByTagName("nickname")
                        // .item(0)
                        // .getTextContent());
                        // String marks = "0";

                        // marks = eElement
                        // .getElementsByTagName("marks") != null
                        // ? eElement.getElementsByTagName("marks")
                        // .item(0) != null
                        // ? eElement
                        // .getElementsByTagName(
                        // "marks")

                        // .item(0)
                        // .getTextContent() != null
                        // ? eElement
                        // .getElementsByTagName(
                        // "marks")
                        // .item(0)
                        // .getTextContent()
                        // : "0"
                        // : "0"
                        // : "0";

                        // System.out.println("Marks : " + marks);
                        // }
                        // }
                } catch (

                Exception e) {
                        e.printStackTrace();
                }
        }

        private static Document convertStringToXMLDocument(String xmlString) {
                // Parser that produces DOM object trees from XML content
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                // File inputFile = new File("Java Practice/Office/input.txt");
                // API to obtain DOM Document instance
                DocumentBuilder builder = null;
                try {
                        // Create DocumentBuilder with default configuration
                        builder = factory.newDocumentBuilder();

                        // Parse the content to Document object
                        Document doc = builder.parse(new InputSource(new StringReader(xmlString)));

                        return doc;
                } catch (Exception e) {
                        e.printStackTrace();
                }
                return null;
        }

        private static String convertDocumentToString(Document doc) {
                TransformerFactory tf = TransformerFactory.newInstance();
                Transformer transformer;
                try {
                        transformer = tf.newTransformer();
                        // below code to remove XML declaration
                        // transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
                        StringWriter writer = new StringWriter();
                        transformer.transform(new DOMSource(doc), new StreamResult(writer));
                        String output = writer.getBuffer().toString();
                        return output;
                } catch (TransformerException e) {
                        e.printStackTrace();
                }

                return null;
        }

        private static Document convertStringToDocument(String xmlStr) {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder;
                try {
                        builder = factory.newDocumentBuilder();
                        Document doc = builder.parse(new InputSource(new StringReader(xmlStr)));
                        return doc;
                } catch (Exception e) {
                        e.printStackTrace();
                }
                return null;
        }
}