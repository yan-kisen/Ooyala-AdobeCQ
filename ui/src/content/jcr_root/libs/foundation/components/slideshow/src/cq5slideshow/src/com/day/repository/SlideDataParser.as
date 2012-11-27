package com.day.repository
{
	import com.day.cq.Slide;
	
	import mx.controls.Alert;

	
	public class SlideDataParser
	{
		public static function parseRepositoryData(data : Object, pathPrefix : String, webAppContextPath : String) : Slide {
			var s : Slide = new Slide();
			for (var a : String in data) {					
				if(a == "link") {
					s.link = data[a]; 
				} else if(a == "jcr:title") {
					s.caption = data[a];
				} else if(a == "fileReference"){
					s.imageUrl = webAppContextPath + data[a];
				}
			}
			return s;
		}
	}
}