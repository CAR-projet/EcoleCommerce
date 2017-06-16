<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<div class="fixed-action-btn">
	<a href="tests/edit" class="btn-floating btn-large red">
		<i class="large material-icons">add</i>
	</a>
</div>




<div class="row">
	<ul class="collapsible" data-collapsible="accordion">
		<c:forEach items="${ tests }" var="test">
			<li>
				<div class="collapsible-header">
					Test #${ test.idTest }
						<div class="card-action">
					<a class="btn amber success waves-effect waves-light" href="tests/delete/${ test.idTest }">Supprimer</a>
					<a class="btn amber success waves-effect waves-light" href="tests/edit/${ test.idTest }">Editer</a>
				</div>
				</div>
				
				<div class="collapsible-body">
					<p>
						Niveau : ${ test.niveau}
					</p>
				
				
				
					<p>
						 Branche : ${ test.branche}
					</p>
				
				
					<p>
						 Candidat : ${ test.candidat.prenom} ${ test.candidat.nom}
					</p>
					
					
				</div>
			</li>
		</c:forEach>
	</ul>
</div>