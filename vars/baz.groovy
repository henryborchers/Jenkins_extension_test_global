def call(Closure body){
    stage("Baz") {
        node{
            body()
        }

    }
}