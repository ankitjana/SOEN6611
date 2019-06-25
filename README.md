# SOEN6611
SOEN_6611
Software Measurement - SOEN 6611 Team Q: Satgur Singh, Tarundeep Kaur, Vikramjit Singh, Ankit Jana, Yuhua Jiang, Farid Omarzadeh
Software Measurement Summer 2019:
 Selected Metrics and Correlation analysis:


Metric 1: Statement Coverage
Metric 2: Branch Coverage
Metric 3: Mutation Score
Metric 4: Cyclomatic Complexity
Metric 5: Maintainability index 
Metric 6: Post-Release Defect Density

Metric 5: Maintainability index:
It has the direct relationship with  maintenance effort. 
Maintainability Index is a software metric which measures how maintainable (easy to support and change) the source code is. The maintainability index is calculated as a factored formula consisting of Lines of Code, Cyclomatic Complexity and Halstead volume. 

Calculation:
Firstly, we need to measure the following metrics from the source code:
V = Halstead Volume
G = Cyclomatic Complexity
LOC = count of source Lines of Code (SLOC)
CM = percent of lines of Comment (optional)
From these measurements the MI can be calculated:
The original formula:
MI = 171 - 5.2 * ln(V) - 0.23 * (G) - 16.2 * ln (LOC)
The derivative used by SEI is calculated as follows:
MI = 171 - 5.2 * log2(V) - 0.23 * G - 16.2 * log2 (LOC) + 50 * sin (sqrt (2.4 * CM))
The derivative used by Microsoft Visual Studio (since v2008) is calculated as follows:
MI = MAX (0, (171 - 5.2 * ln (Halstead Volume) - 0.23 * (Cyclomatic Complexity) - 16.2 * ln (Lines of Code)) *100 / 171)
In all derivatives of the formula, the most major factor in MI is Lines of Code, which effectiveness has been subjected to debate. 

Metric 6: Post-Release Defect Density(DD):
Post-Release Defect Density is the number of defects confirmed in software during a specific period of development or operation divided by the size of software. It helps to decide whether the software is ready for release or not. It is counted per thousand lines of code (KLOC).

Calculation: 
Post-Release Defect Density = Defect Count / Size of Release

Example: If there are 15 defects in 5 components then Post-Release Defect Density =15/5 = 3.
So the Defect Density per component is 3.

Algorithm: 
Step 1: Collect the raw material: You are going to need the total number of defects (for a release/build/cycle).
Step2: Calculate the average number of defects/Functional area or KLOC.

Correlation between Metric 5 and 6:
There is positive correlation between Maintainability index and post-release defect density as the development team puts a lot of effort in maintenance. High amount of cost is spent on maintenance activity so this decreases the chances of effects after this phase. 
Correlation between Metric 1 and 6:
100% Statement Coverage implies 100% Line Coverage. But the opposite is not true: a line may contain multiple statements whereas a test may not succeed in executing all of them. It will cause negative correlation between it and post-release defect density.
Correlation between Metric 2 and 6:
Only the outcome of a decision needs to be tested. Boolean expressions leading to the decision are not considered. It will cause negative correlation between it and post-release defect density.

Correlation between each coverage Metrics:
Statement and branch testing is used to collect the coverage of test suite.
Mutation score is the calculation to measure the quality of test suite which is detecting the introduced faults in mutants. Higher the test suite coverage means the test suite is effective in detecting the faults.
Halstead complexity is used to calculate the complexity of the program. It can be computed based on operators(Keywords, arithmetic symbols) and operands(Identifiers, constants) in the program.


Selected Open-Source Systems:

