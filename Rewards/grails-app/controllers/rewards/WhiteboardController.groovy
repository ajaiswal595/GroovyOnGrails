package rewards

class WhiteboardController {

    //In controller every function is an action.

    def index() { }

    def variables(){
        def myTotal = 1
        render("Total: "+myTotal)   //render send data to view layer

        def firstName ="Ajay"
        render("</br>Name : "+firstName)

        def today = new Date()
        render("<br> Today is "+today.getDate())

       /*  today = today+1    // we can perform add numbers so it will tell you the day by calculating leap year as well
        render("<br> Today is "+today.getDate())*/
    }
}
