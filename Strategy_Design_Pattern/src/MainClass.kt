
    fun main(args:Array<String>)
    {
        val duck=MolladDuck()
        duck.display()
        duck.setFlyBehavier(FlywithWing())
        duck.setQuckBehavier(CeeCeeQuck())
        duck.swim(true)
    }
