object paren_balance {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  //&& countOpen == countClosed){
  
  var countOpen = 0                               //> countOpen  : Int = 0
  var countClosed = 0                             //> countClosed  : Int = 0
  var first = ""                                  //> first  : String = ""
  var last = ""                                   //> last  : String = ""
  var boolean = true                              //> boolean  : Boolean = true
  def balance(chars: List[Char]): Boolean =
  	if (chars.isEmpty && countOpen == countClosed) true
		
		else if (chars.isEmpty && countOpen != countClosed) false
		else{
		
			if (boolean) {
			println(chars.head)
				if (chars.head == ')') false
			}
			boolean = false
  		if (chars.head == '(') countOpen += 1
  		if(chars.head == ')') countClosed += 1
			if (chars.size == 1) {
			println(chars.head)
				if (chars.head == '(') false
			}
			balance(chars.tail)
		}                                 //> balance: (chars: List[Char])Boolean
  	
balance("((()))".toList)                          //> (
                                                  //| )
                                                  //| res0: Boolean = true
balance("())(".toList)                            //> (
                                                  //| res1: Boolean = true
}