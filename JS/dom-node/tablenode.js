
var users = [
    {
        id:1,
        name: 'John Doe',
        age: 25,
        status: 'active'
    },
    {
        id:2,
        name: 'Ram',
        age: 30,
        status: 'inactive'
    },
    {
        id:3,
        name: 'Shyam',
        age: 35,
        status: 'active'
    }
]


const addUserToTable = () => {
    const tableBody = document.getElementById('table-body');
    for(let i=0;i<users.length;i++){
        const tr = document.createElement('tr')
        const idTd = document.createElement('td')//<td></td>
        idTd.innerHTML = users[i].id
        const nameTd = document.createElement('td')//<td></td>
        nameTd.innerHTML = users[i].name
        const ageTD = document.createElement('td')
        ageTD.innerHTML = users[i].age
        const statusTD = document.createElement('td')
        statusTD.innerHTML = users[i].status

        const actionTD = document.createElement('td')//<td></td>

        const infoButton = document.createElement('button')//<button></button>
        infoButton.innerHTML = 'Info'
        infoButton.className = 'btn btn-info'

        infoButton.addEventListener('click',()=>{
            alert("button clicked " + users[i].id)
        })


        actionTD.appendChild(infoButton) //<td><button>Info</button></td>


        tr.appendChild(idTd)
        tr.appendChild(nameTd)
        tr.appendChild(ageTD)
        tr.appendChild(statusTD)
        tr.appendChild(actionTD)
        
        tableBody.appendChild(tr)
    }
    
}


document.addEventListener('DOMContentLoaded', function() {

    console.log("DOM fully loaded and parsed");
    
    addUserToTable()
   
})