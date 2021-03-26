# Online Library Management

Online Library Management is place where you can issue, add and return a book virtually which is avaliable in the Library.

## How to Execute the file via shell/terminal

You can use the command line tools provided by the JDK to execute this file by writing the following lines shown below in your shell/terminal

```bash
javac Main.java
```

```bash
java Main
```

Note that for executing a Java file via shell/terminal you must first add the path of your JDK's bin folder in the environment variable named PATH.

## Usage

```bash
Enter your choice (1-Issue Book, 2-Return Book, 3-Add Book, 4-Show Avaliable Books, 5-Quit, 6-Help): 4

Avaliable books are :-
Java For Dummies, Clean Code, CSLR, Java The Complete Reference, As a Man Thinketh, Marketing Management by Philip Kotla

Enter your choice (1-Issue Book, 2-Return Book, 3-Add Book, 4-Show Avaliable Books, 5-Quit, 6-Help): 1

Enter name of the book here: CSLR
CSLR has been successfully issued to you. Enjoy reading it!

Enter your choice (1-Issue Book, 2-Return Book, 3-Add Book, 4-Show Avaliable Books, 5-Quit, 6-Help): 4

Avaliable books are :-
Java For Dummies, Clean Code, Java The Complete Reference, As a Man Thinketh, Marketing Management by Philip Kotla

Enter your choice (1-Issue Book, 2-Return Book, 3-Add Book, 4-Show Avaliable Books, 5-Quit, 6-Help): 2

Enter name of the book here: CSLR
CSLR has been returned back successfully. Hope you enjoyed reading it!

Enter your choice (1-Issue Book, 2-Return Book, 3-Add Book, 4-Show Avaliable Books, 5-Quit, 6-Help): 4

Avaliable books are :-
Java For Dummies, Clean Code, Java The Complete Reference, As a Man Thinketh, Marketing Management by Philip Kotla, CSLR

Enter your choice (1-Issue Book, 2-Return Book, 3-Add Book, 4-Show Avaliable Books, 5-Quit, 6-Help): 3

Enter name of the book here: C++ For Dummies
C++ For Dummies has been added successfully. We are very happy that you helped our Library by giving this book to us.

Enter your choice (1-Issue Book, 2-Return Book, 3-Add Book, 4-Show Avaliable Books, 5-Quit, 6-Help): 4

Avaliable books are :-
Java For Dummies, Clean Code, Java The Complete Reference, As a Man Thinketh, Marketing Management by Philip Kotla, CSLR, C++ For Dummies

Enter your choice (1-Issue Book, 2-Return Book, 3-Add Book, 4-Show Avaliable Books, 5-Quit, 6-Help): 5
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)