print("hello world")
mean(1:30)
x <- 1:30
mean(x)

#Help commands
help(rnorm)
example(rnorm)
?rnorm
help.search("rnorm")
??rnorm

#Demo commands
demo()
demo(package = .packages(all.available = TRUE)) #List demonstrations in all installed packages
demo(package = 'graphics')
demo(graphics)

#vignette - short to mid sized documents
vignette()
vignette(package = .packages(all.available = TRUE)) #packages from all the installed packages
vignette(package = 'parallel')
vignette('parallel', package = 'parallel')

#search on web
RSiteSearch("arithmetic mean")
RSiteSearch("{arithmetic mean}")
install.packages("sos")
library(sos)
findFn("{arithmetic mean}")
findFn("{arithmetic mean}",maxPages = 2)
???"{arithmetic mean}"(2)