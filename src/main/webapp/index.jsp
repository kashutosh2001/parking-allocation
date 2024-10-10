<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome and Feedback</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        .container {
            width: 80%;
            margin: auto;
            overflow: hidden;
            padding: 20px;
        }
        header {
            background: #50b3a2;
            color: white;
            padding-top: 30px;
            min-height: 70px;
            border-bottom: #e8491d 3px solid;
            text-align: center;
        }
        header h1 {
            margin: 0;
            padding-bottom: 20px;
        }
        .feedback-form {
            background: #fff;
            padding: 20px;
            margin-top: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        .feedback-form h2 {
            color: #50b3a2;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
        }
        .form-group input[type="email"],
        .form-group textarea {
            width: 100%;
            padding: 8px;
            border: 1px solid #ddd;
            border-radius: 4px;
        }
        .form-group select {
            width: 100%;
            padding: 8px;
            border: 1px solid #ddd;
            border-radius: 4px;
        }
        .form-group textarea {
            height: 100px;
        }
        .form-group button {
            display: block;
            width: 100%;
            padding: 10px;
            background: #50b3a2;
            color: #fff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        .form-group button:hover {
            background: #429e8e;
        }
    </style>
</head>
<body>
    <header>
        <div class="container">
            <h1>Welcome Dosto!</h1>
        </div>
    </header>

    <div class="container">
        <section class="feedback-form">
            <h2>We'd Love Your Feedback</h2>
            <form id="feedbackForm" action="FeedbackControler" method="post">
            
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="email" id="email" name="email" required>
                </div>
                
                <div class="form-group">
                    <label for="message">Feedback Message:</label>
                    <textarea id="message" name="message" required></textarea>
                </div>
                
                <div class="form-group">
                    <label for="rating">Rating (out of 5):</label>
                    <select id="rating" name="rating" required>
                        <option value="">Select a rating</option>
                        <option value="1">1 - Poor</option>
                        <option value="2">2 - Fair</option>
                        <option value="3">3 - Good</option>
                        <option value="4">4 - Very Good</option>
                        <option value="5">5 - Excellent</option>
                    </select>
                </div>
                
                <div class="form-group">
                    <button type="submit">Submit Feedback</button>
                </div>
                
            </form>
            
        </section>
    </div>

</body>
</html>