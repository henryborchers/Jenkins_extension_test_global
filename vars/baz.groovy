def call(Map args) {
    stage("Baz") {
//        node{
        echo "Starting"
        script {
            echo "I have a message at it is ${args.message}"
            println(body)
            args.body()

        }
        echo "ending"
//        }

    }
}