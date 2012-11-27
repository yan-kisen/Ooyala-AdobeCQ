package com.day.repository
{
	import flash.external.ExternalInterface;
	
	public class Sling
	{
		public function Sling() : void {
			if(!ExternalInterface.available) {
				throw new Error("ExternalInterface is not available. Cannot interface the Sling object");
			}
		}
	
		public function getContent(path : String, maxLevel : int = 0, filter : Boolean = false) : Object {
			return ExternalInterface.call("Sling.getContent", path, maxLevel, filter);
		}
		
		public function removeContent(path : String) : Object {
			return ExternalInterface.call("Sling.removeContent", path);
		}
		
		public function getSessionInfo() : String {
			return ExternalInterface.call("Sling.getSessionInfo");
		}

	
	}
}