class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for (int i = 0; i < strs.size(); i++) {
            String temp = strs.get(i);
            result += temp.length() + "#" + temp;
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));

            int start = j + 1;
            int end = start + length;

            result.add(str.substring(start, end));

            i = end;
        }

        return result;


    }
}
