def call(){
    echo "Hello from Groovy Script"
    def files = findFiles(glob: "*.*")
    echo "Files = ${files}"
    echo "size = ${files.size()}"
}