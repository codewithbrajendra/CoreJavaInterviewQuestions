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

 window.onload = function() {
    console.log("This is the first function.");
    renderData();
    //alert("Hi");
};

const id = "DashboardTable";

 let staticData
 let tableType
 //const id = this.widgetInputData.uniqueHTMLElementId + "-responsiveTable";
 // const idOfBody = this.widgetInputData.uniqueHTMLElementId + "-tablebody"
 /**
  * This function will be called after platform loads this element.
  * Write initialization logic here
  */
 function connect() {
     tableType = this.widgetInputData.widgetProperties.TABLE_TYPE
     this.paint();
     $(function() {
     $(".main-table tbody").sortable();
     });
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
     if(tableType == "DASHBOARD_LIST"){
         staticData = DATA
     }
     else{
         staticData = PERMISSION_LISTS
     }
     console.log("Paint Function")
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
     let tableType = "PERMISSION_LISTS";
     var table = document.getElementById(id);
     var tbody = document.createElement('tbody');
     table.append(tbody);
     //      let spromise = widgetInputData.httpAPIService.post({
     //      url: "/rest/api/fetchdashboarddata",
     //      headers:{'NoClientIdentifier':'true'},
     //      body:{}
     //     //  body: apiBodyData,
     //     //  contentType: "application/json",
     //     //  dataType: "json"
     //  });
     //  spromise.then(function(response){
     //      console.log(response, "Response keys")
     //      var dataArray = response;
     //     console.log(dataArray,"Array")
     //       for(var [item,obj] of Object.entries(dataArray) )  {
     //           console.log(item,": ",obj,"ITEM")
     //           console.log(obj.DashboardName,"ans")
 
     // 			    const tr = document.createElement('tr');
 
     //         if(tableType == "DASHBOARD_LIST"){}
     //         else{
 
     //             const bars = document.createElement("button");
     //             bars.classList.add("btn","btn-bars");
 
     //             const barsIcon = document.createElement("i");
     //             barsIcon.classList.add("fa","fa-bars");
     //             bars.appendChild(barsIcon);
 
     //             const td7 = document.createElement('td');
     //             td7.appendChild(bars);
     //             tr.appendChild(td7);
     //         }
     //         if(tableType == "DASHBOARD_LIST"){}
     //         else{
     //             const td2 = document.createElement('td');
     //             const name = document.createTextNode(item.PermissionName);
     //             td2.classList.add("name");
     //             td2.appendChild(name);
     //             tr.appendChild(td2);
     //         }
             
     //         if(tableType == "DASHBOARD_LIST"){}
     //         else{
     //             const toggleButton = document.createElement("input");
     //             toggleButton.setAttribute("type","checkbox");
 
     //             const toggleSpan = document.createElement("span");
     //             toggleSpan.classList.add("slider");
     //             toggleSpan.classList.add("round");
 
     //             const toggleLabel = document.createElement("label");
     //             toggleLabel.classList.add("switch");
 
 
     //             const td3 = document.createElement('td');
     //             td3.appendChild(toggleLabel);
     //             toggleLabel.appendChild(toggleButton);
     //             toggleLabel.appendChild(toggleSpan);
 
     //             tr.appendChild(td3);
             
     //         }
             
 
     //         const dottedLine = document.createElement("tr");
     //         if(tableType == "PERMISSION_LIST"){
     //             dottedLine.classList.add("widgetborderbottom");
     //         }
     //         else{
     //             dottedLine.classList.add("widgetborderbottom1");
     //         }
     //         tbody.appendChild(dottedLine);   
     
     //         tbody.appendChild(tr);     
        
     //             }
     //  })
     if (staticData.length != 0) {
         staticData.forEach((item, index) => {
             
             const tr = document.createElement('tr');
 
             if(tableType == "DASHBOARD_LIST"){}
             else{
 
                 const bars = document.createElement("button");
                 bars.classList.add("btn","btn-bars");
 
                 const barsIcon = document.createElement("i");
                 barsIcon.classList.add("fa","fa-bars");
                 bars.appendChild(barsIcon);
 
                 const td7 = document.createElement('td');
                 td7.appendChild(bars);
                 tr.appendChild(td7);
             }
             if(tableType == "DASHBOARD_LIST"){}
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
             
 
             // const dottedLine = document.createElement("tr");
             // if(tableType == "PERMISSION_LIST"){
             //     dottedLine.classList.add("widgetborderbottom");
             // }
             // else{
             //     dottedLine.classList.add("widgetborderbottom1");
             // }
 
             // tbody.appendChild(dottedLine);
 
 
             tbody.appendChild(tr);
         })
     }
 }
 function dgOnChange(changedData) {
 
 }
 
 /**
  * This function will be called when component is removed from DOM.
  */
 function dgOnDestroy() {
 
 }
 
 function onClickEdit(id) {
     return function(){
         console.log("id : ",id);
         alert("Edit : "+id);
     }
 }