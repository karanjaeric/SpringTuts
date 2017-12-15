/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springtuts;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ekaranja
 */
public class SpringTuts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           ApplicationContext context = new ClassPathXmlApplicationContext("resources/Beans.xml");
      JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

      jc.getAddressList();
      jc.getAddressSet();
      jc.getAddressMap();
      jc.getAddressProp();
        
        
        
        
        
//        Resource resource=new ClassPathResource("resources/springtut.xml");
//        BeanFactory factory=new XmlBeanFactory(resource);
//        System.out.println("document is valid");
//        factory.getBean("test");
//        factory.getBean("test");
//        factory.getBean("test");
//        factory.getBean("test");
//        factory.getBean("test");
//        String files[] = new String[]{"resources/car.xml", "resources/engine.xml"};
//        ApplicationContext ap = new ClassPathXmlApplicationContext(files);
//        Car car = (Car) ap.getBean("car");
//        String carNames[]=car.getCarNames();
//        Set cricketers=car.getCricketers();
//        Map cc=car.getCountryCapitals();
//        Set keys=cc.keySet();
//        List fruits=car.getFruits();
//        
//        keys.forEach((key)->{
//             System.out.println("Country is: "+key+" Capital is: "+cc.get(key));
//        
//        
//        });
//        fruits.forEach((fruit)->{
//             System.out.println("Fruit is "+fruit);
//        
//        });
//        
//        
//        
//        for(String carName:carNames){
//            System.out.println("Car name is "+carName);
//                    
//        }
//        
//        cricketers.forEach((cricketer) -> {
//            System.out.println(cricketer);
//        });
//
//        System.out.println("name is: " + car.getCarName() + "\n Engine model Year is: " + car.getEngine().getModelYear());
//    }

}
}
