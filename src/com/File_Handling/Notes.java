package com.File_Handling;

import java.io.*;

/*
=================================================================
                JAVA FILE HANDLING & STREAMS
                    (FULL ADVANCED NOTES)
=================================================================

This file contains COMPLETE theory + concepts + examples of:

1) IOException
2) Streams
3) Byte Streams
4) Character Streams
5) InputStream / OutputStream
6) Reader / Writer
7) InputStreamReader
8) BufferedReader
9) OutputStreamWriter
10) FileReader / FileWriter
11) BufferedWriter
12) try-with-resources
13) AutoCloseable
14) File Class

This is written like NOTES (not project code).

=================================================================
*/

public class Notes {

    public static void main(String[] args) {

        System.out.println("Java File Handling Notes");

        // Example of console input using BufferedReader + InputStreamReader

        try (BufferedReader br =
                     new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter text:");
            String data = br.readLine();
            System.out.println("You typed: " + data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
=================================================================
1 IOEXCEPTION
=================================================================

IOException occurs when JVM fails to perform Input / Output operation.

Examples:
---------
- File not found
- Disk error
- Permission denied
- File corrupted
- Network failure
- Stream closed unexpectedly

IOException is a CHECKED exception.

Meaning:
--------
Compiler forces you to either:
- handle using try-catch
OR
- declare using throws

WHY CHECKED?
------------
Because I/O failures are common in real systems
and must be handled properly.

Interview line:
---------------
IOException represents failures in I/O operations such as file handling.

=================================================================
2 STREAMS
=================================================================

Stream = Flow of data in sequence.

Java does NOT directly read/write from devices.
It uses streams as abstraction.

A stream:
---------
- Produces data (input)
- Consumes data (output)

Think of stream like pipe:
---------------------------
Source → Stream → Program
Program → Stream → Destination

=================================================================
3 TYPES OF STREAMS
=================================================================

Java provides TWO types:

------------------------------------------------
A) BYTE STREAMS
------------------------------------------------

Used for RAW binary data.

Examples:
---------
Images
Videos
PDF
Executable files

Top abstract classes:
--------------------
InputStream
OutputStream

Subclasses:
-----------
FileInputStream
FileOutputStream
BufferedInputStream
BufferedOutputStream

Byte stream works with 8-bit data.

Unicode characters like 'ᛞ'
cannot be represented properly.

------------------------------------------------
B) CHARACTER STREAMS
------------------------------------------------

Used for TEXT data.

Supports Unicode.

Top abstract classes:
--------------------
Reader
Writer

Subclasses:
-----------
FileReader
FileWriter
BufferedReader
BufferedWriter
InputStreamReader
OutputStreamWriter

Used for:
----------
Keyboard input
Console output
Text files

=================================================================
STREAM HIERARCHY
=================================================================

BYTE STREAM:

Object
  ↓
InputStream → FileInputStream
OutputStream → FileOutputStream


CHARACTER STREAM:

Object
  ↓
Reader → InputStreamReader → FileReader
Writer → OutputStreamWriter → FileWriter

=================================================================
4 PREDEFINED STREAMS
=================================================================

System.in   → InputStream (keyboard)
System.out  → PrintStream (console)
System.err  → PrintStream (error console)

These are BYTE streams.

=================================================================
5 INPUTSTREAMREADER
=================================================================

Purpose:
--------
Converts BYTE stream into CHARACTER stream.

Example:
--------
System.in is byte stream
InputStreamReader(System.in) converts to char stream

Method:
-------
read() → returns Unicode character

Used mainly for keyboard input.

Implements AutoCloseable.

=================================================================
6 BUFFEREDREADER
=================================================================

Why needed?
-----------
Reading single character is slow.

BufferedReader reads BLOCKS of data.

Provides:
---------
readLine()

Which reads full line at once.

Example:

BufferedReader br =
new BufferedReader(new InputStreamReader(System.in));

Flow:
-----
Keyboard → System.in (byte)
→ InputStreamReader (char)
→ BufferedReader (buffered char)

=================================================================
7 OUTPUTSTREAMWRITER
=================================================================

Converts character data to byte stream.

Used for writing characters.

write() overloads:
------------------
write(int)
write(String)
write(char[])

=================================================================
8 FILEREADER
=================================================================

Used to read TEXT files.

Hierarchy:
----------
Object → Reader → InputStreamReader → FileReader

Does not add new methods.
Inherits read() from Reader.

Implements AutoCloseable.

=================================================================
9 FILEWRITER
=================================================================

Used to write TEXT files.

Hierarchy:
----------
Object → Writer → OutputStreamWriter → FileWriter

Implements AutoCloseable.

=================================================================
10 BUFFEREDWRITER
=================================================================

Used to write text efficiently.

Adds:
-----
newLine()

Avoids hardcoding "\r\n".

=================================================================
11 TRY-WITH-RESOURCES (JAVA 7+)
=================================================================

Automatically closes streams.

Syntax:

try(Resource r = ...) {
}

Resource must implement AutoCloseable.

Advantages:
-----------
- Cleaner code
- No finally block needed
- Prevents resource leak

=================================================================
12 AUTOCLOSEABLE
=================================================================

Interface.

Any class implementing AutoCloseable
can be used inside try-with-resources.

All I/O classes implement it.

=================================================================
13 FILE CLASS
=================================================================

Problem:
--------
Windows uses '\'
Linux uses '/'

Hardcoding paths breaks portability.

File class solves this.

--------------------------------------------------
Constructors:
--------------------------------------------------

File(String pathname)
File(String parent, String child)
File(File parent, String child)
File(URI uri)

--------------------------------------------------
Uses:
--------------------------------------------------

- Create file
- Create directory
- Check exists()
- delete()
- getAbsolutePath()

Example:
--------
File f = new File("data","sample.txt");

Works on all OS.

=================================================================
INTERVIEW GOLD POINTS
=================================================================

- IOException is checked
- Byte streams handle binary
- Character streams handle Unicode
- BufferedReader improves performance
- InputStreamReader converts byte → char
- try-with-resources auto closes streams
- File class provides OS independence

=================================================================
REAL WORLD THINKING
=================================================================

Byte stream:
------------
Like copying photo

Character stream:
-----------------
Like typing text

BufferedReader:
---------------
Reading paragraph instead of letter

try-with-resources:
-------------------
Auto closing tap after use

=================================================================
FINAL ONE-LINER
=================================================================

Java performs I/O using streams where byte streams
handle binary data and character streams handle text,
with buffering and try-with-resources ensuring
efficient and safe file handling.

=================================================================
*/

