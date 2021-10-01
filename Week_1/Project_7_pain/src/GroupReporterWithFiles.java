import java.io.*;
public class GroupReporterWithFiles extends GroupReporter
{
        public   void printDataForReportFile(PrintWriter textStream)
        {       
                textStream.println("to the file number of people is "
                                + getNumberCount());    
        }
}
----
GroupReporter.java


public class GroupReporter
{
        private    int numberCount = 0;
        public    void colectDataForReport(Person person)
        {       
                numberCount++;  
        }
        public   void printDataForReport()
        {
                System.out.println("from groupReporter to the screen number "
                                + "of people is " + numberCount);
        }
        public int getNumberCount()
        {       
                return numberCount;     
        }
}