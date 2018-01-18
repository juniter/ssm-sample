<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>WebSocket</title>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/global.css">
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
</head>
<body>
<div class="container-fluid">
    <div class="card">
        <div class="card-header">
           WebSocket view ~
        </div>
        <div class="card-body">
            <h5 class="card-title">Special title treatment</h5>
            <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
            <a href="#" class="btn btn-primary">Go somewhere</a>
        </div>
    </div>
</div>
<#--socket js support-->
<script src="https://cdn.jsdelivr.net/npm/sockjs-client@1/dist/sockjs.min.js"></script>
<script src="/js/jquery-3.2.1.min.js"></script>
<script>
    $(function () {
        const sock = new SockJS('ws://localhost:8080/myhandler');
        soct.onopen = function () {
            console.log('websocket has opened!');
            sock.send('test');
        };

        soct.onmessag = function (e) {
            console.log('received message:',e.data);
            $("h5.card-title").innerHTML = e.data;
        };

        coct.onclose = function () {
            console.log('websocket closed!');
        };
    })
</script>
</body>
</html>