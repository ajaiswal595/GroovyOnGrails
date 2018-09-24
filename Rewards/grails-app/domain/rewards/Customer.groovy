package rewards

class Customer {

    String firstName
    String lastName
    Long phone
    String email
    Integer totalPoints
    static hasMany = [awards:Award, orders:OnlineOrder]


    static constraints = {

        //the order you provide here same will reflect in html
        phone()
        firstName()
        lastName()
        email()
        totalPoints()
    }
}
