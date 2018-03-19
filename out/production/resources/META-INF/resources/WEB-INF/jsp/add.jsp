<%@ include file="header.jspf" %>

    <div class="container">
        <form action="/insta/service/add" method="post">

        <div class="form-group">
            <label>Type accounts that should win:</label>
            <textarea name="users" class="form-control" rows="5">${u}</textarea>
            <input type="submit" class="btn btn-success" style="float: right; margin-top: 2%" value="Send">
        </form>
        </div>
    </div>

<%@ include file="footer.jspf" %>

