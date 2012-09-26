package mq.test

class HunterService {

    static rabbitQueue = "msgs"

        int count = 0;

        def initialize (){
            log.debug("Hunter Service initialized")
        }

        void handleMessage(msg) {
                println "(Hunter caught) ${count++} weird: ${msg}"
        }

}
