<?php
session_start();
if(isset($_SESSION['data']))
{
  echo "<h2>Your Input:</h2>";
  print_r($_SESSION['data']);
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" c ontent="width=device-width, initial-scale=1.0">
    <title>PHP Ex-1</title>
</head>
<body>
    <h2>PHP Form Validation Example</h2>
<form method="post" action="./ex1.php">  
  Name: <input type="text" name="name">
  <br><br>
  E-mail: <input type="text" name="email">
  <br><br>
  Website: <input type="text" name="website">
  <br><br>
  Comment: <textarea name="comment" rows="5" cols="40"></textarea>
  <br><br>
  Gender:
  <input type="radio" name="gender" value="female">Female
  <input type="radio" name="gender" value="male">Male
  <input type="radio" name="gender" value="other">Other
  <br><br>
  <input type="submit" name="submit" value="Submit">  
</form>
</body>
</html>