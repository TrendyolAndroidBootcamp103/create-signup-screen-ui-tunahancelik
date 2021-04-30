package school.cactus.succulentshop.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import school.cactus.succulentshop.LoginActivity
import school.cactus.succulentshop.R
import school.cactus.succulentshop.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = getString(R.string.sign_up)

        binding.apply {
            logInButton.setOnClickListener { navigateLoginPage() }
        }
    }

    fun navigateLoginPage(){
        val intent=Intent(this,LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}