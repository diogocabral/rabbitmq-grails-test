class BootStrap {

    def testService
    def anotherService


    def init = { servletContext ->

        testService.initialize()
        anotherService.initialize()
    }
    def destroy = {
    }
}
