#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${packageName}.service.${packageDomain}.controller

import javax.ws.rs.Path

import ${packageName}.domain.${packageDomain}.${domainObject}
import com.edinhodzic.service.controller.QueryableRestControllerWithPartialUpdates
import com.edinhodzic.service.repository.PartialUpdates
import com.edinhodzic.service.repository.{AbstractPartialCrudRepository, Queryable}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
@Path("${packageDomain}")
class ${domainObject}RestController @Autowired()
(${packageDomain}CrudRepository: AbstractPartialCrudRepository[${domainObject}]
  with PartialUpdates[${domainObject}] with Queryable[${domainObject}])
  extends QueryableRestControllerWithPartialUpdates[${domainObject}](${packageDomain}CrudRepository)
