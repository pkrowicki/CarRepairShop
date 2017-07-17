<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <title><s:message code="maintitle"/></title>
    <link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/style.css" />" />
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
            <li><a href="/show-products.html"><s:message code="menuitems.showproduct"></s:message></a></li>
            <li><a href="/add-product.html"><s:message code="menuitems.addproduct"></s:message></a></li>
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
            <li><a href="/show-employees.html"><s:message code="menuitems.showworker"></s:message></a></li>
            <li><a href="/add-employee.html"><s:message code="menuitems.addworker"></s:message></a></li>
            <li><a href="http://www.google.pl"><s:message code="menuitems.PLACEHOLDER"/> </a></li>
            <li><a href="http://www.onet.pl"><s:message code="menuitems.PLACEHOLDER"/> </a></li>
        </ul>
    </li>
    <li><a href="#">Zamowienia</a>
        <ul>
            <li><a href="/show-orders.html"><s:message code="menuitems.showorders"></s:message></a></li>
            <li><a href="/add-order.html"><s:message code="menuitems.addorders"></s:message></a></li>
            <li><a href="http://www.google.pl"><s:message code="menuitems.PLACEHOLDER"/> </a></li>
            <li><a href="http://www.onet.pl"><s:message code="menuitems.PLACEHOLDER"/> </a></li>
        </ul>
    </li>

</ol>

</div>