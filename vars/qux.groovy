class qux implements Serializable {
    private String name

    def sayHi(script) {
        script.echo("${name} says HI!!!")
//        echo "echo says HI!"
    }

    def setName(value) {
        println("Setting name to ${value}")
        name = value
    }

    def getName(){
        name
    }
}