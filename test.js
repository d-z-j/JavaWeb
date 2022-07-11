function f(e){
    if (e.value.length < 6){
        e.setAttribute("class","illegal-pwd")
    }else {
        e.removeAttribute("class")
    }
}

function http(){
    let xhr = new XMLHttpRequest();
    xhr.open('GET','https:www.bilibili.com/');
    xhr.send();
}