// function letterFinder(palabra, coincidencia){
//     for (let i = 0; i < palabra.length; i++) {

//         if (palabra[i] == coincidencia) {
//             console.log('Found the', coincidencia, 'at', i);
//         }else{
//             console.log('---No match found at', i)
//         }
        
//     }
// }

// letterFinder("test", "t");

//Coursera

function letterFinder(word, match) {
    for(var i = 0; i < word.length; i++) {
        if(word[i] == match) {
            //check if the current characater, word[i], is equal to the match
            console.log('Found the', match, 'at', i)
        } else {
            console.log('---No match found at', i)
        }
    }
}

letterFinder("test", "t")
