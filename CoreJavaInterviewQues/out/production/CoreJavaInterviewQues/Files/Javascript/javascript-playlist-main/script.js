window.onload = function() {
    console.log("This is the first function.");
    renderData();
    alert("Hi");
};

const id = "DashboardTable";

function renderData() {
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
        }
    ];

    var table = document.getElementById(id);
    var tbody = document.createElement('tbody');
    table.appendChild(tbody);

    if (DATA.length !== 0) {
        DATA.forEach((item, index) => {
            const tr = document.createElement('tr');

            const radio = document.createElement("INPUT");
            radio.setAttribute("type", "radio");
            radio.classList.add("radio");

            const toggleButton = document.createElement("button");
            toggleButton.setAttribute("type", "checkbox");
            toggleButton.classList.add("toggle-button");

            const td1 = document.createElement('td');
            const td2 = document.createElement('td');
            const td3 = document.createElement('td');

            const name = document.createTextNode(item.DasboardName);

            td1.appendChild(radio);
            td2.appendChild(name);
            td3.appendChild(toggleButton);

            toggleButton.addEventListener("click", function() {
                toggleButton.classList.toggle("active");
            });

            tr.appendChild(td1);
            tr.appendChild(td2);
            tr.appendChild(td3);

            tbody.appendChild(tr);
        });
    }
}
