<?php
require_once('lib/nusoap.php');
require_once("controller/ConfigManager.php");

$ConfigManager = new ConfigManager();
$elementNamespace = $ConfigManager->getElementNamespace();

$server = new nusoap_server; // Create server instance

$server->configureWSDL('gecredws',$elementNamespace);


$server->register( 'login',
	array("username"=>"xsd:string", "password"=>"xsd:string"), // inputs
	array("result"=>"xsd:string"), // outputs
	$elementNamespace // element namespace
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
