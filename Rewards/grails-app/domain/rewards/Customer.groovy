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

        // the field having nullable : true are not mandatory field
        phone()
        firstName(nullable: true    )
        lastName(nullable: true)
        email(nullable: true)
        totalPoints()
    }
}
