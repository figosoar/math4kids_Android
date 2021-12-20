package com.example.math4kids

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.lang.StrictMath.random
import java.time.Duration
import java.time.Instant
import java.time.LocalTime
import java.time.temporal.ChronoUnit
import java.util.*
import java.time.temporal.TemporalAdjusters.previous
import java.time.*
import java.time.format.DateTimeFormatter


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextButton: Button = findViewById(R.id.next_button)
        //nextButton.text = "Let Practice"


        val expression: TextView = findViewById(R.id.math_expression)
        //expression.text = "Creative 101"

        val count: TextView = findViewById(R.id.expression_count)
        val startTime: TextView = findViewById(R.id.start_time)
        val endTime: TextView = findViewById(R.id.end_time)

        //val randomInt = Random().nextInt(6) + 1
        //expression.text = randomInt.toString()


        var total: Int = 0
        var k = 0
        var j = 0
        //val mathlist: List<String> = ArrayList()
        //val mathlist2: List<String> = ArrayList()
        val mathlist = arrayListOf("")
        val mathlist2 = arrayListOf("")

        //对应第一幅图
        val num: Int = 20
        for (a in 1..20) {
            if (a > 9) {
                k = 20 - a
                for (j in 0..k) {
                    //println(j)
                    //println("${a} + ${j} =")
                    mathlist.add("${a} + ${j} =")
                    total += 1
                }
                //println(a)
            }
        }
        println(total)


        for (a in 0..10) {
            k = 10 - a
            for (j in 0..k) {
                if (j > 5 - a) {
                    //println(j)
                    //println("${j} + ${a} =")
                    mathlist.add("${j} + ${a} =")
                    total += 1
                }
                //println(a)
            }
        }
        println(total)


        for (a in 0..10) {
            k = 10 - a
            for (j in 0..10) {
                if (j > 5 && j >= a) {
                    //println(j)
                    //println("${j} - ${a} =")
                    mathlist.add("${j} - ${a} =")
                    total += 1
                }
                //println(a)
            }
        }
        println(total)

//        for (i in 0..1) {
//            println(i)
//            //mathlist2.add(i, i.toString())
//            mathlist2.add(i.toString())
//        }

//        for (item in mathlist2) {
//            //println(a)
//            println(item)
//        }


        mathlist.shuffle()
        println(mathlist)

//        var printNum = 0
//        for (index in mathlist.indices) {
//            println(mathlist[index])
//            expression.text = mathlist[index]
//            //mathlist.removeAt(index)
//            printNum = printNum + 1
//        }
//        println(printNum)
        var clickNum: Int = 1
        val fmt = DateTimeFormatter.ofPattern("HH:mm:ss")
        //var startTime: Instant= Instant.now()

        val timelist: LongArray = longArrayOf()

        nextButton.setOnClickListener {
            if (clickNum == 1) {
                var localTime = LocalTime.now()
                println(localTime)
                var format3 = localTime.format(DateTimeFormatter.ISO_TIME);
                startTime.text = format3
                endTime.text = ""
            }

            expression.text = mathlist[clickNum-1]
            count.text = clickNum.toString()
            //time.text = mathlist[clickNum]

            if (clickNum > 156) {

                var localTime = LocalTime.now()
                println(localTime)
                var format3 = localTime.format(DateTimeFormatter.ISO_TIME);
                endTime.text = format3

                clickNum = 0
                expression.text = "start"
                count.text = "0"
            }
            clickNum += 1
        }
        println(clickNum)


    }


    private fun calculate() {


    }
}

    private fun Any.append(s: String) {

    }