System 1:
Name: Apache Common Collections:
Description:  Apache Common Collections is build upon JDK   classes.
It extends the Java Collections Framework. It provides new interfaces, implementations and utilities. It acts as a Bidimap  interface for maps that can be looked up from key to value and vice-versa. It also acts as a MapIterator interface to provide iterations over maps. It also has a feature of composite collections that makes multiple collections look like one.
Version: Current version is 4.3
Rationale: 
The project has 3103 commits and 38 contributors representing 132762 LOC. It has 8 branches and 47 releases.
Apache Common Collections is written in Java.
It uses JIRA for issue tracking.
It helps in avoiding writing boilerplate code.
The project is last modified in May 21, 2019.
It has an estimated effort of 34 years(COCOMO Model).
The project uses JIRA for issue tracking and the link of Tool is given below:
https://commons.apache.org/proper/commons-collections/issue-tracking.html

System 2: 
Name: Log4j
Description:  It is a popular logging package for java and it is distributed under the Apache Software License. This package is widely accepted and used in many applications. If the developers are not available then the log4j statements help in debugging the code.

Version: Log4j 2

Rationale: 
The project has 10592 commits and 61 contributors. 
The project is written in java and has 185521 LOC.
The project has estimated effort of 48 years(COCOMO Model).
The first commit of this project is in February 2012.
The project is last modified on May 13, 2019.
The project uses JIRA for issue tracking and the link of Tool is given below:
https://logging.apache.org/log4j/2.0/issue-tracking.html

System 3:
Name: JFreeChart
Description: It is a free chart library in java. This library can be used on the client side or the server side. It can be build using Maven. 
Version: Version 1.5.0
Rationale:
 The project has 3670 commits and 12 contributors representing 245379 LOC.
The project is written in java and it was founded in february 2000.
JFreeChart can be used by different applications to create different kinds of charts like pie chart, bar chart, line chart etc.
The last commit on this project is on February 7, 2019 and its first commit is in June 2007.
The project uses JIRA for issue tracking and the link of Tool is given below:
https://confluence.atlassian.com/display/JIRAEXT/JIRA+Extensions

System 4:
Name: ImageJ
Description: It is a java based image processing program for optical and computational instrumentation. It can be run on an online applet or a downloadable application or on any computer with java 5 or later virtual machine. It provides extensibility via java plugins, also user written plugins can solve almost any image processing or analysis problem. 
Version: ImageJ 1.52m11
Rationale:
The project has 9141 commits and 15 contributors representing 149041 LOC.
Project is mostly written in java.
It can display, edit, analyse, process, save and print images.
It took approximately 39 years of effort(COCOMO Model).
Its first commit is in July 2008 and latest commit is on May 1, 2019.
The project uses JIRA for tracking issues and the link is given below:
https://www.atlassian.com/software/jira

System 5:
Name: Checkstyle
Description: It is a development tool to help programmers write java code that adheres to coding standards. It provides many checks that can be applied to the source code. Checkstyle automates the process of checking java code and is best for those projects that want to enforce the coding standards.
Version: Checkstyle 8.17
Rationale:
The project has 8446 commits and 190 contributions.
The project has 178913 LOC.
The project is mostly written in java .
The project took an effort of approximately 68 years(COCOMO Model).
Its first commit is in june 2001 and its latest commit is on May 16, 2019.
The project uses JIRA for issue tracking and the link is given below:
https://www.atlassian.com/software/jira

System 6:
Name: Fitnesse
Description: This tool is used for specifying and verifying the requirements of an application. The test execution capabilities of this tool can be used to verify the documentation against the software which ensures that the documents are up to date and there is no regression problem in the software.
Version:
Rationale: 
The project has 5713 commits and 105 contributors.
The project has 79511 LOC.
The project is mostly written in java.
The project was started in 2001.
The last commit of this project is on May 8,2019.
The project uses JIRA for issue tracking. 

References:

https://commons.apache.org/proper/commons-collections/
https://github.com/apache/commons-collections
https://logging.apache.org/log4j/2.x/
https://github.com/apache/logging-log4j2
http://www.jfree.org/jfreechart/
https://github.com/jfree/jfreechart
https://imagej.net/Welcome			
https://github.com/imagej/imagej 
http://checkstyle.sourceforge.net/
https://github.com/checkstyle/checkstyle
