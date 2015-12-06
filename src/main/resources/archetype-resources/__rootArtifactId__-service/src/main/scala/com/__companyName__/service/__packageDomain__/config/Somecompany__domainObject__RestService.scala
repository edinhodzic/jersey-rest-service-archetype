#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${packageName}.service.${packageDomain}.config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.context.web.SpringBootServletInitializer
import org.springframework.context.annotation.ComponentScan

import scala.language.postfixOps

@SpringBootApplication
@ComponentScan(basePackages = Array("${packageName}.service.${packageDomain}")) // it's either this or moving the class up into a higher package
private class Somecompany${domainObject}RestService extends SpringBootServletInitializer {
  override def configure(springApplicationBuilder: SpringApplicationBuilder): SpringApplicationBuilder = {
    springApplicationBuilder sources classOf[Somecompany${domainObject}RestService]
  }
}

private object Somecompany${domainObject}RestService {
  def main(args: Array[String]) {
    new Somecompany${domainObject}RestService().configure(
      new SpringApplicationBuilder(classOf[Somecompany${domainObject}RestService])) run(args: _*)
  }
}
