window.onload = function() {
    console.log("This is the first function.");
    renderData();
    //alert("Hi");
};

const id = "DashboardTable";

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

const PERMISSION_LISTS = [
   {
        "PermissionName": "WC Policies",
        "PermissionId": "Permission_WC",
        "IsActive": "Y",
        "IsAllowed": "Y"
    },    
    {
        "PermissionName": "Quotes",
        "PermissionId": "Permission_Quote",
        "IsActive": "Y",
        "IsAllowed": "Y"
    },
    {
        "PermissionName": "GL Policies",
        "PermissionId": "Permission_GL",
        "IsActive": "N",
        "IsAllowed": "N"
    },
    {
        "PermissionName": "XS Policies",
        "PermissionId": "Permission_XS",
        "IsActive": "N",
        "IsAllowed": "N"
    },
    {
        "PermissionName": "Payment Past Due",
        "PermissionId": "Permission_PPD",
        "IsActive": "N",
        "IsAllowed": "N"
    },
    {
        "PermissionName": "Renewals Not Yet Paid",
        "PermissionId": "Permission_RNYP",
        "IsActive": "N",
        "IsAllowed": "N"
    },
    {
        "PermissionName": "Cancelled Policies",
        "PermissionId": "Permission_CP",
        "IsActive": "N",
        "IsAllowed": "N"
    },
    {
        "PermissionName": "Book of Business",
        "PermissionId": "Permission_BOB",
        "IsActive": "N",
        "IsAllowed": "N"
    },
    {
        "PermissionName": "Renewals Upcoming",
        "PermissionId": "Permission_RU",
        "IsActive": "N",
        "IsAllowed": "N"
    },
    {
        "PermissionName": "Endorsements",
        "PermissionId": "Permission_Endorse",
        "IsActive": "N",
        "IsAllowed": "N"
    },
    {
        "PermissionName": "Pending Cancellations",
        "PermissionId": "Permission_PC",
        "IsActive": "Y",
        "IsAllowed": "Y"
    },
    {
        "PermissionName": "Commision Statement",
        "PermissionId": "Permission_CS",
        "IsActive": "Y",
        "IsAllowed": "Y"
    }
]
// var staticData
// var tableType
// const id = this.widgetInputData.uniqueHTMLElementId + "-responsiveTable";
// const idOfBody = this.widgetInputData.uniqueHTMLElementId + "-tablebody"
/**
 * This function will be called after platform loads this element.
 * Write initialization logic here
 */
function connect() {
    // tableType = this.widgetInputData.widgetProperties.TABLE_TYPE
    this.paint();
}

/**
 * This function will be called when connect() is executed
 */
function paint() {
    // $("#idOfBody").sortable({
    //     cursor: 'row-resize',
    //     placeholder: 'ui-state-highlight',
    //     opacity: '0.55',
    //     items: '.ui-sortable-handle'
    // }).disableSelection();
    // if(tableType == "DASHBOARD_LIST"){
    //     staticData = DATA
    // }
    // else{
    //     staticData = PERMISSION_LISTS
    // }
    console.log("Paint Fucntion")
    renderData();
}

/**
 * This function is called when any property is updated after client logic execution for this component.
 * 
 * e.g. changedData = [{ type: 'PROPERTY', name: 'UPDATABLE', value: 'N' }]
 * type: Identifies what has changed
 * name: Name of property which has changed (if type is 'PROPERTY')
 * value: Final value after change
 * 
 * @param {IChangedData} changedData: Object received by this function. It includes information regarding change which triggered this function call.
 * 
 */

