import numpy as np
data= ([[[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]],
               [[13, 14, 15, 16], [17, 18, 19, 20], [21, 22, 23, 24]]])
arr = np.array(data);
arr2=np.transpose(arr,(1,0,2));
print(arr[1:2,0:2,0:2]);
