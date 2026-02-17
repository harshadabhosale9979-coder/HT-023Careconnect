# Form Submit → Dashboard
@app.route('/dashboard', methods=['POST'])
def dashboard():
    name = request.form['name']
    age = request.form['age']
    issue = request.form['issue']

    # Dummy IoT Data
    iot_data = {
        "heart_rate": 82,
        "steps": 6500,
        "water": 1.8,
        "sleep": 7,
        "screen_time": 3
    }

    return render_template("dashboard.html",
                           name=name,
                           age=age,
                           issue=issue,
                           data=iot_data)