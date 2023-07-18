package in.sp.main;
import in.sp.beans.*;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
//     Resource resource =new ClassPathResource("/in/sp/resources/applicationContext.xml");
//     //Resource is a interface and classpath source is implementd clasd of resourrce interface
//     //external file ko laod karata h
//     //container ke andar load karwana h resourcse ko
//     BeanFactory container=new XmlBeanFactory(resource);
//    Student std=(Student) container.getBean("stdObj");
//    std.display();
//     
		ApplicationContext context=new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
		 Student std=(Student) context.getBean("stdObj");
		std.display();
	}
}
