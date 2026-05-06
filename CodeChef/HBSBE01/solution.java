static int findMaxContentChildren(List<Long> children, List<Long> cookies) {
    Collections.sort(children);
    Collections.sort(cookies);

    int i = 0, j = 0;
    int count = 0;

    while (i < children.size() && j < cookies.size()) {
        if (cookies.get(j) >= children.get(i)) {
            count++;
            i++;
            j++;
        } else {
            j++;
        }
    }

    return count;
}