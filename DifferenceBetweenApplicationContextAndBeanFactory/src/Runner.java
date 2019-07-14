import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) throws InterruptedException {
		/*ApplicationContext container=new ClassPathXmlApplicationContext("Spring.xml");
		
		System.out.println("Object loaded.....................");
		
		Thread.sleep(3000);
		
		Human human=container.getBean(Human.class, "human1243");
		
		System.out.println(human);*/
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		
		Human human = context.getBean(Human.class, "human");
		/*Human human1 = context.getBean(Human.class, "human");
		Human human2 = context.getBean(Human.class, "human");
		
		System.out.println(human);*/
		
		//context.close();		
		
	}
}
