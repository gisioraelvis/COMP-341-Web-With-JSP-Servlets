<%@page import="java.util.ArrayList"%>
<%@page import="java.lang.String" %>
<%@page import="java.util.Map" %>
<%@page import="entities.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Diagnosis</title>
        <link rel="stylesheet" href="static/bootstrap.min.css">
        <link rel="stylesheet" href="static/icofont/icofont.min.css" />
        <link rel="stylesheet" href="static/index.css" />
        <link rel="stylesheet" href="static/students.css" />
        <meta name="viewport" content="width=device-width, initial-scale=1, max-scale=1, height=device-height"/>
    </head>

    <body>
        <%
            ArrayList<Diagnosis> diagnosisList = (ArrayList<Diagnosis>) request.getAttribute("diagnosis");
//            ArrayList<Doctor> doctors = (ArrayList<Doctor>) request.getAttribute("doctors");
            ArrayList<User> users = (ArrayList<User>) request.getAttribute("users");

        %>

        <div class="side position-fixed">
            <%@include file="sidebar.html" %>
        </div>
        <div class="ml-17 ">

            <div class=" container mx-auto mx-3 pt-5">
                <h3 class="mb-4">
                    Diagnosis
                </h3>
                <div class="card table-responsive">
                    <table class="table table-hover card-body">
                        <thead>
                            <tr>
                                <th scope="col">Patient Name </th>
                                <th scope="col"> Phone Number</th>
                                <th scope="col"> Date </th>
                                <th scope="col"> Prescription</th>                               
                                <th scope="col">notes</th>
                                <th scope="col">Injury/conditions</th>
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


                                <td>
                                    <%=d.user.getPhone()%>

                                </td>
                                <td>
                                    <%=d.date%>

                                </td>
                                <td>
                                    <%=d.prescription%>

                                </td>
                                <td>
                                    <%=d.notes%>

                                </td>
                                <td>
                                    <%=d.consultation%>

                                </td>
                                <td>
                                    <div class="actions">
                                     
                                            <a href="<%= "lab-update?id=" + d.id %>" class="btn btn-primary btn-sm ">
                                                <span class="btn-icon icofont-edit ml-2"></span>
                                                <span>Edit</span>
                                            </a>

                                     

                                    </div>
                                </td>
                                <td>
                                    <div class="actions">
                                        
                                            <a href="<%= "diagnosis-detail?id=" + d.id %>" class="btn btn-primary btn-sm">
                                                <span class="btn-icon icofont-eye ml-2"></span>
                                                <span>View</span>
                                            </a>

                                       

                                    </div>
                                </td>
                            </tr>
                            <% }%>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <div onclick="toggleModal()" class="add-action-box">
            <button class="btn btn-primary btn-lg btn-square rounded-circle" data-bs-toggle="modal"
                    data-bs-target="#add-appointment">
                <span class="btn-icon icofont-stethoscope-alt fs-48"></></span>
            </button>
        </div>
        <div class="modal fade show" id="modal">
            <div class="modal-dialog modal-dialog-centered">

<div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title">Add new diagnosis</h5>
                </div>
                <form action="diagnosis" method="post">
                    <div class="modal-body">
                        <div class="row">
                            <div class="form-group col-6">
                                <label for="student" class="form-label">User</label>
                                <select name="userId" id="student" required="true" class="form-control my-2" >

                                    <option selected="true">
                                        Select user ...
                                    </option>
                                    <% for (User user : users) {%>
                                    <option value="<%=user.getId()%>">
                                        <%=user.getName()%>
                                    </option>
                                    <% }%>
                                </select>

                            </div>
                            <div class="form-group col-12 col-sm-6">
                                <label for="consultation" class="form-label">consultation</label>
                                <input name="consultation" id="app" required="true" class="form-control my-2" type="text"
                                       placeholder="consultation">
                            </div>

                        </div>
                        <div class="form-group col-12">
                            <label for="prescription" class="form-label">Prescription</label>
                            <textarea cols="4" name="prescription" id="prescription" required="true" class="text-start form-control my-2" placeholder="write something.."></textarea>
                        </div> 
                        <div class="form-group col-12 my-2">
                            <label for="tests" class="form-label">tests</label>
                            <textarea cols="4" name="tests" id="notes" required="true" class="text-start form-control "  placeholder="write something.."></textarea>
                            <small class="text-muted">list tests separated by comma eg test1,test2</small>
                        </div>           
                        <div class="modal-footer d-block">
                            <div class="actions justify-content-between">
                                <button onclick="toggleModal()" type="button" class="btn btn-error">Cancel</button>
                                <button type="submit" class="btn btn-info">Add diagnosis</button>
                            </div>
                        </div>
                    </div>
                </form>

            </div>

        </div>
        </div>
    
    <%@include file="footer.jsp" %>
    <script>
        const toggleModal = () => {
            document.getElementById("modal").classList.toggle("show-modal");

        };
    </script>
</body>

</html>

