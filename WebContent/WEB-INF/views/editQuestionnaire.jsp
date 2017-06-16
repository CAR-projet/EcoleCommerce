
</html><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<div class="fixed-action-btn">
	<a href="question/edit" class="btn-floating btn-large red">
		<i class="large material-icons">add</i>
	</a>
</div>
<div class="row">
	<div class="col s4">
		<h5>Formulaire Questionnaire</h5>
		<form method="post" action="">
			<input type="hidden" name="id" value="${ questionnaire.id }" />
			
			<div class="input-field">
				<select id="questionnaire_temps"  name="temps"  >
				<option selected >Durée
				<option>1H
				<option>2H
				<option>3H
				</select>
			
			</div>
			
			<div class="input-field">
				<input id="questionnaire_matiere" type="text" class="validate" name="matiere" value="${ matiere.nom }" />
				<label for="matiere_nom">Matière désirée</label>
			</div>
			
			 
			<div class="input-field">
				<input id="questionnaire_titre" type="text" class="validate" name="titre" value="${ matiere.nom }" />
				<label for="matiere_nom">Titre du questionnaire</label>
			</div>
			
			<c:if test="${ test.id == null }">
				<button class="btn amber success waves-effect waves-light" type="submit">
					Continuer <i class="material-icons right">send</i>
				</button>
			</c:if>
</form>
</div>
</div>