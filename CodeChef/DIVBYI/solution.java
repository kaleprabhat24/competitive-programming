            int[] P = new int[N];
            
            int left = 1;
            int right = N;
            boolean takeRight = true;
            
            // Fill the array from right to left
            for (int i = N - 1; i >= 0; i--) {
                if (takeRight) {
                    P[i] = right--;
                } else {
                    P[i] = left++;
                }
                takeRight = !takeRight;
            }
            
            for (int i = 0; i < N; i++) {
                out.append(P[i]).append(" ");
            }
            out.append("\n");
        }
        System.out.print(out.toString());
    }
}
