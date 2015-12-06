#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${packageName}.service.${packageDomain}.util

import ${packageName}.domain.${packageDomain}.${domainObject}
import com.mongodb.casbah.commons.Imports.DBObject
import com.mongodb.casbah.commons.MongoDBObject
import org.specs2.mutable.SpecificationWithJUnit

class ${domainObject}ConverterSpec extends SpecificationWithJUnit {

  private val ${packageDomain}Converter: ${domainObject}Converter = new ${domainObject}Converter

  "converter" should {

    "convert a ${packageDomain} to a db object" in {
      val dbObject: DBObject = ${packageDomain}Converter.serialise(new ${domainObject}("some value"))
      dbObject.get("data").toString must beEqualTo("some value")
    }

    "convert a db object to a ${packageDomain}" in {
      val ${packageDomain}: ${domainObject} = ${packageDomain}Converter.deserialise(MongoDBObject.newBuilder
        .+=("data" -> "some value")
        .result())
      ${packageDomain}.data must beEqualTo("some value")
    }

  }

}
