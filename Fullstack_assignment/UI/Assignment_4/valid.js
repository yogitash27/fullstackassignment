 function verifyPassword()
  {  
    var pw = document.getElementById("pass").value;  
    var paswd=  /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{5,8}$/;    
    if(pw == "") 
    {  
       document.getElementById("message").innerHTML = "Fill the password please!";  
       return false;  
    }  
    else if(pw.length < 5) 
    {  
       document.getElementById("message").innerHTML = "Password length must be atleast 5 characters";  
       return false;  
    }  
    
    else if(pw.length > 8) 
    {  
       document.getElementById("message").innerHTML = "Password length must not exceed 8 characters";  
       return false;  
    }
    else if(pw.match(paswd)) 
    {  
        return true;
    }
    else
    { 
        document.getElementById("message").innerHTML = "Please Use Atleast 1 digit, 1 alphabet, 1 special symbol"; 
        return false;
    }
  } 
  
  function ValidateForm(form) {
    ErrorText = "";
    if ((form.gender[0].checked == false) && (form.gender[1].checked == false)) {
        alert("Please choose Gender");
        return false;
    }
    if (ErrorText = "") { form.submit(); }
}

function ageValidation() 
{
     var x = document.getElementById("age").value;
     if (x < 20 || x > 100)
     {
        document.getElementById("e1").innerHTML = "Enter Age Greater than 21";
     }
}

function phonenumber()
{
    var mob = document.getElementById("phn").value;  
    var phoneno = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;
    if(mob.match(phoneno))
    {
        return true;
    }
    else
    {
        document.getElementById("e2").innerHTML = "Invalid Mobile Number ";
        return false;
    }
}

