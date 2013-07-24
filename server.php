<?php
require_once('lib/nusoap.php');

$server = new nusoap_server; // Create server instance

$server->configureWSDL('autenticazionews','http://localhost/services/autenticazione/server');


$server->register( 'login',
	array("username"=>"xsd:string", "password"=>"xsd:string"), // inputs
	array("result"=>"xsd:string"), // outputs
	'http://localhost/services/autenticazione/server' // element namespace
);

function login($username, $password) {
	
	
	require_once("controller/LoginController.php");
	$LoginController = new LoginController();
	
	return $LoginController->login($username, $password);
	
}

// Use the request to (try to) invoke the service
$HTTP_RAW_POST_DATA = isset($HTTP_RAW_POST_DATA) ? $HTTP_RAW_POST_DATA : '';
$server->service($HTTP_RAW_POST_DATA);

?>
