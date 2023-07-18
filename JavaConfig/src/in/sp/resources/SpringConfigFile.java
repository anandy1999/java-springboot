package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;
@Configuration
public class SpringConfigFile {

	@Bean
	public Student stdobj()
	{
		Student std=new Student();
		std.setName("Anand");
		return std;
	}
}
