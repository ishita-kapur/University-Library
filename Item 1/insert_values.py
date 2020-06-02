#Ishita Kapur, UTA ID: 1001753123
import csv
import mysql.connector

mydb = mysql.connector.connect(
  host="localhost",
  user="root",
  passwd="password",
  database="library",
  auth_plugin='mysql_native_password'
)

mycursor = mydb.cursor()

print('\nINSERTING VALUES INTO STAFF')

query = "insert into staff values(%s, %s, %s, %s, %s, %s, %s, %s, %s)"
with open('staff.csv', 'r') as csvfile:
    reader = csv.reader(csvfile, delimiter=',')
    for row in reader:
        for i in range(len(row)):
            if row[i] == '':
                row[i] = None
        print(row)
        mycursor.execute(query, row)
csvfile.close()

print('\nINSERTING VALUES INTO MEMBER')

query = "insert into member values(%s, %s, %s, %s, %s, %s, %s)"
with open('member.csv', 'r') as csvfile:
    reader = csv.reader(csvfile, delimiter=',')
    for row in reader:
        for i in range(len(row)):
            if row[i] == '':
                row[i] = None
        print(row)
        mycursor.execute(query, row)
csvfile.close()

print('\nINSERTING VALUES INTO BOOK')

query = "insert into book values(%s, %s, %s, %s, %s, %s)"
with open('book.csv', 'r') as csvfile:
    reader = csv.reader(csvfile, delimiter=',')
    for row in reader:
        for i in range(len(row)):
            if row[i] == '':
                row[i] = None
        print(row)
        mycursor.execute(query, row)
csvfile.close()

print('\nINSERTING VALUES INTO AUTHOR')

query = "insert into author values(%s, %s)"
with open('author.csv', 'r') as csvfile:
    reader = csv.reader(csvfile, delimiter=',')
    for row in reader:
        for i in range(len(row)):
            if row[i] == '':
                row[i] = None
        print(row)
        mycursor.execute(query, row)
csvfile.close()

print('\nINSERTING VALUES INTO CATALOGUE')

query = "insert into catalogue values(%s, %s)"
with open('catalogue.csv', 'r') as csvfile:
    reader = csv.reader(csvfile, delimiter=',')
    for row in reader:
        for i in range(len(row)):
            if row[i] == '':
                row[i] = None
        print(row)
        mycursor.execute(query, row)
csvfile.close()

print('\nINSERTING VALUES INTO COPIES')

query = "insert into copies values(%s, %s)"
with open('copies.csv', 'r') as csvfile:
    reader = csv.reader(csvfile, delimiter=',')
    for row in reader:
        for i in range(len(row)):
            if row[i] == '':
                row[i] = None
        print(row)
        mycursor.execute(query, row)
csvfile.close()

print('\nINSERTING VALUES INTO ADDRESS')

query = "insert into address values(%s, %s, %s)"
with open('address.csv', 'r') as csvfile:
    reader = csv.reader(csvfile, delimiter=',')
    for row in reader:
        for i in range(len(row)):
            if row[i] == '':
                row[i] = None
        print(row)
        mycursor.execute(query, row)
csvfile.close()

print('\nINSERTING VALUES INTO PHONE_NO')

query = "insert into phone_no values(%s, %s, %s)"
with open('phone_no.csv', 'r') as csvfile:
    reader = csv.reader(csvfile, delimiter=',')
    for row in reader:
        for i in range(len(row)):
            if row[i] == '':
                row[i] = None
        print(row)
        mycursor.execute(query, row)
csvfile.close()

mydb.commit()