var inpdic = []
var inpcl = []
var remove = document.getElementById("remove")
var removeh = document.getElementById("removeh")

var inicio = []
var fim = []
var dia = []
var hlb = []

var i = 0;
var j = 0;

function addFoto() {
    var fotosDiv = document.getElementById("fotos");
    var numFotos = fotosDiv.getElementsByTagName("input").length - 1; // desconta o botão de adicionar

    if (numFotos < numFotos + 1) {
        var label = document.createElement("label");
        label.setAttribute("for", "diciplina" + (numFotos + 1));
        label.textContent = "curso " + (numFotos + 2) + ":";

        var input = document.createElement("input");
        input.setAttribute("type", "text");
        input.setAttribute("id", "diciplina" + (numFotos + 1));
        input.setAttribute("name", "diciplina" + (numFotos + 1));

        inpdic.push(input)
        inpcl.push(label)
        i++;

        fotosDiv.appendChild(label);
        fotosDiv.appendChild(input);


        nf.innerHTML = (numFotos + 2) + "/4";
    }
}

function addhora() {
    var fotosDiv = document.getElementById("hora");
    var numFotos = fotosDiv.getElementsByTagName("input").length - 1; // desconta o botão de adicionar

    if (numFotos < numFotos + 1) {
        var label = document.createElement("label");
        label.setAttribute("for", "foto" + (numFotos + 1));
        label.textContent = "horario " + (j + 1) + ":";

        var diai = document.createElement("input");
        diai.setAttribute("type", "text");
        diai.setAttribute("id", "dia" + (numFotos + 1));
        diai.setAttribute("placeholder", "dia");
        diai.setAttribute("name", "dia" + (numFotos + 1));

        var input = document.createElement("input");
        input.setAttribute("type", "text");
        input.setAttribute("id", "horario" + (numFotos + 1));
        input.setAttribute("placeholder", "inicio");
        input.setAttribute("name", "horario" + (numFotos + 1));

        var input1 = document.createElement("input");
        input1.setAttribute("type", "text");
        input1.setAttribute("id", "horarioMin" + (numFotos + 1));
        input1.setAttribute("placeholder", "termino");
        input1.setAttribute("name", "horarioMIn" + (numFotos + 1));

        inicio.push(input);
        fim.push(input1);
        hlb.push(label);
        dia.push(diai);
        j++;

        fotosDiv.appendChild(label);
        fotosDiv.appendChild(input);
        fotosDiv.appendChild(input1);
        fotosDiv.appendChild(diai);



    }


}

remove.addEventListener("click", () => {
    var fotosDiv = document.getElementById("fotos");
    fotosDiv.removeChild(inpdic[i - 1])
    fotosDiv.removeChild(inpcl[i - 1])
    inpdic.pop()
    inpcl.pop()
    i--;
    if(inpdic.length == 0){
        i = 0;
    }
})

removeh.addEventListener("click", () => {
    var fotosDiv = document.getElementById("hora");
    fotosDiv.removeChild(inicio[j - 1])
    fotosDiv.removeChild(fim[j - 1])
    fotosDiv.removeChild(dia[j - 1])
    fotosDiv.removeChild(hlb[j - 1])

    inicio.pop()
    fim.pop()
    dia.pop()
    hlb.pop()

    j--;
    if(inicio.length == 0){
        j = 0;
    }

    console.log(inicio)
})


