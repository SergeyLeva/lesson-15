package ua.sergeylevcenko.lesson15converter

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun convertParrotToMeter(parrot: Float): Float {
        return (parrot / 2.0).toFloat()
    }

    private fun convertMeterToParrot(meter: Float): Float {
        return (meter * 2.0).toFloat()
    }

    fun onClick(view: View?) {
        val meterRadioButton = findViewById<View>(R.id.radioButtonMeter) as RadioButton
        val inputEditText = findViewById<View>(R.id.editText) as EditText
        if (inputEditText.text.isEmpty()) {
            Toast.makeText(
                applicationContext, "Введите данные",
                Toast.LENGTH_LONG
            ).show()
            return
        }
        val inputValue = inputEditText.text.toString().toFloat()
        if (meterRadioButton.isChecked) {
            inputEditText.setText(convertParrotToMeter(inputValue).toString())
        } else {
            inputEditText.setText(convertMeterToParrot(inputValue).toString())
        }
    }
}