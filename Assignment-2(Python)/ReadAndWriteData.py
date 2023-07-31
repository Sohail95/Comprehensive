import csv
with open("datafiles.csv" 'r') as csvfile:
    rows = csv.reader(csvfile)
    for row in rows:
      print(row)  
    