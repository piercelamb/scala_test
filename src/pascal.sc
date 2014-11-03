object pascal {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def pascal(c: Int, r: Int): Int =
  	if (c == 0) 1
  	else if (c == r) 1
  	else pascal(c-1, r-1) + pascal(c, r-1)    //> pascal: (c: Int, r: Int)Int
  	
  pascal(0,2)                                     //> res0: Int = 1
  pascal(1,2)                                     //> res1: Int = 2
  pascal(1,3)                                     //> res2: Int = 3
  pascal(1,4)                                     //> res3: Int = 4
}