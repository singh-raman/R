#Atomic vector
student.names <- c("Raj","Rahul","Priya","Poonam")
student.names
str(student.names)
is.character(student.names)

student.weight <-c(23.3,123.3,123.4,95.54)
str(student.weight)
is.numeric(student.weight)

student.marks <-c(1L,2L,3L,4L,5L)
str(student.marks)
is.integer(student.marks)

student.phy.interest <-c(FALSE,F,TRUE,T)
str(student.phy.interest)
is.logical(student.phy.interest)

complex.vector <- c(10+2i, -9+10i,123+32i)
str(complex.vector)
is.complex(complex.vector)

vector("character", length = 4)
vector("numeric",length = 4)
vector("integer",length = 4)
vector("logical",length = 4)
vector("complex",length = 4)

#subsetting
student.names <- c("Raj","Rahul","Priya","Poonam")
student.physics.marks <-c(20,30,40,50)
student.chemistry.marks <-c(10,20,30,40)
student.names[1]
student.names[1:3]
student.names[c(T,F,T,F)]
student.names[student.physics.marks>=40]

#Coercions: coverting one type to another
student.weight <-c(23.3,123.3,123.4,"95.54")
str(student.weight)

as.numeric(student.physics.marks>=75)
as.character(student.physics.marks)
student.weight <- c(32.4,13.5,13.6,23.5)
as.integer(student.weight)

as.numeric(student.names)

#Factor

student.genders <- c("male","male","female","female")
student.genders
student.genders <-c(2L,2L,1L,1L)
student.genders
student.genders <-factor(c("male","male","female","female"))
student.genders
as.numeric(student.genders)
student.blood.groups <- factor(c("A","AB","O","AB"), levels = c("A","B","AB","O"))
str(student.blood.groups)

#List
student.names <- c("Raj","Rahul","Priya","Poonam")
student.genders <- c("male","male","female","female")
student.weight <- c(32.4,13.5,13.6,23.5)
student.physics.marks <-c(20,30,40,50)
student.chemistry.marks <-c(10,20,30,40)

student1 <- list(student.names[1],student.weight[1],student.genders[1],student.physics.marks[1],student.chemistry.marks[1])
str(student1)
student1

student1 <-list(names=student.names[1],
                weigth=student.weight[1],
                gender=student.genders[1],
                physics=student.physics.marks[1],
                chemistry=student.chemistry.marks[1])
str(student1)

student1 <- list(student.names[1],student.weight[1],student.genders[1],student.physics.marks[1],student.chemistry.marks[1])

student1[1]
typeof(student1[1])
student1[[1]]
typeof(student1[[1]])
student1[1:3]

student1 <-list(names=student.names[1],
                weigth=student.weight[1],
                gender=student.genders[1],
                physics=student.physics.marks[1],
                chemistry=student.chemistry.marks[1])
str(student1)
student1[["names"]]
student1$gender
student1[c("physics","chemistry")]

length(student1)

#Data Frame
