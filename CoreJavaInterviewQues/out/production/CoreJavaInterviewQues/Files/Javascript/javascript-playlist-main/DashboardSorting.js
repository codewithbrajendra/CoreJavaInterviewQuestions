var DahboardList = [
    {
        "DashboardName": "FinalDashboard5",
        "IsActive": "N",
        "LocationCode": "FC000009",
        "DashboardId": "228495634"
    },
    {
        "DashboardName": "New Dashboard",
        "IsActive": "N",
        "LocationCode": "FC000009",
        "DashboardId": "228495360"
    },
    {
        "DashboardName": "FinalDashboard3",
        "IsActive": "N",
        "LocationCode": "FC000009",
        "DashboardId": "228495632"
    },
    {
        "DashboardName": "Dashboard test",
        "IsActive": "Y",
        "LocationCode": "FC000009",
        "DashboardId": "228495558"
    },
    {
        "DashboardName": "FinalDashboard1",
        "IsActive": "N",
        "LocationCode": "FC000009",
        "DashboardId": "228495630"
    },
    {
        "DashboardName": "FinalDashboard2",
        "IsActive": "N",
        "LocationCode": "FC000009",
        "DashboardId": "228495631"
    },
    {
        "DashboardName": "TestDW",
        "IsActive": "N",
        "LocationCode": "FC000009",
        "DashboardId": "228495604"
    },
    {
        "DashboardName": "DashboardTest1",
        "IsActive": "N",
        "LocationCode": "FC000009",
        "DashboardId": "228495627"
    },
    {
        "DashboardName": "Default Workspace",
        "IsActive": "N",
        "UserId": "0e4ea9c1-1d40-4632-8601-1cbcc86fd1fd",
        "LocationCode": "FC000009",
        "DashboardId": "228495309"
    }
]

window.onload = function() {
    console.log("This is the first function.");
    console.log("Beofore Sorting ::: ",DahboardList);
    //DahboardList.sort(dynamicSort("DashboardId"));
     DahboardList.sort(
        (d1, d2) => (d1.DashboardId > d2.DashboardId) ? 1 : (d1.DashboardId < d2.DashboardId) ? -1 : 0);
    console.log("After Sorting111 ::: ",DahboardList);
    //alert("Hi");
};

function dynamicSort(property) {
    var sortOrder = 1;
    if(property[0] === "-") {
        sortOrder = -1;
        property = property.substr(1);
    }
    return function (a,b) {
        /* next line works with strings and numbers, 
         * and you may want to customize it to your needs
         */
        var result = (a[property] < b[property]) ? -1 : (a[property] > b[property]) ? 1 : 0;
        return result * sortOrder;
    }
}