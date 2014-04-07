package at.apa_it.ACD.rest;

public class RestWebApplicationInitializer extends
		AbstractAnnotationConfigDispatcherServletInitializer {
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { RestApplicationConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { RestWebConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/*" };
	}
}
