/**
 * Created by shiraz on 4/4/2020.
 */

function findSubArray(userArray, userNumber) {
    userArray = userArray.sort(function (a, b) {
        return b - a;
    });

    var subArrayList = [];
    subArray(0, 0, []);
    return subArrayList || 'No Sub array found!';

    function subArray(start, total, l) {
        var result = [];
        for (var x = start; x < userArray.length; x++) {
            var number = userArray[x];
            if (total + number <= userNumber) {
                subArray(x + 1, total, l.concat(result));
                total += number;
                result.push(number);
            }
        }
        if (total === userNumber) subArrayList.push(l.concat(result));
    }
}

console.log(findSubArray([4, 3, 2, 16, 7, 5], 9));
