
public class ExercisesLevelTwoIntermediate {

	// Method for BlackJack //
	public static int returnClosestTo21 (float firstNo, float secondNo) {
		float checkFirst,checkSecond;
		
		checkFirst = firstNo / 21;
		checkSecond = secondNo / 21;
		
		if (checkFirst > 1 && checkSecond > 1) {
			return 0;
		} else if (checkFirst > 1) {
			return (int) secondNo;
		} else if (checkSecond > 1) {
			return (int)firstNo;
		}
		
		if (checkFirst > checkSecond) {
			return (int)firstNo;
		} else {
			return (int)secondNo;
		}
		
	}
	
	// Method for Unique Sum //
	public static int uniqueSum (int firstNo,int secondNo,int thirdNo) {
		
		if(firstNo == secondNo || firstNo == thirdNo || secondNo == thirdNo) {
			// figure out which number is shared. As there are three numbers and they are not in an array, can brute force.
			if(firstNo == secondNo && firstNo != thirdNo) {
				return thirdNo;
			} else if (firstNo == thirdNo && firstNo != secondNo) {
				return secondNo;
			} else if (secondNo == thirdNo && secondNo != firstNo){
				return firstNo;
			} else {
				return 0;
			}
			
		}
		// all numbers are unique - can return sum.
		return (firstNo+secondNo+thirdNo);
	}
	
	// Method for Too Hot? //
	public static boolean tooHot(int temperature, boolean isSummer) {
		int upperLimit = 90;
		int lowerLimit = 60;
		if(isSummer) {
			upperLimit = 100;
		}
		
		if (temperature < upperLimit && temperature > lowerLimit) {
			return true;
		}
		
		return false;
	}
	
	
}
