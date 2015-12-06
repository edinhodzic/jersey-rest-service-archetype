#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${packageName}.client.${packageDomain}

import com.edinhodzic.client.AbstractRestClient
import ${packageName}.domain.${packageDomain}.${domainObject}
import org.springframework.beans.factory.annotation.{Value, Autowired}
import org.springframework.stereotype.Component

/**
 * Client for a RESTful ${packageDomain} web service.
 * @param url ${packageDomain} web service url (scheme, host and port) e.g. http://localhost:9000
 * @param username basic HTTP authentication username
 * @param password basic HTTP authentication password
 */
@Component
class ${domainObject}RestClient @Autowired()
(@Value("service.${packageDomain}.url") url: String,
 @Value("service.${packageDomain}.username") username: String,
 @Value("service.${packageDomain}.password") password: String)
  extends AbstractRestClient[${domainObject}](url, username, password)
