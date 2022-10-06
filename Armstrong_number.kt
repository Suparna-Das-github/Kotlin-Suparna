// Coded by Suparna Das.

// Program to find whether number is armstrong number.

// Please enter number maximum three numbers 

// Thanks for watching.


fun main(args: Array <String>) 
{
    var number= readLine()!!.toInt() 
    var remainder : Int
    var result : Int
    result = 0
    var number_input = number
      
    while(number!=0)
    {
        remainder = number % 10
        result = result + (remainder * remainder * remainder)
        number = number / 10
   }   
    
    if (number_input == result)
    {
        println("The Number : "+ number_input + " is an armstrong number\n")
    }
    else
    {
        println("The Number entered: " +number_input +" is not an armstrong number \n")
    }
               
}
