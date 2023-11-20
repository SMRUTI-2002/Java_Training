<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 

<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insurance Page</title>
    </head>
    <body>
        
        <h:form>
        <center>
                <h2><h:outputText value="Insurance Records"/></h2>
            </center>
            <h:dataTable value="#{insurancePaginationDao.getInsuranceList()}" var="i" border="3">
               <h:column>
        <f:facet name="header">
            <h:outputLabel value="Insurance ID" />
        </f:facet>
        <h:outputText value="#{i.insId}" />
    </h:column>
    <h:column>
        <f:facet name="header">
            <h:outputLabel value="Insurance Name" />
        </f:facet>
        <h:outputText value="#{i.insName}" />
    </h:column>
    <h:column>
         <f:facet name="header">
            <h:outputLabel value="Type" />
        </f:facet>
        <h:outputText value="#{i.type}" />
    </h:column>
    <h:column>
        <f:facet name="header">
            <h:outputLabel value="Premium Start" />
        </f:facet>
        <h:outputText value="#{i.premiumStart}" />
    </h:column>
    <h:column>
        <f:facet name="header">
            <h:outputLabel value="Premium End" />
        </f:facet>
        <h:outputText value="#{i.premiumEnd}" />
    </h:column>
    <h:column>
        <f:facet name="header">
            <h:outputLabel value="Min Period" />
        </f:facet>
        <h:outputText value="#{i.minPeriod}" />
    </h:column>
    <h:column>
        <f:facet name="header">
            <h:outputLabel value="Max Period" />
        </f:facet>
        <h:outputText value="#{i.maxPeriod}" />
    </h:column>
    <h:column>
        <f:facet name="header">
            <h:outputLabel value="Launch Date" />
        </f:facet>
        <h:outputText value="#{i.lunchDate}" />
    </h:column>
    <h:column>
    <f:facet name="header">
            <h:outputLabel value="Status" />
        </f:facet>
        <h:outputText value="#{i.status}" />
    </h:column>
            </h:dataTable>
            <!-- Paging buttons, pagination info, and rows per page control -->
            <h:commandButton value="first" action="#{insurancePaginationBean.pageFirst}"
                             disabled="#{insurancePaginationBean.firstRow == 0}" />
            <h:commandButton value="prev" action="#{insurancePaginationBean.pagePrevious}"
                             disabled="#{insurancePaginationBean.firstRow == 0}" />
            <h:outputText value="&nbsp;" escape="false"/>
            <h:commandButton value="next" action="#{insurancePaginationBean.pageNext}"
                             disabled="#{insurancePaginationBean.firstRow + insurancePaginationBean.rowsPerPage >= paginationDao.totalRows}" />
            <h:outputText value="&nbsp;" escape="false"/>
            <h:commandButton value="last" action="#{insurancePaginationBean.pageLast}"
                             disabled="#{insurancePaginationBean.firstRow + insurancePaginationBean.rowsPerPage >= paginationDao.totalRows}" />
            <h:outputText value="&nbsp;" escape="false"/>
            <h:outputText value="Page #{insurancePaginationBean.currentPage} / #{insurancePaginationBean.totalPages}" />
            <br />
            <!-- Set rows per page -->
            <h:outputLabel for="rowsPerPage" value="Rows per page" />
            <h:inputText id="rowsPerPage" value="#{insurancePaginationBean.rowsPerPage}" size="3" maxlength="3" />
            <h:commandButton value="Set" action="#{insurancePaginationBean.pageFirst}" />
            <h:message for="rowsPerPage" errorStyle="color: red;" />
        </h:form>
    </body>
</html>
</f:view>