var Chrome = require('chrome-remote-interface-nashorn');
Chrome(function (chrome) {
    with(chrome){
        on('Network.requestWillBeSent', function (message) {
            console.log(message.request.url);
        });
        on('Page.loadEventFired', close);
        Network.enable();
        Page.enable();
        Page.navigate({'url': 'https://netflix.com'});
    }
}).on('error', function () {
    console.error('Cannot connect to Chrome');
});
