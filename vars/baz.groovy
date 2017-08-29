def call(Closure body) {
    stage("Baz") {
//        node{
        script {
            println(body)
            body()

        }
//        }

    }
}