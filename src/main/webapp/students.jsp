<%-- 
    Document   : Home
    Created on : Jan 2, 2022, 11:53:14 AM
    Author     : ojay
--%>


<%@page import="java.lang.String"%>
<%@page import="java.util.Map"%>
<%@page import="entities.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="static/bootstrap.min.css">
        <link rel="stylesheet" href="static/icofont/icofont.min.css"/>
        <link rel="stylesheet" href="static/index.css"/>
        <link rel="stylesheet" href="static/students.css"/>        

    </head>

    <body>
            <%
    ArrayList<Student>  students=(ArrayList<Student>) request.getAttribute("students") ;
    

   
    %>
    
     <div class="side position-fixed">
                <%@include file="sidebar.html" %>      
            </div>
        <div class="ml-17 ">

            <div class=" container mx-auto mx-3 mt-5">
                                <h3 class="mb-4  text-center">
                    Students
                </h3>  
                <div class="card table-responsive">
                <table class="table table-hover card-body">
                  <thead>
                  <tr>
                    <th scope="col">Photo</th>         
            <th scope="col"> Name </th>
            <th scope="col"> Reg  No</th>
            <th scope="col"> Phone </th>
            <th scope="col"> Gender </th>
            <th scope="col"> Marital Status </th>
            <th scope="col"> Nationality</th>
           

             <th scope="col">Actions</th>
                  </tr>
                  </thead>
                  <tbody>
                      <%
                      for(Student student:students){
                          %>
                          
                  <tr>
                    <td>
                        <span class="rounded-circle bg-secondary d-flex align-items-center justify-content-center" style="width: 40px;height: 40px">
              <span class="btn-icon icofont-user-alt-3 fs-24 text-light"></></span>              
                        </span>
                    </td>
                    <td>
                        <strong><%=student.getFirstName() + " " + student.getLastName()%></strong>
                    </td>
                    <td>
                        <strong><%=student.getRegNo()%></strong>
                    </td>
                    <td>
                      <div class="d-flex align-items-center nowrap text-primary">
                        <span class="icofont-ui-email p-0 me-2"></span>
                        <%=student.getEmail() %>
                      </div>
                    </td>
                   
                   
                    <td>
                      <div class="d-flex align-items-center nowrap text-primary">
                        <span class="icofont-ui-cell-phone p-0 me-2"></span>
                                               <%=student.getPhone() %>
                      </div>
                    </td>
                    <td><%=student.getGender()%></td>
                    <td><%=student.getNationality()%></td>
                    <td>
                      <div class="actions">
                        <button class="btn btn-info btn-sm rounded-pill">
                          <span class="btn-icon icofont-ui-edit"></span>
                        </button>
                        <button class="btn btn-error btn-sm rounded-pill">
                          <span class="btn-icon icofont-ui-delete"></span>
                        </button>
                      </div>
                    </td>
                  </tr>
                                        <%  
                      }
 
                      
                  %>
                  </tbody>
                </table>
              </div>
            </div> 
        </div>
 
        <div onclick="toggleModal()" class="add-action-box">
            <button class="btn btn-primary btn-lg btn-square rounded-pill" data-bs-toggle="modal" data-bs-target="#add-appointment">
              <span class="btn-icon icofont-plus fs-48"></></span>
            </button>
         </div>
 <div class="modal fade show"  id="modal">
  <div class="modal-dialog modal-dialog-centered">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Add new student</h5>
      </div>
        <form action="students" method="post" >
      <div class="modal-body">
             <h5 class="mt-4">Personal information</h5>
            <div class="row my-2">
                <div class="form-group col-12 col-sm-4">
                    <input required="true" name="firstName"  class="form-control" type="text" placeholder="first Name">
          </div>
                <div class="form-group col-12 col-sm-4">
                    <input name="lastName" required="true"  class="form-control" type="text" placeholder="last Name">
          </div>
                 <div class="form-group my-2 col-12 col-sm-4">
             <input name="surname" required="true" class="form-control" type="text" placeholder="surname">
          </div>
            </div>
                       <div class="row my-2">
                <div class="form-group col-12 col-sm-6">
                    <input name="regNo"required="true"  class="form-control" type="text" placeholder="reg No">
          </div>
           
            </div>
         
          <div class="row my-2">
                <div class="form-group col-12 col-sm-6">
                    <input name="phone" required="true" class="form-control" type="text" placeholder="phone">
          </div>
                <div class="form-group col-12 col-sm-6">
                    <input name="email" required="true"  class="form-control" type="email" placeholder="email">
          </div>
            </div>
            <div class="row my-2">
                 <div class="form-group col-12 col-sm-6">
              <select name="gender" required="true"  class="form-control" >
                  <option >
                      select gender
                  </option>
                  <option value="male">
                      Male
                  </option>
                  <option  value="female">
                      Female
                  </option>
              </select>
            
          </div>
                   <div class="form-group col-12 col-sm-6">
              <select name="maritalStatus" required="true"  class="form-control" >
                  <option >
                      select marital status
                  </option>
                  <option value="single">
                      single
                  </option>
                  <option  value="married">
                      married
                  </option>
                   <option  value="divorced">
                      divorced
                  </option>
              </select>
            
          </div>
            </div>
         
             <div class="row my-2">
                <div class="form-group col-12 col-sm-6">
                    <input name="nationality" required="true" class="form-control" type="text" placeholder="nationality">
          </div>
                <div class="form-group col-12 col-sm-6">
                    <input name="religion" required="true"  class="form-control" type="text" placeholder="religion">
          </div>
            </div>
           <h5 class="mt-4">Family doctor</h5>
            <div class="row my-2">
                <div class="form-group col-6 col-sm-4">
                    <input name="fDname"  class="form-control" type="text" placeholder="Family doctor Name">
          </div>
                <div class="form-group col-12 col-sm-4">
                    <input name="fDemail"  class="form-control" type="text" placeholder="Family doctor email">
          </div>
                <div class="form-group col-12 col-sm-4">
                    <input name="fDphone"  class="form-control" type="text" placeholder="Family doctor phone">
          </div>
            </div>
            <h5 class="mt-4">Next Of Kin</h5>
            <div class="row my-2">
                <div class="form-group col-6 col-sm-4">
                    <input name="nfKname"  class="form-control" type="text" placeholder="Next Of Kin Name">
          </div>
                <div class="form-group col-12 col-sm-4">
                    <input name="nfKemail"  class="form-control" type="text" placeholder="Next Of Kin email">
          </div>
                <div class="form-group col-12 col-sm-4">
                    <input name="nfKphone"  class="form-control" type="text" placeholder="Next Of Kin phone">
          </div>
            </div>
            
            <h5 class="mt-4">Medical History</h5>
            <div class="row my-2">
                <div class="form-group col-6 col-sm-4">
                    <input name="admission"  class="form-control" type="text" placeholder="admission">
          </div>
                <div class="form-group col-12 col-sm-4">
                    <input name="reasonAdmission"  class="form-control" type="text" placeholder="reason Admission">
          </div>
                <div class="form-group col-12 col-sm-4">
                    <input name="previousIllness"  class="form-control" type="text" placeholder="previous Illness">
          </div>
                  <div class="form-group col-12 col-sm-4">
                    <input name="privateHospital"  class="form-control mt-2" type="text" placeholder="private HospitalS">
          </div>
             
            </div>
          <div class="row my-2">
                <div class="form-group col-6 col-sm-4">
                    <input name="vision"  class="form-control" type="text" placeholder="vision">
          </div>
                <div class="form-group col-12 col-sm-4">
                    <input name="hearing"  class="form-control" type="text" placeholder="hearing">
          </div>
                <div class="form-group col-12 col-sm-4">
                    <input name="bloodGroup"  class="form-control" type="text" placeholder="blood Group">
          </div>
            </div>
            <h5 class="mt-4">Doctor conclusion</h5>
            <div class="row my-2">
                <div class="form-group col-6 col-sm-8">
                    <input name="anyObservation"  class="form-control" type="text" placeholder="any observation">
          </div>
                <div class="form-group col-12 col-sm-4">
                    <input name="studentFit"  class="form-control" type="text" placeholder="student Fit">
          </div>
             
        
      </div>
      <div class="modal-footer d-block">
        <div class="actions justify-content-between">
            <button onclick="toggleModal()" type="button" class="btn btn-error">Cancel</button>
          <button  type="submit" class="btn btn-info">Add student</button>
        </div>
      </div>
            </form>
    </div>
  </div>
     
</div>
        <script>
            const toggleModal = ()=>{
                document.getElementById("modal").classList.toggle("show-modal");
            
    };
        </script>   
    </body>
    
</html>

