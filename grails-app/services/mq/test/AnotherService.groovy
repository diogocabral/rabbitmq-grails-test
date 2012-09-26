package mq.test

class AnotherService {

    static rabbitQueue = "msgs"
    int count = 0

    def initialize (){
        log.debug("Test Service 2 initialized")
    }

    void handleMessage(msg) {
        println "(2) Seen ${count++} weird: ${msg}"
    }




}
