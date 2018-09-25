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

    def strings() {
        def first = "Ajay"
        def last = "Jaiswal"
        def points = 4
        //render"welcome back " +first+" "+last+"you have "+points+"points"

        render "welcome back $first $last you have $points points"  //using interpolation

        def fullName ="Ajay Kumar Jaiswal"
        render "</br>Today is ${new Date()} and full name length is ${fullName.length()}"  // we can use expression using ${} in String

    }

    def accessParam(){
        def name = params.name
        def age = params.age
        render "Hello $name you are truning $age"
    }
}
