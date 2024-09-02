package fregoso.enrique.tiquiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fregoso.enrique.tiquiz.ui.theme.TiquizTheme

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val questionBank = ListOf(
        Question(R.string.question_cpu, false),
        Question(R.string.question_gpu, false),
        Question(R.string.question_ssh, true),
        Question(R.string.question_keyboard, true)
    )
    private var currentIndex = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.trueButton.setOnClickListener { view: View ->
            //Toast.makeText(this,R.string.correct_toast,Toast.LENGTH_SHORT)
            val snackBar = Snackbar.make(view, R.string.correct_toast, Snackbar.LENGTH_LONG)
            snackBar.setBackgroundTint(resources.getColor(R, color.verde))
            snackBar.show()
        }
        binding.FalseButton.SetOnClickListener { view: View ->
            Toast.makeText(this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show()
        }
        val questionIdRes = questionBank[currentIndex].textResId
        binding.questionTextView.setText(questionIdRes)

    }
}