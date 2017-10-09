package com.xiaobai.platform.lottresult

import org.junit.Test
import java.time.Instant

//@RunWith(SpringRunner::class)
//@SpringBootTest
class LottResultApplicationTests {

	@Test
	fun contextLoads() {

        val firstTime = Instant.now()
        Thread.sleep(100)
        val secondTIme = Instant.now()

        println(firstTime.isBefore(secondTIme))

	}

}
