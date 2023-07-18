<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/elements/header.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

<!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Users CRUD</h1>

    </div>

    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Add User</h6>
        </div>

        <div class="card-body">
            <form action="/user/add" method="post">
                <div class="form-group">
                    <label for="userName">Username</label>
                    <input name="userName" type="text" class="form-control" id="userName" placeholder="Username">
                </div>
                <div class="form-group">
                    <label for="userEmail">Email</label>
                    <input name="userEmail" type="email" class="form-control" id="userEmail" placeholder="Email address">
                </div>
                <div class="form-group">
                    <label for="userPassword">Password</label>
                    <input name="userPassword" type="password" class="form-control" id="userPassword" placeholder="Password">
                </div>
                <button type="submit" class="btn btn-primary">Save User</button>
            </form>
        </div>
    </div>

</div>
<!-- /.container-fluid -->

<%@ include file="/WEB-INF/views/elements/footer.jsp" %>
