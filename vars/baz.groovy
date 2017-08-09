def call(){
    stage("Baz") {
        agent any
        steps {
            echo "I'm a BAZ"
        }

    }
}