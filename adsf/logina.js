function check(form)
{
    if(form.userid.value=="12" && form.userpassword.value=="12")
    {
        window.open('list.html')
    }
    else{
        alert("Error");
    }
}