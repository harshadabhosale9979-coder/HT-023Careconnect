// Assume we have user's health issue from form submission
let userHealthIssue = "bp"; // example: get this dynamically from form

function generateMonthlyRoutine(issue) {
    let routine = [];

    if(issue === "bp") {
        routine = [
            "Week 1: Monitor BP daily, Reduce salt",
            "Week 2: Daily 30 min walk, Stress management",
            "Week 3: Maintain diet plan, Track BP",
            "Week 4: Review progress and adjust"
        ];
    } else if(issue === "diabetes") {
        routine = [
            "Week 1: Monitor sugar daily, Avoid sugar",
            "Week 2: Daily exercise, Balanced meals",
            "Week 3: Track activity and sugar",
            "Week 4: Review progress and adjust"
        ];
    } else if(issue === "obesity") {
        routine = [
            "Week 1: Track meals and calories",
            "Week 2: Cardio exercise 20-30 min",
            "Week 3: Track water intake and activity",
            "Week 4: Review weight and progress"
        ];
    } else if(issue === "stress") {
        routine = [
            "Week 1: Meditation 10 min daily",
            "Week 2: Reduce screen time, Short walks",
            "Week 3: Journaling, Deep breathing",
            "Week 4: Review progress and sleep pattern"
        ];
    } else {
        routine = [
            "Week 1-4: Maintain healthy diet, exercise, hydration, sleep"
        ];
    }

    // Display
    let html = "<h3>Monthly Routine</h3><ul>";
    routine.forEach(item => {
        html += <li>${item}</li>;
    });
    html += "</ul>";

    document.getElementById("monthlyRoutine").innerHTML = html;
}

// Call this function when form is submitted or page loaded after form
generateMonthlyRoutine(userHealthIssue);