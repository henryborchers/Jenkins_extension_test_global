def call(Closure body){
    stage("Baz") {
        node("windows"){
            body()
        }

    }
}