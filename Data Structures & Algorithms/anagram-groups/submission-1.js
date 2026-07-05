class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        const groups = new Map();
        for (let str of strs) {
            const sorted = str.split("").sort().join("");
            const existing = groups.has(sorted) ? groups.get(sorted) : [];
            groups.set(sorted, [...existing, str]);
        }

        return groups.values().reduce((acc, items) => {
            acc.push(items);
            return acc;
        }, []);
    }
}
