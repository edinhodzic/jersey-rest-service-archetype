#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${packageName}.domain.${packageDomain}

import com.edinhodzic.service.domain.Identifiable

import scala.beans.BeanProperty

case class ${domainObject}(@BeanProperty var data: String) extends Identifiable {

  def this() = this(null)

}