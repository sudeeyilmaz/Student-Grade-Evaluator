# 🎓 Student Grade Evaluator

A robust Java-based command-line application designed to evaluate student performance using a **dual-input system**. The program determines the academic status based on either raw exam scores or predefined letter grades.

## 🚀 Features

* **Hybrid Input Handling:** Uses `try-catch` logic to intelligently detect whether the user input is a numerical score or a letter grade string.
* **Weighted Calculation:** Calculates the final grade based on standard academic weights:
    * Midterm (Vize): **40%**
    * Final Exam: **60%**
* **Input Validation:** Ensures exam scores are within valid ranges (-1 to 100) and handles invalid entries with feedback loops.
* **Status Classification:** Converts the calculated average into descriptive success statuses (e.g., "Pekiyi", "Orta", "Başarısız").
* **Switch-Case Logic:** Directly maps letter grades (AA, BA, BB, etc.) to their corresponding verbal evaluations.
* **Missing Exam Handling:** Recognizes `-1` as a "Did Not Attend" status and adjusts calculations accordingly.

## 🛠️ How It Works

1.  The user is prompted to enter a **score** OR a **letter grade**.
2.  **If a number is entered:**
    * The program treats it as the Midterm score.
    * Prompts for the Final score.
    * Calculates the weighted average: `(Midterm * 0.4) + (Final * 0.6)`.
    * Outputs the result status.
3.  **If a letter (String) is entered:**
    * The program catches the `NumberFormatException`.
    * Passes the input to a `switch-case` block.
    * Prints the evaluation corresponding to the letter grade (e.g., "AA" -> "Pekiyi").

## 💻 Usage

```bash
# Compile the program
javac gecti_kaldi.java

# Run the application
java gecti_kaldi
