package mq.test

class RabbitController {

    int count = 0

    def index() {
        println "controller"

        render "OK"
    }

    def breed = {
        if (Rabbit.findAll().size()==0) {
            println "perfectly formed rabbit"
            def rabbit = new Rabbit(legs:4)
            rabbit.save(false)
            rabbitSend 'msgs' , "Wabbit!!!"

        } else {
            def lastRabbit = Rabbit.last()
            println "they are mutating: rabbits now have  ${Rabbit.findAll().size()} legs "
            def rabbit = new Rabbit(legs:lastRabbit.legs++).save()
            rabbitSend 'msgs' , "Wabbit!!!!"
        }

        render "OK"
    }
}
