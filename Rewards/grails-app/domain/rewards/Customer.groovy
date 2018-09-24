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

         //you can't use size if your field is nullable for ex :  firstName(nullable: true,size:1..15)    it's wrong statement
        phone()
        firstName(nullable: true,size:1..15)  // it's working in grails 3.x but in 2.x it don't as per udemy trainer
        lastName(nullable: true,maxSize: 30)
        email(nullable: true, email: true)    // email:true is validation on the text you will enter in text box , it will accept valid email.
        totalPoints(nullable: true,max: 10)
    }
}
