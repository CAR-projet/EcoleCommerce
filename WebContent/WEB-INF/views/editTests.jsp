
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
</html><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<div class="row">
	<div class="col s4">
		<h5>Formulaire Test</h5>
		<form:form method="post" modelAttribute="test">
			<input type="hidden" name="id" value="${ test.idTest }" />
			
			<div class="input-field">
				<select id="test_niveau"  name="niveau"  >
				<option selected >Niveau
				<option>BAC
				<option>BAC_2
				<option>BAC_3
				</select>
			
			</div>
			
			 <div class="input-field"> 
				<select id="test_branche"  name="branche"  >
				<option selected >Branche
				<option>ingenieur_affaire
				<option>commercial
				<option>manager
				</select>
				
			 </div> 
			<div class="input-field">
				<input id="candidat_nom" type="text" class="validate" name="nom" value="${ candidat.nom }" />
				<label for="candidat_nom">Nom du candidat</label>
			</div>
			<div class="input-field">
				<input id="candidat_nom" type="text" class="validate" name="nom" value="${ candidat.prenom }" />
				<label for="candidat_nom">Prénom du candidat</label>
			</div>
				<div class="input-field">
				<input id="test_date" type="date" class="validate" name="nom" value="${ test.date }" />
			<label for="test_date"></label> 
			</div>
			
			<c:if test="${ test.idTest == null }">
				<button class="btn amber success waves-effect waves-light" type="submit">
					Ajouter <i class="material-icons right">send</i>
				</button>
			</c:if>
			<c:if test="${ test.idTest != null }">
				<button class="btn amber success waves-effect waves-light" type="submit">
					Valider <i class="material-icons right">send</i>
				</button>
			</c:if>
</form:form>
</div>
</div>
<%-- <h2> Choix Questionnaire :</h2>
<div class="row">
	<ul class="collapsible" data-collapsible="accordion">
		<c:forEach items="${ questionnaires }" var="questionnaire">
		
			<li>
				<div class="collapsible-header">
					<input type="checkbox" name="questionnaire" value=${ questionnaire.idQuestionnaire }>     Questionnaire #${ questionnaire.idQuestionnaire }
					
				</div>
				
				<div class="collapsible-body">
					<p>
						titre : ${ questionnaire.titre}
					</p>
					<p>
						 matière : ${ questionnaire.matiere.nomMatiere} 
					</p>
					<p>
						 Durée : ${questionnaire.duree}
					</p>

					
				</div>
			</li>
		</c:forEach>
	</ul>
</div> --%>
