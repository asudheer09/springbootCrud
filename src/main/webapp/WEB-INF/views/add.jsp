<link rel="stylesheet" href="/resources/bootstrap.min.css">
<script type="text/javascript" src="/resources/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="/resources/bootstrap.min.js"></script>
<style>
.well {
	margin-top: 4%;
}
.form-legend {
	padding-bottom: 2em;
}
</style>
<script>
$(document).ready(function () {
});
</script>
<div class="container">
		<div class="row">
			<div class="col-sm-8 col-sm-offset-2 well">
				<div class="col-sm-12 form-legend">
					<h2>Sign Up</h2>
				</div>
				<div class="col-sm-12 form-column">
					<form action="saveCustomer" method="post" modelAttribute="customer">
						<div class="form-group">
							<label for="email">First Name</label>
							<input type="text" id="firstName" name="firstName" class="form-control">
						</div>
						<div class="form-group">
							<label for="email-confirm">Last Name</label>
							<input type="text" id="lastName" name="lastName" class="form-control">
						</div>
						<div class="form-group">
							<label for="country">Village Name</label>
							<input type="text" id="villageName" name="villageName" class="form-control">
						</div>
						<div class="form-group">
							<label for="zip-code">Phone Number</label>
							<input type="text" id="phoneNumber" name="phoneNumber" class="form-control">
						</div>
						<div class="form-group">
							<label for="password">Milk in Quantity</label>
							<input type="text" id="milkQuantty" name="milkQuantty" class="form-control">
						</div>
						<input type="submit" value="Create Customer" class="btn btn-primary">
					</form>
				</div>
			</div>
		</div>
</div>