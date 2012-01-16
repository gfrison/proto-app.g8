package conf
import org.springframework.beans.factory.config.MethodInvokingFactoryBean
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer

def environment=System.getProperty("environment")?:'development'
// http://goo.gl/jv3YP Runtime Spring with the Beans DSL
beans {
	xmlns context:"http://www.springframework.org/schema/context"
	context.'annotation-config'()
	log4jInitialization(MethodInvokingFactoryBean){
		targetClass="org.springframework.util.Log4jConfigurer"
		targetMethod="initLogging"
		arguments=[new java.lang.String("classpath:conf/${environment}/log4j.xml")]
	}
	//'gradle run' load 'development' configuration
	// use the place holder in a single (not double) quote string, ex: 'it would be ${great}'
	// http://goo.gl/EEstg
	context.'property-placeholder'(location:'classpath:conf/${environment}/config.properties')


}