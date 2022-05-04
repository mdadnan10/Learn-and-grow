package com.learning.learnandgrow.fragment

import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.learning.learnandgrow.R
import kotlinx.android.synthetic.main.fragment_practice.*
import java.lang.ArithmeticException

class PracticeFragment : Fragment() {

    lateinit var num1: EditText
    lateinit var num2: EditText
    lateinit var sign: TextView
    lateinit var etUserAnswer: EditText
    lateinit var addition: ImageButton
    lateinit var subtraction: ImageButton
    lateinit var multiply: ImageButton
    lateinit var division: ImageButton
    lateinit var checkAnswer: Button
    lateinit var showAnswer: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_practice, container, false)

        num1 = view.findViewById(R.id.num1)
        num2 = view.findViewById(R.id.num2)
        sign = view.findViewById(R.id.operation)
        etUserAnswer = view.findViewById(R.id.userAnswer)
        addition = view.findViewById(R.id.plus)
        subtraction = view.findViewById(R.id.minus)
        multiply = view.findViewById(R.id.multiply)
        division = view.findViewById(R.id.division)
        checkAnswer = view.findViewById(R.id.checkAndShowAnswer)
        showAnswer = view.findViewById(R.id.showAnswer)

        addition()
        subtraction()
        multiplication()
        division()

        checkAnswer.setOnClickListener {
            operation()
            operationWrapper.visibility = View.VISIBLE
        }

        return view
    }

    private fun validateNumber(num1: String, num2: String): Boolean {
        return if (num1.isEmpty() || num2.isEmpty()) {
            Toast.makeText(context as Activity, "Enter Both Number", Toast.LENGTH_LONG).show()
            false
        } else true
    }

    private fun validateOperator(op: String): Boolean {
        return if (op.isEmpty()) {
            Toast.makeText(context as Activity, "select a operation", Toast.LENGTH_LONG).show()
            false
        } else true
    }

    private fun validateUserAnswer(userAnswer: String): Boolean {
        return if (userAnswer.isEmpty()) {
            Toast.makeText(context as Activity, "Write your answer", Toast.LENGTH_LONG).show()
            false
        } else true
    }

    private fun operation() {

        val firstNumber = num1.text.toString().trim()
        val secondNumber = num2.text.toString().trim()
        val userAnswer = etUserAnswer.text.toString().trim()
        val operator = sign.text.toString()

        if (!validateNumber(
                firstNumber,
                secondNumber
            ) || !validateOperator(operator) || !validateUserAnswer(userAnswer)
        ) return

        try {
            val firstNum = firstNumber.toDouble()
            val secondNum = secondNumber.toDouble()

            when (operator) {

                "+" -> {
                    val myAnswer = (firstNum + secondNum)

                    if (userAnswer.toDouble() == myAnswer) {
                        val mediaPlayer =
                            MediaPlayer.create(context as Activity, R.raw.correct_answer)
                        mediaPlayer.start()
                    } else {
                        val mediaPlayer =
                            MediaPlayer.create(context as Activity, R.raw.wrong_answer)
                        mediaPlayer.start()
                    }

                    correctAnswer.visibility = View.VISIBLE
                    showAnswer.text = myAnswer.toString()
                }

                "-" -> {
                    val myAnswer = (firstNum - secondNum)

                    if (userAnswer.toDouble() == myAnswer) {
                        val mediaPlayer =
                            MediaPlayer.create(context as Activity, R.raw.correct_answer)
                        mediaPlayer.start()
                    } else {
                        val mediaPlayer =
                            MediaPlayer.create(context as Activity, R.raw.wrong_answer)
                        mediaPlayer.start()
                    }

                    correctAnswer.visibility = View.VISIBLE
                    showAnswer.text = myAnswer.toString()
                }

                "*" -> {
                    val myAnswer = (firstNum * secondNum)

                    if (userAnswer.toDouble() == myAnswer) {
                        val mediaPlayer =
                            MediaPlayer.create(context as Activity, R.raw.correct_answer)
                        mediaPlayer.start()
                    } else {
                        val mediaPlayer =
                            MediaPlayer.create(context as Activity, R.raw.wrong_answer)
                        mediaPlayer.start()
                    }

                    correctAnswer.visibility = View.VISIBLE
                    showAnswer.text = myAnswer.toString()
                }

                "/" -> {
                    val myAnswer = firstNum / secondNum

                    if (userAnswer.toDouble() == myAnswer) {
                        val mediaPlayer =
                            MediaPlayer.create(context as Activity, R.raw.correct_answer)
                        mediaPlayer.start()
                    } else {
                        val mediaPlayer =
                            MediaPlayer.create(context as Activity, R.raw.wrong_answer)
                        mediaPlayer.start()
                    }

                    correctAnswer.visibility = View.VISIBLE
                    showAnswer.text = myAnswer.toString()
                }

            }
        } catch (e: Exception){
            Toast.makeText(context as Activity, "Please enter a valid number.", Toast.LENGTH_LONG).show()
        }
    }

    private fun addition() {
        addition.setOnClickListener {
            sign.text = "+"
            operationWrapper.visibility = View.GONE
        }
    }

    private fun subtraction() {
        subtraction.setOnClickListener {
            sign.text = "-"
            operationWrapper.visibility = View.GONE
        }
    }

    private fun multiplication() {
        multiply.setOnClickListener {
            sign.text = "*"
            operationWrapper.visibility = View.GONE
        }
    }

    private fun division() {
        division.setOnClickListener {
            sign.text = "/"
            operationWrapper.visibility = View.GONE
        }
    }
}