def call(Closure body) {
    stage("Baz") {
//        node{
        echo "Starting"
        script {
            println(body)
            body()

        }
        echo "ending"
//        }

    }
}