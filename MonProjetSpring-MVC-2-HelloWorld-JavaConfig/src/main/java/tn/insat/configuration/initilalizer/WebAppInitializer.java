package tn.insat.configuration.initilalizer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import tn.insat.configuration.SpringWebConfiguration;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

   @Override
   protected Class<?>[] getRootConfigClasses() {
       return new Class[] { SpringWebConfiguration.class };
   }
 
   @Override
   protected Class<?>[] getServletConfigClasses() {
       return null;
   }
 
   @Override
   protected String[] getServletMappings() {
       return new String[] { "/" };
   }

}