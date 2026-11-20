                    if (line == null) break;
                    st = new StringTokenizer(line);
                }
                int id = Integer.parseInt(st.nextToken());
                count++;

                if (!inside[id]) {
                    inside[id] = true;
                    current++;
                    if (current > maxPeople) {
                        maxPeople = current;
                    }
                } else {
                    inside[id] = false;
                    current--;
                }
            }

            out.append(maxPeople).append('\n');
        }

        System.out.print(out.toString());
    }
}
