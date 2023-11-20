<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 

<f:view>
<html>
    
    <body>
<h:form>
            Please Enter Numbers: <br/>
            First Number
            <h:inputText id="num1" value="#{calculation.firstNo}"/><br>
             Second Number
            <h:inputText id="num2" value="#{calculation.secondNo}"/><br>
            Result is :
            <h:outputText value="#{calculation.result}"/><br>
            <h:commandButton actionListener="#{calculation.addition}"
                 value="Sum" />
              <h:outputText value="#{calculation.result}"/><br>
            <h:commandButton actionListener="#{calculation.subtraction}"
                 value="Sub" /> 
                  <h:outputText value="#{calculation.result}"/><br>
            <h:commandButton actionListener="#{calculation.multiplication}"
                 value="Mul" />     
        </h:form>
    </body>
</html>
</f:view>