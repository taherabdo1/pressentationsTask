'use strict';

angular.module('myApp.view1', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
	  $routeProvider.when('/view1', {
	    templateUrl: 'view1/view1.html',
	    controller: 'View1Ctrl'
	  });
	}])
	
.controller('View1Ctrl', [function() {

}]);


//.controller('MyCtrl', function($scope) {
//    $scope.myData = [{name: "Moroni", age: 50},
//                     {name: "Tiancum", age: 43},
//                     {name: "Jacob", age: 27},
//                     {name: "Nephi", age: 29},
//                     {name: "Enos", age: 34}];
//    $scope.gridOptions_1 = { data: 'myData' };
//});