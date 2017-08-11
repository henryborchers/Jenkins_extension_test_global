def call(body){
    println("Runing more.groovy")
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    println("Done running more.groovy")
}