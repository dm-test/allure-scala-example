package com.github.dmtest

import org.scalatest.BeforeAndAfterAll
import org.scalatest.funspec.AnyFunSpec
import org.slf4j.{Logger, LoggerFactory}

import java.time.LocalDateTime

trait CommonTest extends AnyFunSpec with BeforeAndAfterAll {
  lazy val log: Logger = LoggerFactory.getLogger(this.getClass)

  override def beforeAll: Unit = {
    log.info("Before sleep: {}", LocalDateTime.now)
    Thread.sleep(3500) //FIXME: Comment this row and receive all allure-results file
    log.info("After sleep: {}", LocalDateTime.now)
    super.beforeAll
  }

}
