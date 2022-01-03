<%-- 
    Document   : doctor
    Created on : Jan 3, 2022, 3:13:43 PM
    Author     : ojay
--%>
<%@page import="java.lang.String" %>
<%@page import="java.util.Map" %>
<%@page import="entities.*" %>
<%@page import="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Appointments</title>
        <link rel="stylesheet" href="static/bootstrap.min.css">
        <link rel="stylesheet" href="static/icofont/icofont.min.css" />
        <link rel="stylesheet" href="static/index.css" />
        <link rel="stylesheet" href="static/students.css" />

    </head>

    <body>
        <%
            ArrayList<Appointment> appointments = (ArrayList<Appointment>) request.getAttribute("appointments");
            ArrayList<Doctor> doctors = (ArrayList<Doctor>) request.getAttribute("doctors");
            ArrayList<Student> students = (ArrayList<Student>) request.getAttribute("students");

        %>

        <div class="side position-fixed">
            <%@include file="sidebar.html" %>
        </div>
        <div class="ml-17 ">

            <div class=" container mx-auto mx-3 mt-5">
                <h3 class="mb-4  text-center">
                    Appointments
                </h3>
                <div class="card table-responsive">
                    <table class="table table-hover card-body">
                        <thead>
                            <tr>
                                <th scope="col">Photo</th>
                                <th scope="col">Patient Name </th>
                                <th scope="col"> Phone Number</th>
                                <th scope="col"> Date</th>
                                <th scope="col"> Visit time</th>
                                <th scope="col">Doctor</th>
                                <th scope="col">Injury/conditions</th>
                                <th scope="col">Actions</th>



                            </tr>

                        </thead>
                        <tbody>
                            <% for (Appointment appointment : appointments) {%>

                            <tr>
                                <td>
                                    <span
                                        class="rounded-circle bg-secondary d-flex align-items-center justify-content-center"
                                        style="width: 40px;height: 40px">
                                        <span class="btn-icon icofont-user-alt-3 fs-24 text-light"></></span>
                                    </span>
                                </td>
                                <td>
                                    <strong>
                                        <%=appointment.student.getFirstName() + " " + appointment.student.getLastName()%>
                                    </strong>
                                </td>
                                

                                <td>
                                    <%=appointment.student.getPhone()%>

                                </td>
                                <td>
                                    <%=appointment.date%>

                                </td>
                                <td>
                                    <%=appointment.time%>

                                </td>
                                <td>
                                    <%=appointment.doctor.name%>

                                </td>
                                <td>
                                    <%=appointment.intent%>

                                </td>
                                <td>
                                    <div class="actions">
                                        <form action="appointment" method="delete">
                                            <input type="hidden" value="" name="id"    value ="<%=appointment.id%>"/>
                                             <button class="btn btn-error btn-sm rounded-pill">
                                            <span class="btn-icon icofont-ui-delete"></span>
                                        </button>
                                        </form>
                                       
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
            <button class="btn btn-primary btn-lg btn-square rounded-pill" data-bs-toggle="modal"
                    data-bs-target="#add-appointment">
                <span class="btn-icon icofont-stethoscope fs-48"></></span>
            </button>
        </div>
        <div class="modal fade show" id="modal">
        <div class="modal-dialog modal-dialog-centered">
       <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title">Create appointment</h5>
                </div>
                <form action="appointments" method="post">
                    <div class="modal-body">
                        <div class="row">
                            <div class="form-group col-12 col-sm-6">
                                 <label for="student" class="form-label">Student</label>
                                <select name="studentId" id="student" required="true" class="form-control my-2" >
                                    
                                    <option selected="true">
                                        Select student ...
                                    </option>
                                    <% for (Student student : students) {%>
                                    <option value="<%=student.getId() %>">
                                        <%=student.getFirstName() + " " + student.getLastName() %>
                                    </option>
                                    <% } %>
                                </select>
                            </div>
                            <div class="form-group col-12 col-sm-6">
                                <label  class="form-label" for="doctor">Doctor</label>
                                <select name="doctorId" required="true" id="doctor" class="form-control my-2" >
                                  <option selected="true">
                                      Select doctor ...
                                  </option>
                                    <% for (Doctor doctor : doctors) {%>
                                    <option value="<%=doctor.id %>">
                                        <%=doctor.name%>
                                    </option>
                                    <% } %>
                                </select>
                            </div>
                         <div class="row">
                            <div class="form-group col-12 col-sm-6">
                                <label for="date" class="form-label">Date</label>
                                <input name="date" required="true" id="time" class="form-control my-2" type="date"
                                       placeholder="date">
                            </div>
                            <div class="form-group col-12 col-sm-6">
                                <label for="time" class="form-label" >Time </label>
                                <input name="time" required="true" id="time" class="form-control my-2" type="time"
                                       placeholder="time">
                            </div>
                           
                        </div>        
                            <div class="form-group col-12 col-sm-6">
                                 <label for="app" class="form-label">Appointment reason</label>
                                 <input name="intent" id="app" required="true" class="form-control my-2" type="text"
                                       placeholder="reason">
                            </div>
                        </div>

                        <div class="modal-footer d-block">
                            <div class="actions justify-content-between">
                                <button onclick="toggleModal()" type="button" class="btn btn-error">Cancel</button>
                                <button type="submit" class="btn btn-info">Add appointment</button>
                            </div>
                        </div>
                    </div>            
                </form>
            </div>
        </div>
        </div>

        
        <script>
            const toggleModal = () => {
                document.getElementById("modal").classList.toggle("show-modal");

            };
        </script>
    </body>

</html>

