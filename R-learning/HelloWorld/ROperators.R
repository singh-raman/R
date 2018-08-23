#Arithmetic Operators
10+5
10-5
123*13
12/2
32^2
format(2^4,scientific = FALSE)
12**2 #find exponent 
10%%3 #modulus
10%/%3

abs(-5)
log(2)
log(2,base=10)
exp(5)
factorial(5)

pi
options()
options(digits = 10)
pi

#special numbers

1/0
-1/0
Inf + 10
is.finite(1/0)
is.infinite(1/0)

Inf/Inf
is.nan(Inf/Inf)

NA + 5
is.na(NA)

is.na(NaN)
is.nan((NA))

#logical operators
4 > 2
5 == 2
"b" > "a"
TRUE | FALSE 

# vectorized operations
student.marks <- c(10,20,30,40)
student.marks
mean(student.marks)

student.marks <- student.marks +5
student.marks

student.marks >= 30

student.physics.marks <-c(20,30,40,50)
student.chemistry.marks <-c(10,20,30,40)
student.total.marks <- student.chemistry.marks+ student.physics.marks
get("student.total.marks")
student.total.marks