let lines = gets().split("\n")
let numberOfMatches = parseInt(lines.shift)
let n = parseInt(lines)
let totalMatches = 0

while( n > 1){
	if( n % 2 === 0 ){
		totalMatches += n / 2
		n -= n/2
	}else{
		totalMatches += (n - 1)/ 2
		n -= (n-1)/2
	}
}
console.log(totalMatches)