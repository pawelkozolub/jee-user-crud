<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/elements/header.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

<!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Users CRUD</h1>
<%--        <a href="/user/add" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">--%>
<%--            <i class="fas fa-download fa-sm text-white-50"></i> Delete User</a>--%>
        <form action="/user/delete?id=${user.id}" method="post">
            <button type="submit" class="btn btn-primary">Delete User</button>
        </form>
    </div>

    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">User to be deleted</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table">
                    <tr>
                        <th>Id</th>
                        <td>${user.id}</td>
                    </tr>
                    <tr>
                        <th>Username</th>
                        <td>${user.username}</td>
                    </tr>
                    <tr>
                        <th>E-mail</th>
                        <td>${user.email}</td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
    <div>
         <a href='<c:url value="/user/list"/>'>Back to User list</a>
    </div>

</div>
<!-- /.container-fluid -->

<%@ include file="/WEB-INF/views/elements/footer.jsp" %>
