

class qux implements Serializable{
    private String name

    def sayHi(){
        println("HI!!!")
        echo "echo says HI!"
    }
    def setName(value){
        name = value
    }
}