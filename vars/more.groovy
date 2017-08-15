def call(body) {
    script {
        def config = [:]
        body.resolveStrategy = Closure.DELEGATE_FIRST
        body.delegate = config
        body()
        node {

            println("inside node")
            println("config.name = ${config.name}")
            println("config = ${config}")
        }

    }
    println("Done running more.groovy")
}