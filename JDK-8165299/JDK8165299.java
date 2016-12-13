import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class JDK8165299 {

	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Rss.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();

		Rss r = (Rss) unmarshaller.unmarshal(new java.io.File("rss.xml"));

		System.out.println(r.title);
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlRootElement(name = "RDF", namespace = "http://www.w3.org/1999/02/22-rdf-syntax-ns#")
	public static class Rss {
		@XmlElement(name = "title")
		public String title;
	}
}
