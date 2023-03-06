import java.io.File;
import java.lang.module.ModuleDescriptor.Builder;
import java.util.jar.Attributes.Name;

import javax.lang.model.element.Element;
import javax.naming.NameAlreadyBoundException;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLParser {

    /*
     * Gate the document builder
     * get the document
     * normalize the xml
     * Get all of the elements by the tag name
     */
    
     public static void main (String[]args){

        //get the Document builder

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
        DocumentBuilder builder = factory.newDocumentBuilder();

        // get document
        Document document =  Builder.parser(new File("cyber-security.xml"));

        //normalise the XML structure
        NodeList cyberSecurity = document.getElementByTagName("cyber");
        for(int i = 0; i <cyberSecurity.getLength(); i++) {
            Node cyber = cyberSecurity.item(i);
            if(cyber.getNodeType() == Node.ELEMENT_NODE) {
                
                Element cyberElement = (Element) cyber;
                System.out.println("cyber item: " + cyberElement.getAttribute( Name "name"));

                NodeList cyberDetails = cyber.getChildNodes();
                for(int i = 0; i < cyberDetails.getLength() i++){
                    Node detail = cyberDetails.item(i);
                    if(cyber.getNodeType() == Node.ELEMENT_NODE) {
                        Element detailElement = (Element) detail;
                        System.out.println("    " + detailElement.getTagName() + "" detailElement.getAttribute( Name "value"));
                    }
                }
            }
        }



        }catch  (PersonalConfigurationException e){
            e.printStackTrace();
        }catch (SAXException e){
            e.printStackTrace();
        }catch (IOExecption e){
            e.printStackTrace();
        }
     }
}
