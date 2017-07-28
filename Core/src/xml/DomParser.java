package xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DomParser {
	public void parseDocument() {
		System.out.println("parseDocument:start");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		File xmlFile = new File("D:/ws/java/Core/src/xml/Employee.xml");
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			Document document = builder.parse(xmlFile);
			NodeList nl = document.getElementsByTagName("employee");
			if (nl != null && nl.getLength() > 0) {
				for (int i = 0; i < nl.getLength(); i++) {
					// get the employee element
					System.out.println("Inside for loop");
					Element el = (Element) nl.item(i);
					// get the Employee object
					Employee e = getEmployee(el);
					// add it to list
					// myEmpls.add(e);
				}
			}
			System.out.println("parseDocument:end");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Exception: "+e1.toString());
			
		}
	}

	private Employee getEmployee(Element empEl) {
		System.out.println("getEmployee:start");
		// for each <employee> element get text or int values of
		// name ,id, age and name
		String name = getTextValue(empEl, "name");
		System.out.println("name: "+name);
		int id = getIntValue(empEl, "id");
		System.out.println("id: "+id);
		int age = getIntValue(empEl, "age");
		System.out.println("age: "+age);
		String type = empEl.getAttribute("type");
		System.out.println("type: "+type);
		// Create a new Employee with the value read from the xml nodes
		Employee e = new Employee(name, id, age, type);
		System.out.println("getEmployee:end");
		return e;
	}

	private int getIntValue(Element ele, String tagName) {
		// in production application you would catch the exception
		return Integer.parseInt(getTextValue(ele, tagName));
	}

	private String getTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nl = ele.getElementsByTagName(tagName);
		if (nl != null && nl.getLength() > 0) {
			Element el = (Element) nl.item(0);
			textVal = el.getFirstChild().getNodeValue();
		}
		return textVal;
	}
}
