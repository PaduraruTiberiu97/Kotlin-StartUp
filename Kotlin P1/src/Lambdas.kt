fun main() {
    var dirtyLevel = 20
    var waterFilter={dirty:Int->dirty/2}
    println(waterFilter(dirtyLevel))

    val secondWaterFilter:(Int)->Int={dirtiLevelTwo->dirtiLevelTwo/2}
    println(updateDirty(50,secondWaterFilter))

    println(updateDirty(waterFilter(60),::increaseDirtyy))


}

fun updateDirty(dirty:Int,operation:(Int)->(Int)):Int{
    return operation(dirty)
}

fun increaseDirty(start:Int)=start+1

fun increaseDirtyy(start:Int):Int{
    return start+1
}
