/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let result =[-1,-1];
    let diffHmap = {};
    for(let i in nums) {
        // console.log(nums[i] in diffHmap);
        if (nums[i] in diffHmap){
            result[0] = diffHmap[nums[i]];
            result[1] = i;
            return result;
        }else{
            diffHmap[target - nums[i]] = i;
        }
        // console.log(`index ${i} difference map ${diffHmap} result ${result} `);
    }
    return result;
};