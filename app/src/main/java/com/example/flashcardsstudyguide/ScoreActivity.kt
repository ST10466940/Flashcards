class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val score = intent.getIntExtra("SCORE", 0)
        val totalQuestions = 5

        // Display score
        findViewById<TextView>(R.id.tvScore).text = "Score: $score/$totalQuestions"

        // Feedback based on score
        val feedback = if (score >= 3) "Great job!" else "Keep practising!"
        findViewById<TextView>(R.id.tvFeedback).text = feedback

        // Exit button
        findViewById<Button>(R.id.btnExit).setOnClickListener {
            finishAffinity() // Close app
        }

        // Review button (optional: implement ReviewActivity)
        findViewById<Button>(R.id.btnReview).setOnClickListener {
            Toast.makeText(this, "Review not implemented yet.", Toast.LENGTH_SHORT).show()
        }
    }
}