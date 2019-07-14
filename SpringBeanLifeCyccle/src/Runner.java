import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext container=new ClassPathXmlApplicationContext("Spring.xml");
		
		System.out.println("Object loaded.....................");
		
		Thread.sleep(3000);
		
		Human human=container.getBean(Human.class, "human1243");
		
		
	}
}
