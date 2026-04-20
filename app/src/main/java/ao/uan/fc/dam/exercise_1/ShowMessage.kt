package ao.uan.fc.dam.exercise_1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ao.uan.fc.dam.exercise_1.databinding.ActivityShowMessageBinding

class ShowMessage : AppCompatActivity() {

    private lateinit var binding: ActivityShowMessageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityShowMessageBinding.inflate(layoutInflater)

        val mensagemRecebida = intent.getStringExtra("EXTRA_MESSAGE") ?: ""
        binding.textViewResultado.text = mensagemRecebida
        enableEdgeToEdge()



        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}