package mq.test

class TestService {

    static rabbitQueue = "msgs"

    int count = 0;

    def initialize (){
        log.debug("Test Service 1 initialized")
    }

    void handleMessage(msg) {
            println "(1) Seen ${count++} weird: ${msg}"
    }




}
