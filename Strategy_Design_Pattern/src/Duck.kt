open abstract class Duck
{

    fun swim(value:Boolean):Unit
    {
        println("This bird can fly ${value}")
    }
   abstract fun display():Unit

    fun setQuckBehavier(obj:QuckBahavier)
    {
        obj.quck()
    }

    fun setFlyBehavier(obj:FlyBehavier)
    {
        obj.fly()
    }
}