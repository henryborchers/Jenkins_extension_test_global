class qux implements Serializable {
    private String name

    def sayHi() {
        echo "echo says HI!"
    }

    def setName(value) {
        name = value
    }

    def getName(){
        name
    }
}