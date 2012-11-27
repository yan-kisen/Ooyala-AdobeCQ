package com.day.cq
{
	import flash.events.Event;

	public class SlideReadyEvent extends Event
	{
		
		public function SlideReadyEvent(type:String, bubbles:Boolean=false, cancelable:Boolean=false)
		{
			super(type, bubbles, cancelable);
		}
		
	}
}