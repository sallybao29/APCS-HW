In terms of time, ssort and issort are roughly the same, experiencing a square increase in time. With an array of length 10000, both isort and ssort take on average 0.260 seconds; with a length of 20000, 0.749 seconds; with a length of 3000, 1.6 seconds. Bsort, on the other hand, is a lot more inefficient. In the worst case scenario, for an array of length n, it can increase by n^n times. 

