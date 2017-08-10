def call(Closure body){
    stage("Baz") {
        node{
            println(body)
            body()
        }

    }
}