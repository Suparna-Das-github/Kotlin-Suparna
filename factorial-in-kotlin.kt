// factorial in kotlin by suparna


fun main(args: Array<String>)
{
var a: Int = readLine()!!.toInt()

var fact=1
while(a!=0)
{
    if(a>=1)
    {
        fact=fact*a
        a--
    }

else
    {
    println("Enter correct no.")
    }
}
println(fact)
}
