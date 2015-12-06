#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${packageName}.service.${packageDomain}.util

import ${packageName}.domain.${packageDomain}.${domainObject}
import com.edinhodzic.service.util.Converter
import com.mongodb.casbah.commons.Imports.DBObject
import com.mongodb.casbah.commons.MongoDBObject
import org.springframework.stereotype.Component

@Component
class ${domainObject}Converter extends Converter[${domainObject}, DBObject] {

  override def serialise(${packageDomain}: ${domainObject}): DBObject =
    MongoDBObject.newBuilder
      .+=("data" -> ${packageDomain}.data)
      .result()

  override def deserialise(dbObject: DBObject): ${domainObject} =
    ${domainObject}(dbObject.get("data").asInstanceOf[String])

}
