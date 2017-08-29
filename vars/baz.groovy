def call(Map args, Closure body) {
    stage("Baz") {
//        node{
        echo "Starting"
        script {
            echo "I have a message at it is ${args.message}"
            println(body)
            body()

        }
        echo "ending"
//        }

    }
}