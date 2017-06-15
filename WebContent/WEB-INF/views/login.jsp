<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<form:form method="post" modelAttribute="user">
	<input type="hidden" name="action" value="login" />
	
	<div class="input-field">
		<i class="material-icons prefix">account_circle</i>
		<input id="name" type="text" class="validate" name="username" value="" />
		<label for="name"><spring:message code="account.login.form.label.username" /></label>
		<form:errors class="red-text" path="username" />
	</div>
	
	<div class="input-field">
		<i class="material-icons prefix">vpn_key</i>
		<input id="password" type="password" class="validate" name="password" />
		<label for="password"><spring:message code="account.login.form.label.password" /></label>
		<form:errors class="red-text" path="password" />
	</div>
	
	<button class="btn waves-effect waves-light" type="submit">
		<spring:message code="account.login.form.submit" /> <i class="material-icons right">lock</i>
	</button>
	
	
</form:form>