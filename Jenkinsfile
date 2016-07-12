node {
    stage 'Run'
    bat 'Run.bat'
    stage 'Archive'
    archive '*.txt'

    // なぜかエラーになる
    def list = [1,5,9,2,0,1,5]
    list.findAll{ it % 2 == 0 }[0]
}
