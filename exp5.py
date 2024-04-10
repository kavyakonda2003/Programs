from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier, plot_tree
import matplotlib.pyplot as plt
import seaborn as sns
# Plotting distributions
iris_df = sns.load_dataset('iris') # Load the Iris dataset using Seaborn
sns.FacetGrid(iris_df, hue="species", height=3).map(sns.distplot, "petal_length").add_legend()
sns.FacetGrid(iris_df, hue="species", height=3).map(sns.distplot, "petal_width").add_legend()
sns.FacetGrid(iris_df, hue="species", height=3).map(sns.distplot, "sepal_length").add_legend()
sns.FacetGrid(iris_df, hue="species", height=3).map(sns.distplot, "sepal_width").add_legend()
plt.show()
iris=load_iris()
# Split the dataset into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(iris.data, iris.target, test_size=0.3,random_state=42)
# Initialize the Decision Tree Classifier
clf = DecisionTreeClassifier()
# Train the classifier on the training data
clf.fit(X_train, y_train)
# Predict the labels for the test set
y_pred = clf.predict(X_test)
# Evaluate the model
accuracy = clf.score(X_test, y_test)
print("Accuracy:", accuracy)
# Plot the decision tree
plt.figure(figsize=(24, 24))
plot_tree(clf, filled=True, feature_names=iris.feature_names, class_names=iris.target_names)
plt.show()
print("y predict",y_pred)
print("y test",y_test)
from sklearn.metrics import confusion_matrix
cm = confusion_matrix(y_test, y_pred)
print("confusion matrix")
print(cm)
