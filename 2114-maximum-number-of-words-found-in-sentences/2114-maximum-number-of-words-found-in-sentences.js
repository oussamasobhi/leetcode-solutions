/**
 * @param {string[]} sentences
 * @return {number}
 */
var mostWordsFound = function(sentences) {
    let max=-1;
    for(let i=0;i<sentences.length;i++)
{
     
   
      if(sentences[i].split(" ").length>max)
          max=sentences[i].split(" ").length;
}
    return max;
};