'use strict';

var fleetApp = angular.module('fleet', ['ngRoute']);

fleetApp.config(function($routeProvider) {
	$routeProvider.when('/',{
		templateUrl: 'views/map.html',
		controller: 'mapController' 
	})
});
