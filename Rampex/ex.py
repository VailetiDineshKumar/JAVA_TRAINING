import pandas as pd
from sklearn.datasets import load_iris
data = load_iris()
df = pd.DataFrame(data.data)
print("Mean:\n",df.mean())
print("Median:\n",df.median())
print("Mode:\n",df.mode())
print("var:\n",df.var())
print("std:",df.std())