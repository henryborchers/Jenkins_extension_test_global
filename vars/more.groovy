def call(body) {
    println("Runing more.groovy")
    def config = [:]

    println("body.resolveStrategy = Closure.DELEGATE_FIRST")
    body.resolveStrategy = Closure.DELEGATE_FIRST
    println("body.delegate = config")
    body.delegate = config
//
    println("body()")
    body()
    node {
        println("inside node")
        println("config.name = ${config.name}")
    }
    println("Done running more.groovy")
}