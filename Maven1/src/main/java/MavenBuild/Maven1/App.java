package MavenBuild.Maven1;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
/**
 * Hello world!
 *
 */
public class App 
{
	    public static void main( String[] args )
	    {
	    	
	    /*	Resource rs=new ClassPathResource("spring.xml");
	    	BeanFactory bf=new XmlBeanFactory(rs);*/
	    	
	    	//In place of beanfactory we can use ApplicationContext??
	    	
	    	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	       //   LHS           RHS
	  /* 	Airtel airtel=new Airtel();
	    	airtel.dataTypeOfSim();
	    	airtel.typeOfSim();*/
	    	//LHS is also dependent->solution define an interface
	  /*  Airtel airtel=bf.getBean(Airtel.class);
	       airtel.dataTypeOfSim();
	       airtel.typeOfSim();*/
	    
	  /*  Idea idea=bf.getBean(Idea.class);
	       idea.dataTypeOfSim();
	       idea.typeOfSim();*/
	    	Sim sim=ac.getBean(Idea.class);
	    	sim.dataTypeOfSim();
	    	sim.typeOfSim();
	    	//sim.strength();
}

}