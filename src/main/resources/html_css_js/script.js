function myAlert() {
    window.alert("This is a popup");
}

function validateForm(id) {
    var userInputElement = document.getElementById(id);
    var userInput = userInputElement.value;
    userInputElement.style = "background-color:white;";
    document.getElementById('errorText').innerText = "";
    console.log(userInput);
    console.log(userInputElement);
    console.log(userInput.length);
    if (userInput.length < 8 || userInput.length > 30) {
        document.getElementById('errorText').innerText="Text must be between 8 and 30";
        userInputElement.style = "background-color:red;";
    }
}

function validatePassword(id){

    var passwordElement = document.getElementById(id);
    var passwordInput = passwordElement.value;
    passwordElement.style = "background-color:white;";
    document.getElementById('errorText').innerText = "";
    console.log(passwordInput);
    console.log(passwordElement);
    console.log(passwordInput.length);
    if(passwordInput.length < 10 || passwordInput > 20){
        document.getElementById('errorText').innerText = "Password must be between 10 and 20";
        passwordElement.style = "background-color:red;";
        }
}
function validateEmail(id){

    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    var emailInputElement = document.getElementById(id);
    var emailInput = emailInputElement.value;
    emailInputElement.style = "background-color:white;";
    document.getElementById('errorText').innerText = "";
    console.log(emailInput);
    console.log(emailInputElement);
    console.log(emailInput.length);
    if(!emailInput.match(mailformat) ){
        document.getElementById('errorText').innerText = "You have entered an invalid email address!";
        emailInputElement.style = "background-color:red;";
        }
}
function confirmPassword(){

     var pw1 = document.getElementById("passwordInput");
     var pw1Value = pw1.value;
     var pw2 = document.getElementById("passwordConfirmInput");
     var pw2Value = pw1.value;
     if(pw1Value != pw2Value)
       {
         document.getElementById('errorText').innerText="Passwords did not match";
       } else {
         document.getElementById('errorText').innerText="Password created successfully";
       }
}

function validateFormAll(){


}
