#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${packageName}.service.${packageDomain}.config

import ${packageName}.service.${packageDomain}.controller.${domainObject}RestController
import org.glassfish.jersey.server.ResourceConfig
import org.springframework.stereotype.Component

//@ApplicationPath("rest")
@Component
private class JerseyConfig extends ResourceConfig {

  register(classOf[${domainObject}RestController])

}
