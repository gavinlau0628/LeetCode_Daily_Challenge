/*

The idea is to traverse each integer sequence from left to right incrementing by one (left, left + 1, left + 2,..., left + n, right). Each time check if the the current number i is self-divided.
Self-division check is done by using '%' operator(we check each digit of i moving from right to left)
E.g. if i = 128 number:

128 % 10 = 8, check 8 != 0;
remove 8 from next step j = 128 / 10 = 12
repeat 1 and 2 until j == 0
Time complexity is O(nm), where n = right - left, and m is number of digits in iterated number

*/

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int j = i;
            for (; j > 0; j /= 10) {
                if ((j % 10 == 0) || (i % (j % 10) != 0)) break;
            }
            if (j == 0) list.add(i); 
        }
        return list;
    }
}
