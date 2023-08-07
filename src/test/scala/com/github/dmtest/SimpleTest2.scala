package com.github.dmtest

import io.qameta.allure.scalatest.AllureScalatestContext

class SimpleTest2 extends CommonTest {

  it("SimpleTest2_1")(new AllureScalatestContext {
    log.info("SimpleTest2_1 started")
  })

  it("SimpleTest2_2")(new AllureScalatestContext {
    log.info("SimpleTest2_2 started")
  })

  it("SimpleTest2_3")(new AllureScalatestContext {
    log.info("SimpleTest2_3 started")
  })
}
