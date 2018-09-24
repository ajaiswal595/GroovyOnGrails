package rewards

class InventoryController {
    //action index
    def index() {
        render "Here is a list of everything."
    }
    //action edit
    def edit() {
        def productName= "Breakfast Blend"
        def sku = "BB01"

        //Below one is map
        [product:productName,sku:sku]

    }
    //action remove
    def remove(){
        render "Here is remove function."
    }

    def list(){          //Prodcut is domain name   goto the the domain called product and give me the list
        def allProduct = Product.list()
        [allProduct:allProduct]
    }
}
