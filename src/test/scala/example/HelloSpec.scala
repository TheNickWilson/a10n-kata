package example

import org.scalatest._

class HelloSpec extends WordSpec with MustMatchers {

  "Hello" must {

    "say hello" in {
      Hello.greeting mustEqual "hello"
    }
  }
}
