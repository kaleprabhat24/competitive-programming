        } else {
            int nextMultiple = ((g / 5) + 1) * 5;
            if (nextMultiple - g < 3) {
                result.add(nextMultiple);
            } else {
                result.add(g);
            }
        }
    }

