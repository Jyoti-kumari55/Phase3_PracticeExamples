package MavenBuild.Maven2;

import java.io.ObjectInputFilter.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	   public static void main( String[] args )
	    {
	    	
//	    	Resource rs=new ClassPathResource("spring.xml");
//	    	BeanFactory bf=new XmlBeanFactory(rs);
	    	
	    	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	    	
	       //   LHS           RHS
	    //	Airtel airtel=new Airtel();
	    	
	    	//LHS is also dependent->solution define an interface
	    	Airtel sim=ac.getBean(Airtel.class);
	       sim.dataTypeOfSim();
	       sim.typeOfSim();
	      sim.dataStrength();
	      System.out.println(sim.getDatastrength());
	      
	    }



}

