class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        if (!strs?.length) {
            return "";
        }

        let result = "";
        for (const str of strs) {
            result += `${str.length}#${str}`;
        }
        return result;
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
        console.log("encoded: ", str);
        if (!str) return [];

        const result = [];
        let read = 0;
        let digits = "";
        while (read < str.length) {
            const char = str[read];
            
            if (char === "#") {
                const length = Number(digits);
                console.log("digits: ", digits);
                digits = "";
                
                if (length === 0) {
                    result.push("");
                    read += 1;
                } else {
                    const start = read + 1;
                    const end = start + length;
                    const nextWord = str.substring(start, end);

                    result.push(nextWord);
                    read = end;
                }
            } else {
                digits += char;
                read++;
            }
        }

        return result;
    }
}
