/**
 * @param {number} num
 * @return {number}
 */
var minimumSum = function(num) {
    var intArr = Array.from(String(num));
   intArr.sort();
    let a=intArr[0]+""+intArr[2];
    let b=intArr[1]+""+intArr[3];
    
    return Number(a)+Number(b);
};