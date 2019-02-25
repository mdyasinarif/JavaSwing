package xml;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;

public class DOMCreateXMLDemo {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBilder = docFactory.newDocumentBuilder();

            Document doc = docBilder.newDocument();
            
            Element rootElement = doc.createElement("company");
            doc.appendChild(rootElement);

            Element staff = doc.createElement("staff");
            rootElement.appendChild(staff);
            
            Attr attr = doc.createAttribute("id");
            attr.setValue("1000");
            staff.setAttributeNode(attr);
            
            
            Element firstname = doc.createElement("firstname");
            firstname.appendChild(doc.createTextNode("Yasin"));
            staff.appendChild(firstname);
            
            Element lastname = doc.createElement("lastname");
            lastname.appendChild(doc.createTextNode("Arif"));
            staff.appendChild(lastname);
            
            Element salary = doc.createElement("salary");
            salary.appendChild(doc.createTextNode("10000"));
            staff.appendChild(salary);
            
            Element country = doc.createElement("country");
            country.appendChild(doc.createTextNode("BD"));
            staff.appendChild(country);
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer  transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("company.xml"));
            transformer.transform(source, result);
            
            System.out.println("File Svaed!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
