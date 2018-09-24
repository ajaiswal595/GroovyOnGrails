package rewards

//BootStrap is something which get Executed when application server start.

class BootStrap {

    def init = { servletContext ->
        new Product(name:"Morning Blend",sku:"MB01",price: 14.95).save()         //here i'm prepopulating the data in data base to get rid of data insertion when server restarted.
        new rewards.Product(name:"Dark Roast",sku:"DK01",price: 12.95).save()
    }
    def destroy = {
    }
}
