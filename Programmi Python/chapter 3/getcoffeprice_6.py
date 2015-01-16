import urllib.request
import time
def get_price():
	page = urllib.request.urlopen("http://www.beans-r-us.biz/prices.html")
	text = page.read().decode("utf8")
	where = text.find('>$')
	start_of_price = where + 2
	end_of_price = start_of_price + 4
	return float(text[start_of_price:end_of_price])
def send_to_twitter(msg):
	password_manager = urllib.request.HTTPPasswordMgr()
	password_manager.add_password("Twitter API","http://twitter.com/statuses", "paolopiers", "wolbo4cil")
	http_handler = urllib.request.HTTPBasicAuthHandler(password_manager)
	page_opener = urllib.request.build_opener(http_handler)
	urllib.request.install_opener(page_opener)
	params = urllib.parse.urlencode( {'status': msg} )
	resp = urllib.request.urlopen("http://twitter.com/statuses/update.json", params)
	resp.read()
price_now = input("Do you want to see the price now (Y/N)? ")
if price_now == "Y":
	#print(get_price()) invece di vederlo a video voglio vederlo su TW
	send_to_twitter(str(get_price()))	
else:
	price = 99.99
	while price > 4.74:
		time.sleep(900)
		price = get_price()
	send_to_twitter("Buy!")
