<README>
    <Application>
        <Title>Flashcard Quiz App</Title>
        <Purpose>
            This Android app is designed to help users test their knowledge of historical facts through a series of true/false questions. It includes three screens:
            - A **Welcome Screen** with a start button.
            - A **Question Screen** displaying questions and tracking scores.
            - A **Score Screen** showing final results and feedback.
            The app aims to provide a simple, intuitive study tool for learners.
        </Purpose>
    </Application>

    <DesignConsiderations>
        <UI>
            - **Simplicity**: LinearLayouts and minimalistic design ensure ease of use.  
            - **Feedback**: Immediate correctness indicators (e.g., "Correct!") after each answer.  
            - **Navigation**: Clear button labels (Start, Next, Exit) guide users through the quiz flow.  
        </UI>
        <Logic>
            - **Arrays for Data**: Parallel arrays store questions and answers.  
            - **Loop Logic**: Iterates through questions sequentially.  
            - **Score Tracking**: Dynamically updates based on user responses.  
        </Logic>
    </DesignConsiderations>

    <GitHubUsage>
        <Repository>
            - **Version Control**: The project is hosted on GitHub to track code changes and collaborate.  
            - **Branching**: Main branch for stable releases; feature branches for experimental changes.  
        </Repository>
        <GitHubActions>
            - **Automated Builds**: A workflow file (.github/workflows/build.yml) triggers on every push to verify the app compiles.  
            - **CI/CD**: Ensures code quality and prepares the app for deployment.  
        </GitHubActions>
    </GitHubUsage>

    <HowToRun>
        1. Clone the repository from GitHub.  
        2. Open the project in Android Studio.  
        3. Connect a device/emulator and click "Run".  
    </HowToRun>
</README>
