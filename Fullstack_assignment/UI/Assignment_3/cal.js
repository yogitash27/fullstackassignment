function addition()
{
        var num1 = document.getElementById("firstNumber").value;
        var num2 = document.getElementById("secondNumber").value;
        document.getElementById("result").value = parseInt(num1) + parseInt(num2);
}

function subtraction() 
{ 
        var num1 = document.getElementById("firstNumber").value;
        var num2 = document.getElementById("secondNumber").value;
        document.getElementById("result").value = parseInt(num1) - parseInt(num2);
}