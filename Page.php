<?php
$servername="localhost";
$username="root";
$password="";
$db_name="cab";
$db = new mysqli($servername,$username,$password,$db_name);
if($db->connect_error){
die('connection failed:');
}
$insertion=mysqli_query($db,"insert into register
(name,contact,pickup,dropoff,payment,pickdate,picktime)values('$_POST[name1]','$_POST[contact1]','$_POST
[pickup1]','$_POST[dropoff1]','$_POST[payment1]','$_POST[pickdate1]','$_POST[picktime1]')");
if($insertion){
header('location:reg1.php?msg=insertion successfull..');
exit();
}
?>
Page1.php
<?php
$servername="localhost";
$username="root";
$password="";
$db_name="cab";
$db = new mysqli($servername,$username,$password,$db_name);
if($db->connect_error){
die('connection failed:');
}
$insertion=mysqli_query($db,"insert into contact (name,
mail,no,message)VALUES('$_POST[name1]','$_POST[mail1]','$_POST[no1]','$_POST[message1]')");
if($insertion){
header('location:reg.php?msg=insertion successfull..');
exit();
}
?>
