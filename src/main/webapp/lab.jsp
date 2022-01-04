<%@page import="java.util.ArrayList"%>
<%@page import="java.lang.String" %>
<%@page import="java.util.Map" %>
<%@page import="entities.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab </title>
        <link rel="stylesheet" href="static/bootstrap.min.css">
        <link rel="stylesheet" href="static/icofont/icofont.min.css" />
        <link rel="stylesheet" href="static/index.css" />
        <link rel="stylesheet" href="static/students.css" />
        <meta name="viewport" content="width=device-width, initial-scale=1, max-scale=1, height=device-height"/>
    </head>

    <body>
        <%
            ArrayList<Diagnosis> diagnosisList = (ArrayList<Diagnosis>) request.getAttribute("labs");


        %>

        <div class="side position-fixed">
            <%@include file="sidebar.html" %>
        </div>
        <div class="ml-17 ">

            <div class=" container mx-auto mx-3 pt-5">
                <h3 class="mb-4">
                    Lab
                </h3>
                <div class="card table-responsive">
                    <table class="table table-hover card-body">
                        <thead>
                            <tr>
                                <th scope="col">Patient Name </th>
                                <th scope="col"> Date </th>
                                <th scope="col"> Tests</th>
                                <th>Note</th>
                                <th scope="col">Update</th>
                            <th scope="col">Actions</th>


                            </tr>

                        </thead>
                        <tbody>
                            <% for (Diagnosis d : diagnosisList) {%>

                            <tr>
                                <td
                                    <strong>
                                    <%=d.user.getName()%>
                                    </strong>
                                </td>
                                <td
                                    <strong>
                                    <%=d.date%>
                                    </strong>
                                </td>

                                <td>
                                    <%=d.getTests()%>

                                </td>
                                <td>
                                    <%=d.notes%>

                                </td>
                                <td>
                                    <div class="actions">

                                        <a href="<%="lab-update?id=" + d.id %>" class="btn btn-info">
                                            <span class="btn-icon icofont-ui-edit"></span>
                                            Update
                                        </a>


                                    </div>
                                </td>
                                <td>
                                    <div class="actions">
                                        
                                     <a href="<%= "diagnosis-detail?id=" + d.id %>" class="btn btn-primary btn-sm">
                                                <span class=" btn-icon icofont-eye ml-2"></span>
                                                <span>View</span>
                                            </a>                                    </div>

                                </td>
                            </tr>
                            <% }%>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <%@include file="footer.jsp" %>
      
    </body>

</html>

