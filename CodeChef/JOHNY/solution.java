                int[] playlist = new int[n];
                
                // Read lengths of songs
                for (int i = 0; i < n; i++) {
                    playlist[i] = sc.nextInt();
                }
                
                // Read the initial position of Uncle Johny (1-indexed)
                int k = sc.nextInt();
                
                // Store the actual value of the target song
                int uncleJohnyLength = playlist[k - 1];
                
                // Sort the array in ascending order
                Arrays.sort(playlist);
                
                // Find the new 1-indexed position of the target song
                int finalPosition = -1;
                for (int i = 0; i < n; i++) {
                    if (playlist[i] == uncleJohnyLength) {
                        finalPosition = i + 1; // Convert 0-index to 1-index
                        break;
                    }
                }
                
                // Output the result for the current testcase
                System.out.println(finalPosition);
            }
        }
        sc.close();
    }
}
