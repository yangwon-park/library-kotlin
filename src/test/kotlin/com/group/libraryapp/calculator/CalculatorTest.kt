package com.group.libraryapp.calculator

import java.lang.Exception
import java.lang.IllegalArgumentException
import java.lang.IllegalStateException

fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiplyTest()
    calculatorTest.divideTest()
    calculatorTest.divideExceptionTest()
}

class CalculatorTest {

    fun addTest() {
        val calculator = Calculator(5)
        calculator.add(3)

        if (calculator.number != 8) {
            throw IllegalStateException()
        }
    }

    fun minusTest() {
        val calculator = Calculator(5)
        calculator.minus(3)

        if (calculator.number != 2) {
            throw IllegalStateException()
        }
    }

    fun multiplyTest() {
        val calculator = Calculator(5)
        calculator.multiply(3)

        if (calculator.number != 15) {
            throw IllegalStateException()
        }
    }

    fun divideTest() {
        val calculator = Calculator(5)
        calculator.divide(2)

        if (calculator.number != 2) {
            throw IllegalStateException()
        }
    }

    fun divideExceptionTest() {
        val calculator = Calculator(5)

        try {
            calculator.divide(0)
        } catch (e: IllegalArgumentException) {
            if (e.message != "0으로 나눌 수 없습니다") {
                throw IllegalStateException("메세지가 다릅니다")
            }
            
            // 성공
            return
        } catch (e: Exception) {
            throw IllegalStateException()
        }

        throw IllegalStateException("기대하는 예외가 발생하지 않았습니다")
    }
}