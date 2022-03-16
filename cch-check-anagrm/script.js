
const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.question("Enter the two words by using a comma. ex-silent,listen: ", function (val) {
    console.log(`Oh, so your name is ${val}`);

    const arrWord1 = Array.from(val.split(",")[0]);
    const arrWord2 = Array.from(val.split(",")[1]);

    const a = arrWord1.sort();
    const b = arrWord2.sort();

    console.log(a);
    console.log(b);

    let count = 0;

    if( a.length == b.length){
        for(let i=0; i<a.length; i++){
            for(let j=0; j<b.length; j++){
                if(a[i] == b[j]){
                    count ++;
                }
            }
        }

        if(count == a.length){
            console.log("these are anagram words ");
        }

    }else{
        console.log(" these words are not anagram words");
    }

});




