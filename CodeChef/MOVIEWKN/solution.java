                L[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                R[i] = sc.nextInt();
            }

            int bestProd = -1;
            int bestR = -1;
            int bestIndex = -1;

            for (int i = 0; i < n; i++) {
                int prod = L[i] * R[i];
                if (prod > bestProd || (prod == bestProd && R[i] > bestR)) {
                    bestProd = prod;
                    bestR = R[i];
                    bestIndex = i + 1;
                }
            }

            System.out.println(bestIndex);
        }
        sc.close();
    }
}
