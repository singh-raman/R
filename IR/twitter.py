from twitter import Twitter, OAuth, TwitterHTTPError, TwitterStream
# Import the necessary methods from "twitter" library
#from twitter import Twitter, OAuth, TwitterHTTPError, TwitterStream

# Variables that contains the user credentials to access Twitter API 
ACCESS_TOKEN = '4228949054-66c2B50214SyGmH2WIlmiNmpG9uUfDICMNSUfgu'
ACCESS_SECRET = 'pNlVBVBioVOVegRFO87tTCN6mamXCAgcYfYjvnRGu6GJ1'
CONSUMER_KEY = 'x24SGtuHssK6qa1frV3WcHu0o'
CONSUMER_SECRET = 'uARzA0vsZZ6kZCzWDLIvOV2zNm88MLCeu9kqDTB3gDTjC94tt8'

oauth = OAuth(ACCESS_TOKEN, ACCESS_SECRET, CONSUMER_KEY, CONSUMER_SECRET)

# Initiate the connection to Twitter Streaming API
twitter_stream = TwitterStream(auth=oauth)

# Get a sample of the public data following through Twitter
iterator = twitter_stream.statuses.sample()

# Print each tweet in the stream to the screen 
# Here we set it to stop after getting 1000 tweets. 
# You don't have to set it to stop, but can continue running 
# the Twitter API to collect data for days or even longer. 
tweet_count = 1000
for tweet in iterator:
    tweet_count -= 1
    # Twitter Python Tool wraps the data returned by Twitter 
    # as a TwitterDictResponse object.
    # We convert it back to the JSON format to print/score
    print(json.dumps(tweet))
    
    # The command below will do pretty printing for JSON data, try it out
    # print json.dumps(tweet, indent=4)
       
    if tweet_count <= 0:
        break 