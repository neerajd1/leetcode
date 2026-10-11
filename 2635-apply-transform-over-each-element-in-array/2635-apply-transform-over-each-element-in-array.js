/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    var arr1 = []; 
    arr.forEach((element , index) => { arr1.push(fn(element,index))}) ; 
    return arr1
};