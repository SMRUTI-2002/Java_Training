	<%@page contentType="text/html"%>
	<%@page pageEncoding="UTF-8"%>
	
	<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
	<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 
	
	<f:view>	
	<body>
		<h:form>
		<cente>
				
			 <h:outputLabel for="principalAmount">Principal Amount:</h:outputLabel>
	            <h:inputText id="principalAmount" value="#{calc.principalAmount}" /><br/>
	
	            <h:outputLabel for="rateOfInterest">Rate of Interest:</h:outputLabel>
	            <h:inputText id="rateOfInterest" value="#{calc.rateOfInterest}" /><br/>
	
	            <h:outputLabel for="numberOfYears">Number of Years:</h:outputLabel>
	            <h:inputText id="numberOfYears" value="#{calc.numberOfYears}" /><br/>
	            
	            <h:commandButton value="Calculate" action="#{calc.simpleInterest()}" /><br/>
				<h:outputText value="Interest Earned: #{calc.result()}"/>
	   
	       </center>
			
		</h:form>
	</body>
	</f:view>