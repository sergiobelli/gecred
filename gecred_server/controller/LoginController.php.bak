<?php

require_once("ConfigManager.php");

class LoginController {
	
    function login ($username, $password) {		
		
		$ConfigManager = new ConfigManager();
		$dbhost = $ConfigManager->getHost ();
		$dbuser = $ConfigManager->getUser ();
		$dbname = $ConfigManager->getDatabase ();
		$dbpass = $ConfigManager->getPassword ();
		
		$conn = null;
		try {
			
			$conn = new PDO("mysql:host=$dbhost;dbname=$dbname", $dbuser, $dbpass);
				
			$cmd = "
				SELECT 	
					id as id,
					username as username,
					password as password,
					descrizione as descrizione
				FROM 	users 
				WHERE 	username = :username
						AND password = :password";
			
			$result = $conn->prepare($cmd);
			$result->bindValue(":username", $username);
			$result->bindValue(":password", $password);
			$result->execute();
			
			$return_arr = array();
			$row_array = array();	
			
			while ($row = $result->fetch(PDO::FETCH_ASSOC)) {
				$row_array['id'] = utf8_encode($row['id']);
				$row_array['username'] = utf8_encode($row['username']);
				$row_array['descrizione'] = utf8_encode($row['descrizione']);
				array_push($return_arr,$row_array);
			}
			
			$conn = NULL;
			
			return json_encode($return_arr);
			
		} catch(PDOException $e) {
			return json_encode($e->getMessage());
		}
		
    }
	
}
