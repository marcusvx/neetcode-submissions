class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        if (!strs?.length) {
            return "";
        }

        let result = `${strs.length}‹`;
        return result + strs.join("–");
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
        if (!str) return [];
        
        const [length, encoded] = str.split("‹");
        if (length === 0) {
            return [];
        }

        return encoded.split("–");
    }
}
