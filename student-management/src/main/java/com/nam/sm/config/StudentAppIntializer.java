package com.nam.sm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentAppIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class configFiles[]= {StudentAppConfig.class};
		return configFiles;
	}

	@Override
	protected String[] getServletMappings() {
		String mapping[]= {"/"};
		return mapping;
	}

}
