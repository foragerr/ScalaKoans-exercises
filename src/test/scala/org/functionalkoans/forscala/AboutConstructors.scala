package org.functionalkoans.forscala

import support.KoanSuite

class AboutConstructors extends KoanSuite {

  class AboutConstructorWithAuxiliaryConstructor(val name: String) {
    // invoke auxiliary constructor
    def this() {
      // what happens if you comment out the following line?
      this ("defaultname")
    }
  }

  koan("Primary constructor specified with a parameter requires that parameter to be passed in") {
    val aboutMe = new AboutConstructorWithAuxiliaryConstructor()
    aboutMe.name should be ("defaultname")
  }

  class AboutClassWithNoClassParameter(var something:Int){
	def this(){
		this(2)
	}
  }

  koan("Class with no class parameters is called with no arguments") {
    // add parameter to make this fail
    val aboutMe = new AboutClassWithNoClassParameter()
	aboutMe.something should be (2)

  }
}
