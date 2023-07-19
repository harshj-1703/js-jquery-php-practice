// two strings are anaagram or not
var text1 = "abcd";
var text2 = "dcab";

let flag = false;

// Check for the length

if (!(text1.length == text2.length)) {
    flag = true;
}

// check for the indevidual character

if (!flag) {
    for (let i = 0; i < text1.length; i++) {
        if (!text2.includes(text1[i])) {
            flag = true;
        } else {
            text2[text2.indexOf(text1[i])] = "0";
        }
    }
}

if (flag) {
    console.log(`This string is not anaagram`);
} else {
    console.log(`This string is anaagram`);
}
