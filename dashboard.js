window.onload = function(){
  setTimeout(function(){
    document.getElementById("Loader").style.display = "none";
  }, 1500);
}

window.addEventListener("load", function(){

    setTimeout(function(){

        document.getElementById("Loader").style.display = "none";

    }, 2000); // 2 segundos

});
const toggles = document.querySelectorAll(".toggle")

toggles.forEach(icon => {

icon.addEventListener("click", ()=>{

const empleado = icon.parentElement
const acciones = empleado.querySelector(".acciones-empleado")

if(acciones.style.display === "flex"){

acciones.style.display = "none"

}else{

acciones.style.display = "flex"

}

})

})