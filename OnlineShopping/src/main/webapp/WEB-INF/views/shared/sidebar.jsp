
<h1 class="my-4">Shop Name</h1>
          <div class="list-group">
           <c:forEach items="${categories}" var="c">
            <a href="${contextRoot}/show/category/${c.id}/products" class="list-group-item">${c.name}</a>
           </c:forEach>
          </div>