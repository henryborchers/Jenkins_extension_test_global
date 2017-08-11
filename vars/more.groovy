def call(body) {
    println("Runing more.groovy")
    def config = [:]

    println("body.resolveStrategy = Closure.DELEGATE_FIRST")
//    body.resolveStrategy = Closure.DELEGATE_FIRST
//    body.delegate = config
//
    println("config.name = ${config.name}")
//    println("body()")
//    body()
    println("Done running more.groovy")
}