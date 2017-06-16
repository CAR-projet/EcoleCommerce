<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="row">
	<ul class="collapsible" data-collapsible="accordion">
		<c:forEach items="${ tests }" var="test">
			<li>
				<div class="collapsible-header">
					Test #${ test.idTest }
				</div>
				
				<div class="collapsible-body">
					<p>
						Niveau : ${ test.niveau}
					</p>
				</div>
				
				<div class="collapsible-body">
					<p>
						 Branche : ${ test.branche}
					</p>
				</div>
				<div class="collapsible-body">
					<p>
						 Candidat : ${ test.candidat.nom}
					</p>
				</div>
			</li>
		</c:forEach>
	</ul>
</div>