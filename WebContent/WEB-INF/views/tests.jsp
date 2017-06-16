<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>






<div class="row">
	<ul class="collapsible" data-collapsible="accordion">
		<c:forEach items="${ tests }" var="test">
			<li>
				<div class="collapsible-header">
					Test #${ test.id }
				</div>
				
				<div class="collapsible-body">
					<p>
						Niveau : ${ test.niveau}
					</p>
				</div>
				
				<div class="collapsible-body">
					<p>
						B : Branche : ${ test.branche}
					</p>
				</div>
			</li>
		</c:forEach>
	</ul>
</div>