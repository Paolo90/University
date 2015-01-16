import urllib.request
import time
def send_to_twitter(msg):
	password_manager = urllib.request.HTTPPasswordMgr()
	password_manager.add_password("Twitter API","http://twitter.com/statuses", "paolopiers", "wolbo4cil")
	http_handler = urllib.request.HTTPBasicAuthHandler(password_manager)
	page_opener = urllib.request.build_opener(http_handler)
	urllib.request.install_opener(page_opener)
	params = urllib.parse.urlencode( {'status': msg} )
	resp = urllib.request.urlopen("http://twitter.com/statuses/update.json", params)
	resp.read()
send_to_twitter("ciao")
