abstract class Car(private var model: String, private var color: String, private var speed: Int){
    abstract fun getFuelType() :String
    override fun toString(): String {
        return "$model, Color: $color, Speed: $speed"
    }
}

class BMW(bModel: String, bColor: String, bSpeed: Int) :Car(bModel, bColor, bSpeed) {
    override fun getFuelType(): String {
        return "Gas"
    }

    override fun toString(): String {
        return "Model: BMW " + super.toString() + ", Gas Type: "+ getFuelType()
    }
}

class Tesla(tModel: String, tColor: String, tSpeed: Int) :Car(tModel, tColor, tSpeed) {
    override fun getFuelType(): String {
        return "Electric"
    }
    override fun toString(): String {
        return "Model: Tesla " + super.toString() + ", Gas Type: "+ getFuelType()
    }
}

fun main() {
    val car1 = BMW("X5", "Black", 250)
    val car2 = Tesla("Model S", "Blue", 220)
    println(car1.toString())
    println(car2.toString())
}