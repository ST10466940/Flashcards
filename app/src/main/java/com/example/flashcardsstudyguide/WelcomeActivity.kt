class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Start button click listener
        findViewById<Button>(R.id.btnStart).setOnClickListener {
            // Launch QuestionActivity
            val intent = Intent(this, QuestionActivity::class.java)
            startActivity(intent)
        }
    }
}