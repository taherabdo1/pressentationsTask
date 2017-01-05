function MyController($scope, $http) {

	$scope.currentPage = 1;
	$scope.pageSize = 10;
	$scope.meals = [];

	$http({
		method : 'GET',
		url : 'http://prezitask.herokuapp.com/presentations',
	}).success(function(response) {
		$scope.presentations = response;
		console.log(response);
	});

	//for ordering
	$scope.getDate = function (item) {
		return new Date(item.createdAt);
	}
	
	$scope.pageChangeHandler = function(num) {
		console.log('presentations page changed to ' + num);
	};
}


function OtherController($scope) {
	$scope.pageChangeHandler = function(num) {
		console.log('going to page ' + num);
	};
}
myApp = angular.module('myApp', [ 'angularUtils.directives.dirPagination' ]);
myApp.controller('MyController', MyController);
myApp.controller('OtherController', OtherController);