match.score <- 300
match.score
assign("match.score",300)
match.score

get("match.score",globalenv())

my.environment <- new.env()
parent.env(my.environment)

assign("match.score",320,my.environment)
my.environment[["match.score"]] <- 320
my.environment$match.score <- 320

get("match.score",my.environment)
my.environment[["match.score"]]
my.environment$match.score