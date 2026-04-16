
    Stack<Long> in = new Stack<>();
    Stack<Long> out = new Stack<>();

    public void pushElement(long x) {
        in.push(x);
    }

    public int popElement() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.pop().intValue();
    }

    public int peekElement() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.peek().intValue();
    }

    public boolean isEmptyResult() {
        return in.isEmpty() && out.isEmpty();
    }
}