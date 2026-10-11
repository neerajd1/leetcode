function twoSum(nums: number[], target: number): number[] {
    let result:number[] =  [-1 , -1];
    // let hmap:{[key:number]:number} = {};
    let hmap:Record <number , number> = {}; 
    for (let i in nums){
        if(nums[i] in hmap){
            result[0] = hmap[nums[i]];
            result[1] = parseInt(i) ;
            return result;
        }else{
            hmap[target - nums[i]] = parseInt(i);
        }
    }
    return result;
};