<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="top.jsp"/>

    <div id="main">
        <div>
            <table>
                <thread>
                    <tr>
                        <th>Lp.</th>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Price</th>
                        <th>A może edycja?</th>
                        <th>Zagadkowa opcja</th>
                    </tr>
                </thread>
                <tbody>
                <c:forEach items="${customer}" var="customer" varStatus="status">
                    <tr>
                        <td>${status.index+1}</td>
                        <td>${part.id}</td>
                        <td>${part.partname}</td>
                        <td>${part.partprice}</td>
                        <td><a href="/add-customer.html?id=${part.id}"><s:message code="general.edit"/> </a></td>
                        <td><a href="/add-customer.html?id=${part.id}&delete=yes"><s:message code="general.delete"/></a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
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