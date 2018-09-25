package rewards

class WhiteboardController {

    //In controller every function is an action.

    def index() { }

    def variables(){
        def myTotal = 1
        render("Total: "+myTotal)   //render send data to view layer
    }
}
