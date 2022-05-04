package com.learning.learnandgrow.fragment

import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.learning.learnandgrow.R
import kotlinx.android.synthetic.main.fragment_numbers.*
import kotlinx.android.synthetic.main.fragment_numbers.view.*

class NumbersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_numbers, container, false)

        var mediaZero = MediaPlayer.create(context as Activity, R.raw.zero)
        var mediaOne = MediaPlayer.create(context as Activity, R.raw.one)
        var mediaTwo = MediaPlayer.create(context as Activity, R.raw.two)
        var mediaThree = MediaPlayer.create(context as Activity, R.raw.three)
        var mediaFour = MediaPlayer.create(context as Activity, R.raw.four)
        var mediaFive = MediaPlayer.create(context as Activity, R.raw.five)
        var mediaSix = MediaPlayer.create(context as Activity, R.raw.six)
        var mediaSeven = MediaPlayer.create(context as Activity, R.raw.seven)
        var mediaEight = MediaPlayer.create(context as Activity, R.raw.eight)
        var mediaNine = MediaPlayer.create(context as Activity, R.raw.nine)

        view.zero.setOnClickListener {
            // set gif
            zero.setImageResource(R.drawable.zero_cc)

            // unset gif
            one.setImageResource(R.drawable.one_nc)
            two.setImageResource(R.drawable.two_nc)
            three.setImageResource(R.drawable.three_nc)
            four.setImageResource(R.drawable.four_nc)
            five.setImageResource(R.drawable.five_nc)
            six.setImageResource(R.drawable.six_nc)
            seven.setImageResource(R.drawable.seven_nc)
            eight.setImageResource(R.drawable.eight_nc)
            nine.setImageResource(R.drawable.nine_nc)

            // play
            mediaZero.start()

            // pause
            mediaOne.stop()
            mediaTwo.stop()
            mediaThree.stop()
            mediaFour.stop()
            mediaFive.stop()
            mediaSix.stop()
            mediaSeven.stop()
            mediaEight.stop()
            mediaNine.stop()

            // reset
            mediaOne = MediaPlayer.create(context as Activity, R.raw.one)
            mediaTwo = MediaPlayer.create(context as Activity, R.raw.two)
            mediaThree = MediaPlayer.create(context as Activity, R.raw.three)
            mediaFour = MediaPlayer.create(context as Activity, R.raw.four)
            mediaFive = MediaPlayer.create(context as Activity, R.raw.five)
            mediaSix = MediaPlayer.create(context as Activity, R.raw.six)
            mediaSeven = MediaPlayer.create(context as Activity, R.raw.seven)
            mediaEight = MediaPlayer.create(context as Activity, R.raw.eight)
            mediaNine = MediaPlayer.create(context as Activity, R.raw.nine)
        }

        view.one.setOnClickListener {
            // set gif
            one.setImageResource(R.drawable.one_cc)

            // unset other gif
            zero.setImageResource(R.drawable.zero_nc)
            two.setImageResource(R.drawable.two_nc)
            three.setImageResource(R.drawable.three_nc)
            four.setImageResource(R.drawable.four_nc)
            five.setImageResource(R.drawable.five_nc)
            six.setImageResource(R.drawable.six_nc)
            seven.setImageResource(R.drawable.seven_nc)
            eight.setImageResource(R.drawable.eight_nc)
            nine.setImageResource(R.drawable.nine_nc)

            // play
            mediaOne.start()

            // pause
            mediaZero.stop()
            mediaTwo.stop()
            mediaThree.stop()
            mediaFour.stop()
            mediaFive.stop()
            mediaSix.stop()
            mediaSeven.stop()
            mediaEight.stop()
            mediaNine.stop()

            // reset
            mediaZero = MediaPlayer.create(context as Activity, R.raw.zero)
            mediaTwo = MediaPlayer.create(context as Activity, R.raw.two)
            mediaThree = MediaPlayer.create(context as Activity, R.raw.three)
            mediaFour = MediaPlayer.create(context as Activity, R.raw.four)
            mediaFive = MediaPlayer.create(context as Activity, R.raw.five)
            mediaSix = MediaPlayer.create(context as Activity, R.raw.six)
            mediaSeven = MediaPlayer.create(context as Activity, R.raw.seven)
            mediaEight = MediaPlayer.create(context as Activity, R.raw.eight)
            mediaNine = MediaPlayer.create(context as Activity, R.raw.nine)
        }

        view.two.setOnClickListener {
            // set gif
            two.setImageResource(R.drawable.two_cc)

            // unset other gif
            zero.setImageResource(R.drawable.zero_nc)
            one.setImageResource(R.drawable.one_nc)
            three.setImageResource(R.drawable.three_nc)
            four.setImageResource(R.drawable.four_nc)
            five.setImageResource(R.drawable.five_nc)
            six.setImageResource(R.drawable.six_nc)
            seven.setImageResource(R.drawable.seven_nc)
            eight.setImageResource(R.drawable.eight_nc)
            nine.setImageResource(R.drawable.nine_nc)

            // play
            mediaTwo.start()

            // pause
            mediaZero.stop()
            mediaOne.stop()
            mediaThree.stop()
            mediaFour.stop()
            mediaFive.stop()
            mediaSix.stop()
            mediaSeven.stop()
            mediaEight.stop()
            mediaNine.stop()

            // reset
            mediaZero = MediaPlayer.create(context as Activity, R.raw.zero)
            mediaOne = MediaPlayer.create(context as Activity, R.raw.one)
            mediaThree = MediaPlayer.create(context as Activity, R.raw.three)
            mediaFour = MediaPlayer.create(context as Activity, R.raw.four)
            mediaFive = MediaPlayer.create(context as Activity, R.raw.five)
            mediaSix = MediaPlayer.create(context as Activity, R.raw.six)
            mediaSeven = MediaPlayer.create(context as Activity, R.raw.seven)
            mediaEight = MediaPlayer.create(context as Activity, R.raw.eight)
            mediaNine = MediaPlayer.create(context as Activity, R.raw.nine)
        }

        view.three.setOnClickListener {
            // set gif
            three.setImageResource(R.drawable.three_cc)

            // unset other gif
            zero.setImageResource(R.drawable.zero_nc)
            one.setImageResource(R.drawable.one_nc)
            two.setImageResource(R.drawable.two_nc)
            four.setImageResource(R.drawable.four_nc)
            five.setImageResource(R.drawable.five_nc)
            six.setImageResource(R.drawable.six_nc)
            seven.setImageResource(R.drawable.seven_nc)
            eight.setImageResource(R.drawable.eight_nc)
            nine.setImageResource(R.drawable.nine_nc)

            // play
            mediaThree.start()

            // pause
            mediaZero.stop()
            mediaOne.stop()
            mediaTwo.stop()
            mediaFour.stop()
            mediaFive.stop()
            mediaSix.stop()
            mediaSeven.stop()
            mediaEight.stop()
            mediaNine.stop()

            // reset
            mediaZero = MediaPlayer.create(context as Activity, R.raw.zero)
            mediaOne = MediaPlayer.create(context as Activity, R.raw.one)
            mediaTwo = MediaPlayer.create(context as Activity, R.raw.two)
            mediaFour = MediaPlayer.create(context as Activity, R.raw.four)
            mediaFive = MediaPlayer.create(context as Activity, R.raw.five)
            mediaSix = MediaPlayer.create(context as Activity, R.raw.six)
            mediaSeven = MediaPlayer.create(context as Activity, R.raw.seven)
            mediaEight = MediaPlayer.create(context as Activity, R.raw.eight)
            mediaNine = MediaPlayer.create(context as Activity, R.raw.nine)
        }

        view.four.setOnClickListener {
            // set gif
            four.setImageResource(R.drawable.four_cc)

            // unset other gif
            zero.setImageResource(R.drawable.zero_nc)
            one.setImageResource(R.drawable.one_nc)
            two.setImageResource(R.drawable.two_nc)
            three.setImageResource(R.drawable.three_nc)
            five.setImageResource(R.drawable.five_nc)
            six.setImageResource(R.drawable.six_nc)
            seven.setImageResource(R.drawable.seven_nc)
            eight.setImageResource(R.drawable.eight_nc)
            nine.setImageResource(R.drawable.nine_nc)

            // play
            mediaFour.start()

            // pause
            mediaZero.stop()
            mediaOne.stop()
            mediaTwo.stop()
            mediaThree.stop()
            mediaFive.stop()
            mediaSix.stop()
            mediaSeven.stop()
            mediaEight.stop()
            mediaNine.stop()

            // reset
            mediaZero = MediaPlayer.create(context as Activity, R.raw.zero)
            mediaOne = MediaPlayer.create(context as Activity, R.raw.one)
            mediaTwo = MediaPlayer.create(context as Activity, R.raw.two)
            mediaThree = MediaPlayer.create(context as Activity, R.raw.three)
            mediaFive = MediaPlayer.create(context as Activity, R.raw.five)
            mediaSix = MediaPlayer.create(context as Activity, R.raw.six)
            mediaSeven = MediaPlayer.create(context as Activity, R.raw.seven)
            mediaEight = MediaPlayer.create(context as Activity, R.raw.eight)
            mediaNine = MediaPlayer.create(context as Activity, R.raw.nine)
        }

        view.five.setOnClickListener {
            // set gif
            five.setImageResource(R.drawable.five_cc)

            // unset other gif
            zero.setImageResource(R.drawable.zero_nc)
            one.setImageResource(R.drawable.one_nc)
            two.setImageResource(R.drawable.two_nc)
            three.setImageResource(R.drawable.three_nc)
            four.setImageResource(R.drawable.four_nc)
            six.setImageResource(R.drawable.six_nc)
            seven.setImageResource(R.drawable.seven_nc)
            eight.setImageResource(R.drawable.eight_nc)
            nine.setImageResource(R.drawable.nine_nc)

            // play
            mediaFive.start()

            // pause
            mediaZero.stop()
            mediaOne.stop()
            mediaTwo.stop()
            mediaThree.stop()
            mediaFour.stop()
            mediaSix.stop()
            mediaSeven.stop()
            mediaEight.stop()
            mediaNine.stop()

            // reset
            mediaZero = MediaPlayer.create(context as Activity, R.raw.zero)
            mediaOne = MediaPlayer.create(context as Activity, R.raw.one)
            mediaTwo = MediaPlayer.create(context as Activity, R.raw.two)
            mediaThree = MediaPlayer.create(context as Activity, R.raw.three)
            mediaFour = MediaPlayer.create(context as Activity, R.raw.four)
            mediaSix = MediaPlayer.create(context as Activity, R.raw.six)
            mediaSeven = MediaPlayer.create(context as Activity, R.raw.seven)
            mediaEight = MediaPlayer.create(context as Activity, R.raw.eight)
            mediaNine = MediaPlayer.create(context as Activity, R.raw.nine)
        }

        view.six.setOnClickListener {
            // set gif
            six.setImageResource(R.drawable.six_cc)

            // unset other gif
            zero.setImageResource(R.drawable.zero_nc)
            one.setImageResource(R.drawable.one_nc)
            two.setImageResource(R.drawable.two_nc)
            three.setImageResource(R.drawable.three_nc)
            four.setImageResource(R.drawable.four_nc)
            five.setImageResource(R.drawable.five_nc)
            seven.setImageResource(R.drawable.seven_nc)
            eight.setImageResource(R.drawable.eight_nc)
            nine.setImageResource(R.drawable.nine_nc)

            // play
            mediaSix.start()

            // pause
            mediaZero.stop()
            mediaOne.stop()
            mediaTwo.stop()
            mediaThree.stop()
            mediaFour.stop()
            mediaFive.stop()
            mediaSeven.stop()
            mediaEight.stop()
            mediaNine.stop()

            // reset
            mediaZero = MediaPlayer.create(context as Activity, R.raw.zero)
            mediaOne = MediaPlayer.create(context as Activity, R.raw.one)
            mediaTwo = MediaPlayer.create(context as Activity, R.raw.two)
            mediaThree = MediaPlayer.create(context as Activity, R.raw.three)
            mediaFour = MediaPlayer.create(context as Activity, R.raw.four)
            mediaFive = MediaPlayer.create(context as Activity, R.raw.five)
            mediaSeven = MediaPlayer.create(context as Activity, R.raw.seven)
            mediaEight = MediaPlayer.create(context as Activity, R.raw.eight)
            mediaNine = MediaPlayer.create(context as Activity, R.raw.nine)
        }

        view.seven.setOnClickListener {
            // set gif
            seven.setImageResource(R.drawable.seven_cc)

            // unset other gif
            zero.setImageResource(R.drawable.zero_nc)
            one.setImageResource(R.drawable.one_nc)
            two.setImageResource(R.drawable.two_nc)
            three.setImageResource(R.drawable.three_nc)
            four.setImageResource(R.drawable.four_nc)
            five.setImageResource(R.drawable.five_nc)
            six.setImageResource(R.drawable.six_nc)
            eight.setImageResource(R.drawable.eight_nc)
            nine.setImageResource(R.drawable.nine_nc)

            // play
            mediaSeven.start()

            // pause
            mediaZero.stop()
            mediaOne.stop()
            mediaTwo.stop()
            mediaThree.stop()
            mediaFour.stop()
            mediaFive.stop()
            mediaSix.stop()
            mediaEight.stop()
            mediaNine.stop()

            // reset
            mediaZero = MediaPlayer.create(context as Activity, R.raw.zero)
            mediaOne = MediaPlayer.create(context as Activity, R.raw.one)
            mediaTwo = MediaPlayer.create(context as Activity, R.raw.two)
            mediaThree = MediaPlayer.create(context as Activity, R.raw.three)
            mediaFour = MediaPlayer.create(context as Activity, R.raw.four)
            mediaFive = MediaPlayer.create(context as Activity, R.raw.five)
            mediaSix = MediaPlayer.create(context as Activity, R.raw.six)
            mediaEight = MediaPlayer.create(context as Activity, R.raw.eight)
            mediaNine = MediaPlayer.create(context as Activity, R.raw.nine)
        }

        view.eight.setOnClickListener {
            // set gif
            eight.setImageResource(R.drawable.eight_cc)

            // unset other gif
            zero.setImageResource(R.drawable.zero_nc)
            one.setImageResource(R.drawable.one_nc)
            two.setImageResource(R.drawable.two_nc)
            three.setImageResource(R.drawable.three_nc)
            four.setImageResource(R.drawable.four_nc)
            five.setImageResource(R.drawable.five_nc)
            six.setImageResource(R.drawable.six_nc)
            seven.setImageResource(R.drawable.seven_nc)
            nine.setImageResource(R.drawable.nine_nc)

            // play
            mediaEight.start()

            // pause
            mediaZero.stop()
            mediaOne.stop()
            mediaTwo.stop()
            mediaThree.stop()
            mediaFour.stop()
            mediaFive.stop()
            mediaSix.stop()
            mediaSeven.stop()
            mediaNine.stop()

            // reset
            mediaZero = MediaPlayer.create(context as Activity, R.raw.zero)
            mediaOne = MediaPlayer.create(context as Activity, R.raw.one)
            mediaTwo = MediaPlayer.create(context as Activity, R.raw.two)
            mediaThree = MediaPlayer.create(context as Activity, R.raw.three)
            mediaFour = MediaPlayer.create(context as Activity, R.raw.four)
            mediaFive = MediaPlayer.create(context as Activity, R.raw.five)
            mediaSix = MediaPlayer.create(context as Activity, R.raw.six)
            mediaSeven = MediaPlayer.create(context as Activity, R.raw.seven)
            mediaNine = MediaPlayer.create(context as Activity, R.raw.nine)
        }

        view.nine.setOnClickListener {
            // set gif
            nine.setImageResource(R.drawable.nine_cc)

            // unset other gif
            zero.setImageResource(R.drawable.zero_nc)
            one.setImageResource(R.drawable.one_nc)
            two.setImageResource(R.drawable.two_nc)
            three.setImageResource(R.drawable.three_nc)
            four.setImageResource(R.drawable.four_nc)
            five.setImageResource(R.drawable.five_nc)
            six.setImageResource(R.drawable.six_nc)
            seven.setImageResource(R.drawable.seven_nc)
            eight.setImageResource(R.drawable.eight_nc)

            // play
            mediaNine.start()

            // pause
            mediaZero.stop()
            mediaOne.stop()
            mediaTwo.stop()
            mediaThree.stop()
            mediaFour.stop()
            mediaFive.stop()
            mediaSix.stop()
            mediaSeven.stop()
            mediaEight.stop()

            // reset
            mediaZero = MediaPlayer.create(context as Activity, R.raw.zero)
            mediaOne = MediaPlayer.create(context as Activity, R.raw.one)
            mediaTwo = MediaPlayer.create(context as Activity, R.raw.two)
            mediaThree = MediaPlayer.create(context as Activity, R.raw.three)
            mediaFour = MediaPlayer.create(context as Activity, R.raw.four)
            mediaFive = MediaPlayer.create(context as Activity, R.raw.five)
            mediaSix = MediaPlayer.create(context as Activity, R.raw.six)
            mediaSeven = MediaPlayer.create(context as Activity, R.raw.seven)
            mediaEight = MediaPlayer.create(context as Activity, R.raw.eight)
        }

        return view
    }
}