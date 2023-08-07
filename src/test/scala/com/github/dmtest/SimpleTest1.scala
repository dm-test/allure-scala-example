package com.github.dmtest

import io.qameta.allure.scalatest.AllureScalatestContext

class SimpleTest1 extends CommonTest {

  it("SimpleTest1_1")(new AllureScalatestContext {
    log.info("SimpleTest1_1 started")
  })

  it("SimpleTest1_2")(new AllureScalatestContext {
    log.info("SimpleTest1_2 started")
  })

  it("SimpleTest1_3")(new AllureScalatestContext {
    log.info("SimpleTest1_3 started")
  })
}