function renderData() {
    console.log("Render Data#####")
    let staticData = DATA;
    let tableType = "DASHBOARD_LIST";
    var table = document.getElementById(id);
    var tbody = document.createElement('tbody');
    table.appendChild(tbody);
    //     let spromise = widgetInputData.httpAPIService.post({
    //     url: "/rest/api/fetchdashboarddata",
    //     headers:{'NoClientIdentifier':'true'},
    //     body: {}
    // });
    // spromise.then(function(response){
    //     var dataArray = response;
    //      dataArray.forEach((item, index) => {
            
    //         const tr = document.createElement('tr');

    //         const radio = document.createElement("INPUT");
    //         radio.setAttribute("type","radio");
    //         radio.classList.add("radio");

    //         const toggleButton = document.createElement("input");
    //         toggleButton.setAttribute("type","checkbox");

    //         const toggleSpan = document.createElement("span");
    //         toggleSpan.classList.add("slider");
    //         toggleSpan.classList.add("round");

    //         const toggleLabel = document.createElement("label");
    //         toggleLabel.classList.add("switch");

    //         const editButton = document.createElement("button");
    //         editButton.classList.add("btn-edit");
            
    //         const editIcon = document.createElement("i");
    //         editIcon.classList.add("fa","fa-edit");
    //         editButton.appendChild(editIcon);
        
    //         const deleteButton = document.createElement("button");
    //         deleteButton.classList.add("btn-delete");
            
    //         const deleteIcon = document.createElement("i");
    //         deleteIcon.classList.add("fa","fa-delete");
    //         deleteButton.appendChild(deleteIcon);

    //         const dottedLine = document.createElement("tr");
    //         dottedLine.classList.add("widgetborderbottom");

    //         const td1 = document.createElement('td');
    //         const td2 = document.createElement('td');
    //         const td3 = document.createElement('td');
    //         const td4 = document.createElement('td');
    //         const td5 = document.createElement('td');
    //         //const td4 = document.createElement('td');

    //         const name = document.createTextNode(item.DasboardName);
    //         name.classList.add("name");

    //         td1.appendChild(radio);

    //         td2.appendChild(name);

    //         td3.appendChild(toggleLabel);
    //         toggleLabel.appendChild(toggleButton);
    //         toggleLabel.appendChild(toggleSpan);

    //         td4.appendChild(editButton);
    //         td5.appendChild(deleteButton);
			
    //         console.log("toggle");
	// 		console.log(toggleButton);
    //        // td4.appendChild(dottedLine);

    //         toggleButton.addEventListener("click",function(){
    //             toggleButton.classList.toggle("active");
    //             alert("Clicked on toggle Button");
    //             console.log("Toggle button is active");
    //         })
            

    //         tr.appendChild(td1);
    //         tr.appendChild(td2);
    //         tr.appendChild(td3);
    //         tr.appendChild(td4);
    //         tr.appendChild(td5);
    //        // tr.appendChild(dottedLine);

    //         tbody.appendChild(tr);
    //         tbody.appendChild(dottedLine);
    //     })

    // })
    if (staticData.length != 0) {
        staticData.forEach((item, index) => {
            
            const tr = document.createElement('tr');

            if(tableType == "DASHBOARD_LIST"){
                const radio = document.createElement("INPUT");
                radio.setAttribute("type","radio");
                radio.classList.add("radio");
                radio.setAttribute("value","Default Value");
                const td1 = document.createElement('td');
                td1.appendChild(radio);
                tr.appendChild(td1);
                console.log("before checked : "+radio.checked)
                radio.addEventListener("click",function(){
                    console.log("checked : "+item)
                    // if(radio.checked == true) {
                    //     console.log("Inside if condition. "+radio.checked)
                    //     radio.checked = true;
                    // } else {
                    //     radio.checked = false;
                    //     console.log("Inside else condition. "+radio.checked)
                    // }
                })

            }

            if(tableType == "DASHBOARD_LIST"){}
            else{
                // const deleteButton = document.createElement("button");
                // deleteButton.classList.add("btn-delete");
            
                // const deleteIcon = document.createElement("i");
                // deleteIcon.classList.add("fas","fa-trash");
                // deleteButton.appendChild(deleteIcon);

                // const td5 = document.createElement('td');
                // td5.appendChild(deleteButton);
                // tr.appendChild(td5);

                const bars = document.createElement("button");
                bars.classList.add("btn","btn-bars");

                const barsIcon = document.createElement("i");
                barsIcon.classList.add("fa","fa-bars");
                bars.appendChild(barsIcon);

                const td7 = document.createElement('td');
                td7.appendChild(bars);
                tr.appendChild(td7);
            }
            if(tableType == "DASHBOARD_LIST"){
                const td2 = document.createElement('td');
                td2.classList.add("name");
                const name = document.createTextNode(item.DasboardName);
                td2.appendChild(name);
                tr.appendChild(td2);
            }
            else{
                const td2 = document.createElement('td');
                const name = document.createTextNode(item.PermissionName);
                td2.classList.add("name");
                td2.appendChild(name);
                tr.appendChild(td2);
            }
            
            if(tableType == "DASHBOARD_LIST"){}
            else{
                const toggleButton = document.createElement("input");
                toggleButton.setAttribute("type","checkbox");

                const toggleSpan = document.createElement("span");
                toggleSpan.classList.add("slider");
                toggleSpan.classList.add("round");

                const toggleLabel = document.createElement("label");
                toggleLabel.classList.add("switch");


                const td3 = document.createElement('td');
                td3.appendChild(toggleLabel);
                toggleLabel.appendChild(toggleButton);
                toggleLabel.appendChild(toggleSpan);

                tr.appendChild(td3);
            
            }
            if(tableType == "DASHBOARD_LIST"){
            
                const editButton = document.createElement("button");
                editButton.classList.add("btn","btn-edit");
                editButton.id = "editButtonId"+item.DashboardId;
                console.log("312 : ",item.DashboardId);
                const editIcon = document.createElement("i");
                editIcon.classList.add("fa","fa-edit");
                editButton.appendChild(editIcon);


                const td4 = document.createElement('td');
                td4.appendChild(editButton);
                tr.appendChild(td4);

                editButton.addEventListener("click",onClickEdit(editButton.id))
                
            }
            if(tableType == "DASHBOARD_LIST"){
                const deleteButton = document.createElement("button");
                deleteButton.classList.add("btn","btn-delete");
                deleteButton.id = "deleteButtonId"+item.DashboardId;
                const deleteIcon = document.createElement("i");
                deleteIcon.classList.add("fas","fa-trash");
                deleteButton.appendChild(deleteIcon);

                const td5 = document.createElement('td');
                td5.appendChild(deleteButton);
                tr.appendChild(td5);

                deleteButton.addEventListener("click",function(){
                    alert("Delete Id : "+deleteButton.id);
                })
            }

            const dottedLine = document.createElement("tr");
            if(tableType == "DASHBOARD_LIST"){
                dottedLine.classList.add("widgetborderbottom");
            }
            else if(tableType == "PERMISSION_LIST"){
                dottedLine.classList.add("widgetborderbottom");
            }
            else{
                dottedLine.classList.add("widgetborderbottom1");
            }

            tbody.appendChild(tr);
            tbody.appendChild(dottedLine);
        })
    }
}

function onClickEdit(id) {
    return function(){
        console.log("id : ",id);
        alert("Edit : "+id);
    }
}

// function onClickDelete(id) {
//     alert("Delete : ",id);
// }

function dgOnChange(changedData) {

}

/**
 * This function will be called when component is removed from DOM.
 */
function dgOnDestroy() {

}