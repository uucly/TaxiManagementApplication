'use strict';

fleetApp.controller('mapController',['$scope','$http', function($scope, $http) {
	$http.get('/car/0').success(function(data){
		$scope.title = data
	}).error(function(data, status, headers, config){
		$scope.title = data + "/" + status + "/" + headers
		console.log('error')
	})
	//console.log('Hey Ho');
}])


function hello(){
	return "hello"
}