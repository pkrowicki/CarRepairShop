<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><s:message code="index.maintitle"/></title>
    <style>
        body {
            background: #000;
            color: #fff;
            line-height: 1.4em;
        }

        a {
            color: #fff;
            text-decoration: none;
        }

        ul {
            padding: 0;
        }

        img {
            max-width: 100%;
            max-height: 100%;
        }

        .clr {
            clear: both;
        }

        #container {
            background: #333;
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
            height: 40px;
            background: #666;
        }

        #nav ul {
            padding-top: 13px;
            padding-left: 10px;
        }

        #nav li {
            list-style: none;
            float: left;
            padding-right: 20px;
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

        .services li {
            border-bottom: 2px #666 dashed;
            padding-bottom: 20px;
        }

        .services a {
            background: #666;
            padding: 10px;
        }

        .rightlandscape {
            float:right;
            height: auto%;
            width: 50%;
        }
        .leftlandscape {
            float:left;
            height: auto;
            width: 50%;
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
        <h1><s:message code="index.maintitle"></s:message></h1>
        <br>
        <p><s:message code="index.title"></s:message></p>
    </div>

    <div id="nav">
        <ul>
            <li><a href="show-products.html"><s:message code="index.menuitems.showproducts"></s:message></a></li>
            <li><a href="add-product.html"><s:message code="index.menuitems.addproduct"></s:message></a></li>
            <li><a href="http://www.google.pl"><s:message code="index.menuitems.google"/> </a></li>
            <li><a href="http://www.onet.pl"><s:message code="index.menuitems.pornuski"/> </a></li>
            <li>
                <a href="https://www.google.pl/search?q=cats&client=firefox-b&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiUzPbYqvTUAhXKLMAKHdilArsQ_AUICigB&biw=1920&bih=947"><s:message
                        code="index.menuitems.wiecejkotow"/> </a></li>
            <li>
                <a href="https://www.google.pl/search?client=firefox-b&biw=1920&bih=947&tbm=isch&q=shovel&sa=X&ved=0ahUKEwi9oNbnqvTUAhXMWRQKHeAOABkQhyYIJQ"><s:message
                        code="index.menuitems.wiecejszpadli"/> </a></li>
        </ul>
    </div>

    <div id="main">
        <h1>GORĄCE CZĘŚCI</h1>
        <div id="imagecontainer">
            <div class="leftlandscape"><img
                    src="http://quotesnhumor.com/wp-content/uploads/2015/07/Top-30-Funny-Cat-Memes-Hilarious.jpg"
                    alt="funny cat" height="350"
                    width="350"></div>
            <div class="leftlandscape"><img src="http://www.sklep.grube.pl/files/fotob/product-132.jpg" alt="spade"
                                            height="350" width="350"></div>
            <div class="rightlandscape"><img src="http://farm4.static.flickr.com/3162/2725224236_a7cf4cf514.jpg?v=0"
                                             alt="cat and spade" height="350" width="350"></div>
            <div class="rightlandscape"><img src="http://s2.quickmeme.com/img/93/9376344896527fc93e5ff7f59697a2b45038822965385bfe227c419dbe98975d.jpg"
                                             alt="cat and spade" height="350" width="350"></div>
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