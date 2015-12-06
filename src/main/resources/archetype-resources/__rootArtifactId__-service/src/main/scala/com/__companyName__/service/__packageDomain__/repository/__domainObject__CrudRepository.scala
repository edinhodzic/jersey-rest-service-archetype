#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${packageName}.service.${packageDomain}.repository

import ${packageName}.domain.${packageDomain}.${domainObject}
import com.edinhodzic.service.repository.AbstractMongoCrudRepository
import com.edinhodzic.service.util.Converter
import com.mongodb.casbah.commons.Imports.DBObject
import org.springframework.beans.factory.annotation.{Autowired, Value}
import org.springframework.stereotype.Component

@Component
class ${domainObject}CrudRepository @Autowired()
(converter: Converter[${domainObject}, DBObject], @Value("${mongo.database.name}") databaseName: String)
  extends AbstractMongoCrudRepository[${domainObject}](converter, databaseName = databaseName)
