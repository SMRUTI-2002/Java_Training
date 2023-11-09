<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h:form>
            <h2>Room</h2>
            <h:dataTable value="#{roomList}" var="room" border="5">
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Room Number" />
                    </f:facet>
                    <h:outputText value="#{room.roomno}" />
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Room Type" />
                    </f:facet>
                    <h:outputText value="#{room.roomtype}" />
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Status" />
                    </f:facet>
                    <h:outputText value="#{room.status}" />
                </h:column>
            </h:dataTable>
        </h:form>
    
    </body>
</html>
</f:view>