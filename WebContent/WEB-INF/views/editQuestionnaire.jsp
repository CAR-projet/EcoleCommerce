<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<div class="row">
	<div class="col s4">
		<h5>Formulaire des questionnaires</h5>
		<form method="post">
			<input type="hidden" name="id" value="${ questionnaire.id }" />
			
			<div class="input-field">
				<input id="questionnaire_titre" type="text" class="validate" name="titre" value="${ questionnaire.titre }" />
				<label for="questionnaire_titre">Titre</label>
			</div>
			
			<div class="input-field">
				<input id="questionnaire_id" type="text" class="validate" name="id" value="${ questionnaire.id }" />
				<label for="questionnaire_id">ID</label>
			</div>
			
			<div class="input-field">
				<input id="questionnaire_duree" type="text" class="validate" name="durée" value="${ questionnaire.duree }" />
				<label for="questionnaire_duree">Durée</label>
			</div>
			
			
			<c:if test="${ questionnaire.id == null }">
				<button class="btn amber success waves-effect waves-light" type="submit">
					Continuer <i class="material-icons right">send</i>
				</button>
			</c:if>
			
			<c:if test="${ questionnaire.id != null }">
				<a class="btn red waves-effect waves-light" href="${ pageContext.request.contextPath }/">
					Annuler <i class="material-icons right">fast_rewind</i>
				</a>
				
				<button class="btn waves-effect waves-light" type="submit">
					Valider <i class="material-icons right">done</i>
				</button>
			</c:if>
		</form>
	</div>
	
	<div class="col s8">
		<c:if test="${ questionnaire.id != null }">
			<div class="fixed-action-btn">
				<a href="${ pageContext.request.contextPath }/questionnaire/${ questionnaire.id }/question/add" class="btn-floating btn-large red">
					<i class="large material-icons">add</i>
				</a>
			</div>
			
			
			<h5>Liste des questions</h5>
			
			<div class="row">
				<c:forEach items="${ questionnaire.question }" var="figure">
					<div class="col s2">
						<a class="red-text" href="${ pageContext.request.contextPath }/questionnaire/${ questionnaire.id }question/${ figure.id }/delete"><i class="material-icons">delete</i></a>
						
						<c:if test="${ figure.ordre > 0 }">
							<a class="amber-text" href="${ pageContext.request.contextPath }/questionnaire/${ questionnaire.id }question/${ question.id }/order/backward"><i class="material-icons">fast_rewind</i></a>
						</c:if>
						
						<c:if test="${ question.ordre < questionnaire.question.size() - 1 }">
							<a class="green-text" href="${ pageContext.request.contextPath }/questionnaire/${ questionnaire.id }/question/${ question.id }/order/forward"><i class="material-icons">fast_forward</i></a>
						</c:if>
						
						
						<table class="question">
							<c:forEach begin="0" end="3" step="1" var="i">
								<tr>
									<c:forEach begin="0" end="3" step="1" var="j">
										<c:set var="bloc" value="${ question.findBloc(j, i) }" />
										
																				
										<c:if test="${ bloc == null }">
											<td>
												<a href="${ pageContext.request.contextPath }/questionnaire/question/${ figure.id }/bloc/edit/${ j }-${ i }">&nbsp;</a>
											</td>
										</c:if>
									</c:forEach>
								</tr>
							</c:forEach>
						</table>
					</div>
				</c:forEach>
			</div>
		</c:if>
	</div>
</div>