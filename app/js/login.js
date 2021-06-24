function check(form)/*function to check userid & password*/
{
    /*the following code checkes whether the entered userid and password are matching*/
    if(form.nome.value == "test" && form.senha.value == "123")
    {
        window.open('Usuario/dashboard.html')/*opens the target page while Id & password matches*/
    }
    else
    {
        alert("Error Password or Username")/*displays error message*/
    }
}