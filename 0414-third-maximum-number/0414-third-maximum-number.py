class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        s=set(nums)
        s1=sorted(s,reverse=True)
        if len(s1)>=3:
            return s1[2]
        else:
            return s1[0]

        

        
        