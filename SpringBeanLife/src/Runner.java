import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) throws InterruptedException {
		/*ApplicationContext container=new ClassPathXmlApplicationContext("Spring.xml");
		
		System.out.println("Object loaded.....................");
		
		Thread.sleep(3000);
		
		Human human=container.getBean(Human.class, "human1243");
		
		System.out.println(human);*/
		
		
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		
		context.close();
		
		Human human = context.getBean(Human.class, "human");
		
		System.out.println(human);
		
				
		
		
	}
}
