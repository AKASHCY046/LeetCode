class Solution {
    public List<String> letterCasePermutation(String s) {
        return perm(s);
    }

    public List<String> perm(String s) {
        List<String> al = new ArrayList<>();
        back(al, s, new StringBuilder(), 0);
        return al;
    }

    public void back(List<String> al, String str, StringBuilder st, int index) {
        if (index == str.length()) {
            al.add(st.toString());
            return;
        }


        char ch = str.charAt(index);
        if (!Character.isLetter(ch)) {
            st.append(ch);
            back(al, str, st, index + 1);
            st.deleteCharAt(st.length() - 1);
        } else {
            st.append(Character.toLowerCase(ch));
            back(al, str, st, index + 1);
            st.deleteCharAt(st.length() - 1);

            st.append(Character.toUpperCase(ch));
            back(al, str, st, index + 1);
            st.deleteCharAt(st.length() - 1);
        }

    }
}