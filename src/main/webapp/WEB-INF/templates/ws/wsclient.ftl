<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>WebSocket</title>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/global.css">
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <#--socket js support-->
    <script src="/socketjs/sockjs.js"></script>
    <script src="/js/jquery-3.2.1.min.js"></script>
    <script>
        $(function () {
            wsStart();
        });

        function wsStart() {
            var sock = new SockJS('http://localhost:8080/myhandler');
            sock.onopen = function () {
                console.log('websocket has opened!');
                sock.send('test');
            };

            sock.onmessage = function (e) {
                console.log(e);
                console.log('received message:', e.data);
                $("p.card-text")[0].innerHTML = e.data;
                sock.close();
            };

            sock.onclose = function () {
                console.log('websocket closed!');
            };
        }
    </script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="card" style="width: 600px;margin: auto;">
            <div class="card-header">
                WebSocket view ~
            </div>
            <div class="card-body">
                <h5 class="card-title">websocket server message</h5>
                <p class="card-text"></p>
            </div>
        </div>
    </div>
</div>
</body>
</html>