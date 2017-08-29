def call(message, Closure body) {
    stage("Baz") {
//        node{
        echo "Starting"
        script {
            echo "I have a message at it is ${message}"
            println(body)
            body()

        }
        echo "ending"
//        }

    }
}