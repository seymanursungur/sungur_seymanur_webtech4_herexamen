import json
with open('infractions.json', 'r') as fp:
    data = json.loads(fp.read())
    infractions = data['infractions']

for infra in infractions:
    print(infra['speed_limit'])