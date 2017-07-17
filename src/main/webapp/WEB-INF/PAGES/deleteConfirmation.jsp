<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="top.jsp"/>
    <div id="main">
        <div>
            <h1>Usunięto chwasta</h1>
            <a href="<c:url value="/"></c:url> "><s:message code="index.title"/> !</a>
        </div>
    </div>

    <div id="sidebar">
        <h3>DONICZKA NA DZIŚ</h3>
        <p>
        <div><img src="http://www.oczarjk.pl/zdjecia_narzedzia_ogrodnicze/doniczka_terra_nova_dce01.jpg"
                  alt="cat and spade" height="100" width="100"></div>
        </p>
    </div>
    <div class="clr"></div>

    <div id="footer">
        <p>copyrajt by fan CZĘŚCI i kotow @ 2020</p>
    </div>

</div>

</body>


</html>