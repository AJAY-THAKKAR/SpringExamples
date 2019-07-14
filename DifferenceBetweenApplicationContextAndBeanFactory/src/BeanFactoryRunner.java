import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathResource resource=new ClassPathResource("Spring.xml");
		BeanFactory context=new XmlBeanFactory(resource);
		
		System.out.println("Container created");
		
		
		Human human = context.getBean(Human.class, "human");
		/*Human human1 = context.getBean(Human.class, "human");
		Human human2 = context.getBean(Human.class, "human");*/
		
		//System.out.println(human);
		
		//context.close();		

		
	}

}
