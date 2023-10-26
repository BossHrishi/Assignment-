
function reverseString(str) {
	const arr = str.split("");
	const stringReversed = arr.reduce((reversed, character) => {
	  return character + reversed;
	}, "");
	return stringReversed;
  }
  
  console.log(reverseString("This is a sunny day"));