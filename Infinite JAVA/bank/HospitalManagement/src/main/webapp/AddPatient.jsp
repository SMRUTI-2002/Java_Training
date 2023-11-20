<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 

<f:view>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add Patient</title>
</head>
<body>
    <center>
        <h2>
            <h:outputText value="Add Patient" />
        </h2>
        <h:form id="form">
        	<h:outputText value="Patient Id " />
            <h:inputText id="pid" value="#{patient.pid}" /><br/>
            <h:message for="form:pid"></h:message>
            <br><br>
            <h:outputText value="Patient Name " />
            <h:inputText id="name" value="#{patient.name}" /><br/>
            <h:message for="form:name"></h:message>
            <br><br>
            <h:outputText value="Age " />
            <h:inputText id="age" value="#{patient.age}" /><br/>
            <h:message for="form:age"></h:message>
            <br><br>
            <h:outputText value="Weight " />
            <h:inputText id="weight" value="#{patient.weight}" /><br/>
            <h:message for="form:weight"></h:message>
            <br><br>
            <h:outputText value="Gender " />
            <h:inputText id="gender" value="#{patient.gender}" /><br/>
            <h:message for="form:gender"></h:message>
            <br><br>
            <h:outputText value="Address " />
            <h:inputText id="address" value="#{patient.address}" /><br/>
            <h:message for="form:address"></h:message>
            <br><br>
            <h:outputText value="Phone Number " />
            <h:inputText id="phoneno" value="#{patient.phoneno}" /><br/>
            <h:message for="form:phoneno"></h:message>
            <br><br>
            <h:outputText value="Disease " />
            <h:inputText id="disease" value="#{patient.disease}" /><br/>
            <h:message for="form:disease"></h:message>
            <br><br>
            <h:outputText value="Doctor ID " />
            <h:inputText id="doctorid" value="#{patient.doctorId}" /><br/>
            <h:message for="form:doctorid"></h:message>
            <br><br>
            <h:commandButton action="#{patientDao.addPatientDao(patient)}" value="Add Patient" />
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <h:commandButton type="reset" value="Reset"></h:commandButton>
        </h:form>
    </center>
</body>
</html>
</f:view>