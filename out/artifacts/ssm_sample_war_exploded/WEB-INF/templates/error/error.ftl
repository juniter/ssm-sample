<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/err/errorpage.css">
<link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>${status} ${reason}</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="error-template">
					<h1>Oops!</h1>
					<h2>${status} ${reason}</h2>
					<div class="error-details">${reason} Sorry, an error has occured,
						Requested page not found!</div>
					<div class="error-actions">
						<a href="www.baidu.com" class="btn btn-outline-success btn-lg">
							<span class="fa fa-home fa-lg fa-fw"></span> Take Me Home </a>
						<a href="www.baidu.com" class="btn btn-outline-secondary btn-lg">
							<span class="fa fa-envelope-o fa-lg fa-fw"></span> Contact Support </a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>