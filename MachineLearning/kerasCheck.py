import numpy as np
from keras import backend as kbe
import os
os.environ["TF_CPP_MIN_LOG_LEVEL"]="3"

data = kbe.variable(np.random.random((4,2)))
zero_data = kbe.zeros_like(data)
print(kbe.eval(zero_data))