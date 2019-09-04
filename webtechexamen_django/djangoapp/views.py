from django.shortcuts import render
import json
from django.http import HttpResponse, HttpResponseBadRequest, HttpResponseNotFound

from django.views.decorators.csrf import csrf_exempt

def getJSON(filePathAndName):
    with open(filePathAndName, 'r') as fp:
     json.loads(fp.read())
    
    myObj = getJSON('./infractions.json')
    print(myObj.get("id",""))