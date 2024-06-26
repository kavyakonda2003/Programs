
# Install EBImage
#install.packages("BiocManager")
#BiocManager::install("EBImage")

# Read Image
library(EBImage)
Image1 <- readImage("~/Desktop/pic1.JPG")
Image2 <- readImage("~/Desktop/pic2.JPG")

# Plot data
hist(Image1)

# Manipulating brightness
# Light
a <- Image1 + 0.4
print(a)
display(a)

# Dark
b <- Image1 - 0.4
display(b)
hist(b)

# Combine
c <- combine(Image1,Image2)
display(c)

# Put two picture into one
d <- Image1 + Image2/4
display(d)
hist(d)

# Manipulating contrast
e <- Image1*0.5
display(e)
f <- Image1*3
display(f)

# Gamma Correction
g <- Image1^0.5
h <- Image1^3
display(g)
display(h)

# Color
colorMode(Image1) <- Grayscale
print(Image1)
display(Image1)

colorMode(Image1) <- Color #to return to color

# Cropping
k <- Image1[800:2686, 800:2200,]
display(k)

# New image file
writeImage(k, "NewImage.jpg")

# Flip, Flop, Rotate, resize
l <- flip(Image1)
display(l)
m <- rotate(Image1, 45)
display(m)
n<- flop(Image1)
display(n)
o <- resize(Image1, 400)
display(o)

# Low-pass filter
low <- makeBrush(81, shape = 'disc', step=FALSE)^2
low <- low/sum(low)
Image.low <- filter2(Image1, low)
display(Image.low )

# High-pass filter
high <- matrix(1, nc=3, nr = 3)
high[2,2] <- -5
Image.high <- filter2(Image1, high)
display(Image.high)

# Combine
new<- Image.high/5+Image1
comb <- combine(Image1, new)
display(comb)
hist(comb)
