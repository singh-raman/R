import tweepy
from tweepy import OAuthHandler, Stream
from tweepy.streaming import StreamListener

ACCESS_TOKEN = '4228949054-66c2B50214SyGmH2WIlmiNmpG9uUfDICMNSUfgu'
ACCESS_SECRET = 'pNlVBVBioVOVegRFO87tTCN6mamXCAgcYfYjvnRGu6GJ1'
CONSUMER_KEY = 'x24SGtuHssK6qa1frV3WcHu0o'
CONSUMER_SECRET = 'uARzA0vsZZ6kZCzWDLIvOV2zNm88MLCeu9kqDTB3gDTjC94tt8'

auth = OAuthHandler(CONSUMER_KEY, CONSUMER_SECRET)
auth.set_access_token(ACCESS_TOKEN, ACCESS_SECRET)
 
api = tweepy.API(auth)

class MyListener(StreamListener):
 
    def on_data(self, data):
        try:
            with open('python.json', 'a') as f:
                f.write(data)
                return True
        except BaseException as e:
            print("Error on_data: %s" % str(e))
        return True
 
    def on_error(self, status):
        print(status)
        return True
 
twitter_stream = Stream(auth, MyListener())
twitter_stream.filter
twitter_stream.filter(track=["#flood"], languages=["hi"], locations=[77.10894,28.55095,77.301499,28.71526])