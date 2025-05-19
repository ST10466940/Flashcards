class QuestionActivity : AppCompatActivity() {
    // Questions and answers arrays
    private val questions = arrayOf(
        "Nelson Mandela was the president in 1994.",
        "World War II ended in 1945.",
        "The Titanic sank in 1912.",
        "The Berlin Wall fell in 1989.",
        "Julius Caesar was the first Roman Emperor."
    )
    private val answers = arrayOf(true, true, true, true, false) // Last answer is false

    private var currentIndex = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        // Initialize first question
        updateQuestion()

        // True/False button click listeners
        findViewById<Button>(R.id.btnTrue).setOnClickListener { checkAnswer(true) }
        findViewById<Button>(R.id.btnFalse).setOnClickListener { checkAnswer(false) }

        // Next button click listener
        findViewById<Button>(R.id.btnNext).setOnClickListener {
            currentIndex++
            if (currentIndex < questions.size) {
                updateQuestion()
            } else {
                // Launch ScoreActivity with final score
                val intent = Intent(this, ScoreActivity::class.java).apply {
                    putExtra("SCORE", score)
                }
                startActivity(intent)
                finish()
            }
        }
    }

    private fun updateQuestion() {
        // Update question text and reset UI
        findViewById<TextView>(R.id.tvQuestion).text = questions[currentIndex]
        findViewById<TextView>(R.id.tvFeedback).text = ""
        findViewById<Button>(R.id.btnNext).isEnabled = false
    }

    private fun checkAnswer(userAnswer: Boolean) {
        val correctAnswer = answers[currentIndex]
        val feedback = if (userAnswer == correctAnswer) {
            score++
            "Correct!"
        } else {
            "Incorrect. Correct answer was ${if (correctAnswer) "True" else "False"}."
        }
        // Show feedback and enable Next button
        findViewById<TextView>(R.id.tvFeedback).text = feedback
        findViewById<Button>(R.id.btnNext).isEnabled = true
    }
}