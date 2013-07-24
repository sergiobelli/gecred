<?php
require_once('../lib/nusoap.php');

// Create the client instance
$client = new nusoap_client('http://localhost/services/gecred/server.php?wsdl', true); // false: no WSDL

// Call the SOAP method
$result = $client->call('login',array('username' => 'test', 'password' => 'test'));
print_r($result) ;

?>