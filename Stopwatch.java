
	class Stopwatch {
		
		private long startTime;
		private long endTime;
		
		Stopwatch(){
			
		startTime=System.currentTimeMillis();
		}
		
	long start() {
		
		return startTime=System.currentTimeMillis();
	}
	
	long stop() {
		return endTime=System.currentTimeMillis();

	}
	
	long getElapsedTime() {
		return(endTime-startTime);
	}
}
