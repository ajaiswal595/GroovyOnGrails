package rewards

class CustomerController {

    static scaffold = Customer

//    def index() {
//        render "aaa"
//    }

    def checkin() {

    }

    //lookup will call the lookup.gsp

    def lookup(){
        //customerInstance -> name of the controller you are calling form suffix with Instance   -> It's not a hard and fast rule
        //Customer.list() -> It will qurey the customer domain and return the whole list of customer
       //sort by lastName , order asc / desc , pagination max per page , offset add from current list shown in pagination

        // def customerInstance = Customer.list(sort:"lastName",orders: "asc",max:5,offset:5)

        //it will fetch the record of customer having totalPoint = 5.
       // def customerInstance = Customer.findAllByTotalPoints(5,[sort:"lastName"])


        //http://localhost:1515/customer/lookup/8015551212
        //it will read the phone from url fetch the data accordingly.

        def customerInstance  = Customer.findByPhone(params.id)


        //here we are returning the map which lookup.gsp will use to render the customer list.
        [customerInstanceList : customerInstance]

    }
}
