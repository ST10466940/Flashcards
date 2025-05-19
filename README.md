Flashcard Quiz App  
===================  

Purpose  
-------  
This Android app helps users test their knowledge of historical facts through a series of true/false questions. It includes:  
- A Welcome Screen with a start button.  
- A Question Screen displaying questions and tracking scores.  
- A Score Screen showing final results and feedback.  
The app aims to provide a simple, intuitive study tool for learners.  

Design Considerations  
---------------------  
**UI Design**  
- Simplicity: LinearLayouts and minimalistic design for ease of use.  
- Feedback: Immediate correctness indicators (e.g., "Correct!") after each answer.  
- Navigation: Clear button labels (Start, Next, Exit) guide users through the quiz flow.  

**Logic Design**  
- Arrays for Data: Parallel arrays store questions and answers.  
- Loop Logic: Iterates through questions sequentially.  
- Score Tracking: Dynamically updates based on user responses.  

GitHub & GitHub Actions Usage  
-----------------------------  
**Repository Management**  
- Version Control: Hosted on GitHub to track code changes and collaborate.  
- Branching: Main branch for stable releases; feature branches for experimental changes.  

**GitHub Actions**
- Automated Builds: A workflow file (.github/workflows/build.yml) triggers on every push to verify app compilation.  
- CI/CD: Ensures code quality and prepares the app for deployment.  

How to Run the App  
------------------  
1. Clone the repository from GitHub.  
2. Open the project in Android Studio.  
3. Connect a device/emulator and click "Run".  

Notes  
-----  
- For detailed code structure, refer to the Kotlin files and XML layouts.  
- To contribute, fork the repository and submit pull requests.  
