package rewards

class Award {

    Date awardDate
    String type
    Integer points
    static belongsTo = [customer:Customer]
    static hasMany = [orderItems:OrderItem]

    static constraints = {
        type(inList: ["Purchase","Reward"] )    //it will create a drop down list to select either Purchase or Reward for type attribute in domain.
    }
}
