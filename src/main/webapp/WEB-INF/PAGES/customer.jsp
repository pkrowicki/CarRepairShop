<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title><s:message code="maintitle"/></title>
    <style>
        body {
            background: #191919;
            color: #fff;
            line-height: 1.4em;
        }

        a {
            color: #fff;
            text-decoration: none;
        }

        img {
            max-width: 100%;
            max-height: 100%;
        }

        ol {
            list-style-type:none;
            padding:0;
            margin:0;
            background-color:#FFF;
            font-size:18px;
            height:2em;
            line-height:2em;
            text-align:center;
        }

        ol a {
            display:block;
            text-decoration:none;
            color: #777777;
            padding:0 5px;
        }

        ol > li {
            float:left;
            width:175px;
            margin-left:1px;
            background-color: #242424;
            height:2em;
        }

        ol > li:first-child {
            margin-left:0;
        }

        ol > li:hover {
            background-color:#EEE;
        }

        ol > li:hover > a {
            color:#09C;
        }

        ol > li:hover > ul {
            display:block;
        }

        ol > li > ul {
            display:none;
            list-style-type:none;
            padding:0;
            margin:0;
        }

        ol > li > ul > li {
            position:relative;
            background-color: #272727;
        }

        ol > li > ul > li > a {
            border-top:1px solid #373737;
        }

        ol > li > ul > li:hover {
            background-color:#DDD;
        }

        ol > li > ul > li:hover > a {
            color: #9aaacc;
        }

        .clr {
            clear: both;
        }

        #container {
            background: #333333;
            width: 1080px;
            margin: 30px auto;
            overflow: hidden;
            padding: 10px;
        }
        #imagecontainer {
            width:100%;
            overflow: hidden;
        }

        #nav {
            width:auto;
            height: 40px;
            background: #666;
        }

        #main {
            float: left;
            width: 60%;
        }

        #sidebar {
            float: right;
            width: 30%;
            background: #666;
            margin-top: 20px;
            padding: 10px;
        }

        #footer {
            text-align: center;
            padding: 10px;
            background: #666;
            margin-top: 30px;
        }

        .rightlandscape {
            float:right;
            height: auto;
            width: 50%;
        }
        .leftlandscape {
            float:left;
            height: auto;
            width: 50%;
        }
        #headerlogo {
            height: 226px;
            width: 1080px;
            position: relative;
        }
        #headerimage {
            position: absolute;
            left: 0;
            top: 0;
        }
        #headertext {
            z-index: 100;
            position: absolute;
            color: white;
            font-size: 38px;
            font-weight: bold;
            text-shadow: 2px 2px #040000;
            line-height: 90%;
            left: 10px;
            top: 0;
        }
        #headerbelowtext {
            z-index: 100;
            position: absolute;
            color: white;
            font-size: 30px;
            font-weight: bold;
            text-shadow: 2px 2px #040000;
            line-height: 90%;
            left: 5px;
            bottom: 0;
        }

        input, textarea {
            width: 100%;
            padding: 5px;
            margin-bottom: 15px;
        }
    </style>
</head>

<body>

<div id="container">
    <div id="header">
        <div id="headerlogo">
            <img id="headerimage" src="https://i.imgur.com/o8DiPN2.jpg"/>
            <p id="headertext"><s:message code="maintitle"></s:message></p>
            <p id="headerbelowtext"><s:message code="index.title"></s:message></p>
        </div>
    </div>

    <div id="nav">
        <ol>
            <li><a href="#">Produkty</a>
                <ul>
                    <li><a href="/show-customers.html"><s:message code="menuitems.showproduct"></s:message></a></li>
                    <li><a href="/add-customer.html"><s:message code="menuitems.addproduct"></s:message></a></li>
                    <li><a href="http://www.google.pl"><s:message code="menuitems.PLACEHOLDER"/> </a></li>
                    <li><a href="http://www.onet.pl"><s:message code="menuitems.PLACEHOLDER"/> </a></li>
                    <li>
                        <a href="https://www.google.pl/search?q=cats&client=firefox-b&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiUzPbYqvTUAhXKLMAKHdilArsQ_AUICigB&biw=1920&bih=947"><s:message
                                code="menuitems.PLACEHOLDER"/> </a></li>
                    <li>
                        <a href="https://www.google.pl/search?client=firefox-b&biw=1920&bih=947&tbm=isch&q=shovel&sa=X&ved=0ahUKEwi9oNbnqvTUAhXMWRQKHeAOABkQhyYIJQ"><s:message
                                code="menuitems.PLACEHOLDER"/> </a></li>
                </ul>

            </li>
            <li><a href="#">Klienci</a>
                <ul>
                    <li><a href="/show-customers.html"><s:message code="menuitems.showcustomer"></s:message></a></li>
                    <li><a href="/add-customer.html"><s:message code="menuitems.addcustomer"></s:message></a></li>
                    <li><a href="http://www.google.pl"><s:message code="menuitems.PLACEHOLDER"/> </a></li>
                    <li><a href="http://www.onet.pl"><s:message code="menuitems.PLACEHOLDER"/> </a></li>
                </ul>
            </li>
            <li><a href="#">Pracownicy</a>
                <ul>
                    <li><a href="/show-customers.html"><s:message code="menuitems.showworker"></s:message></a></li>
                    <li><a href="/add-customer.html"><s:message code="menuitems.addworker"></s:message></a></li>
                    <li><a href="http://www.google.pl"><s:message code="menuitems.PLACEHOLDER"/> </a></li>
                    <li><a href="http://www.onet.pl"><s:message code="menuitems.PLACEHOLDER"/> </a></li>
                </ul>
            </li>
            <li><a href="#">Zamowienia</a>
                <ul>
                    <li><a href="/show-customers.html"><s:message code="menuitems.showorders"></s:message></a></li>
                    <li><a href="/add-customer.html"><s:message code="menuitems.addorders"></s:message></a></li>
                    <li><a href="http://www.google.pl"><s:message code="menuitems.PLACEHOLDER"/> </a></li>
                    <li><a href="http://www.onet.pl"><s:message code="menuitems.PLACEHOLDER"/> </a></li>
                </ul>
            </li>

        </ol>

    </div>

    <div id="main">
        <div>
            <table>
                <thread>
                    <tr>
                        <th>Lp.</th>
                        <th>Id</th>
                        <th>Imię</th>
                        <th>Nazwisko</th>
                        <th>Numer</th>
                    </tr>
                </thread>
                <tbody>
                <c:forEach items="${customer}" var="customer" varStatus="status">
                    <tr>
                        <td>${status.index+1}</td>
                        <td>${customer.id}</td>
                        <td>${customer.customerSurname}</td>
                        <td>${customer.customerSurname}</td>
                        <td>${customer.customerNumber}</td>
                        <td><a href="/add-customer.html?id=${customer.id}"><s:message code="general.edit"/> </a></td>
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