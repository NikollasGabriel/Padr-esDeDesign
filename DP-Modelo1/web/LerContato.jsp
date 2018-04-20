<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.css">        
        <link rel="stylesheet" href="css/bootstrap.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <title>Pesquisa de Contato</title>
    </head>
    <body align="center" bgcolor="#B0C4DE">
        <!--Menu-->
        <%--<nav>
            <object width="100%" height="65px" data="menu.jsp"></object>
        </nav>--%>
        <div class="container">
            <h1>Pesquisa de Ofertas</h1>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>nome:</th>
                        <th>email:</th>
                        <th colspan=2>Ação:</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listaContatos}" var="listaContato">
                        <tr>
                            <td><c:out value="${listaContato.nome}" /></td>
                            <td><c:out value="${listaContato.email}"/></td>                                                        
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <%--<form action="ManterOfertaController?acao=prepararIncluir" method="post">
                <button type="submit" class="btn btn-default" name="btnIncluir" value="Incluir">Incluir</button>
            </form>--%>
        </div>
    </body>
</html>