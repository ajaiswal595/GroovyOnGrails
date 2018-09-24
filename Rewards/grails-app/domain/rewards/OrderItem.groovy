package rewards

class OrderItem {

    Integer qty
    Float total

    //[key:Value]
    static belongsTo = [order:OnlineOrder, product:Product]

    static constraints = {
    }
}
