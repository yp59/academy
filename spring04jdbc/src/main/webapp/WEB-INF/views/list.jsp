<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach var="i" items="${list}">
<div>
${i.itemNo}
${i.itemName}
${i.itemPrice}
</div>

</c:forEach>