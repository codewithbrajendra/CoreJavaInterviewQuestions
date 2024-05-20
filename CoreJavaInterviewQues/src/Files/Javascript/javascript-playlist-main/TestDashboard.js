const DATA = [
    {
        "DasboardName": "Default Workspace",
        "DashboardId": "D1",
        "isActive": "Y"
    },
    {
        "DasboardName": "Test Dashboard",
        "DashboardId": "D2",
        "isActive": "N"
    },
]
alert("Hiiiiiiiii");
const id = this.widgetInputData.uniqueHTMLElementId + "-responsiveTable";

function connect() {
    this.paint();
}

function paint() {
    // $("#idOfBody").sortable({
    //     cursor: 'row-resize',
    //     placeholder: 'ui-state-highlight',
    //     opacity: '0.55',
    //     items: '.ui-sortable-handle'
    // }).disableSelection();
    console.log("Paint Fucntion")
    renderData();
}

function renderData() {
    console.log("Render Data#####")
    var tbody = document.createElement('tbody');
    $("#" + id).append(tbody);
    if (DATA.length != 0) {
        DATA.forEach((item, index) => {
            
            const tr = document.createElement('tr');

            const radio = document.createElement("INPUT");
            radio.setAttribute("type","radio");
            radio.classList.add("radio");

            const toggleButton = document.createElement("button");
            toggleButton.setAttribute("type","checkbox");
            toggleButton.classList.add("toggle-button");

            

            const td1 = document.createElement('td');
            const td2 = document.createElement('td');
            const td3 = document.createElement('td');


            const name = document.createTextNode(item.DasboardName);

            td1.appendChild(radio);

            td2.appendChild(name);

            td3.appendChild(toggleButton);

            toggleButton.addEventListener("click",function(){
                toggleButton.classList.toggle("active");
            })
            

            tr.appendChild(td1);
            tr.appendChild(td2);
            tr.appendChild(td3);

            tbody.appendChild(tr);
        })
    }
}