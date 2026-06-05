            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            
            // Step 1: Scan the array and swap the first out-of-order adjacent pair found
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    break; // Only allowed to perform at most one swap operation
                }
            }
            
            // Step 2: Check if the entire array is now completely sorted
            boolean isSorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    isSorted = false;
                    break;
                }
            }
            
            if (isSorted) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
