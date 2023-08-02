package com.jap.marksevaluation;
public class OakBridgeSchool {

    // Convert the given string name to upper case
    public String convertToUpperCase(String name){
       if (name.length()>=1)
       {
           return name.toUpperCase();
       }
        return " ";
    }

    // Find the shortest word in the list of surnames
    public String shortestSurname(String[] surnames)
    {
        String shortestSName = new String();
        int len=surnames.length-1;
        for (int i=0;i<surnames.length-1;i++)
        {
            if(surnames[i].length()>surnames[i+1].length())
            {
                shortestSName=surnames[i+1];
            }
        }
        return shortestSName;
    }

    // Check if any of the names in the array is repeated, if yes return true else false
    public boolean checkIfNamesAreRepeated(String[] names){
        int i,j;
        //"Michelle", "Kato", "Ann", "Tina", "Tom", "Sam", "Ria","Pam", "Kate", "Leo"}
        if (names.length != 1) {
            for (i = 0; i < names.length - 1; i++) {
                for (j = i+1; j < names.length; j++) {
                    if (names[i].equals(names[j])) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    // Concatenate the name and surname of the students
    public String[] concatenateNameAndSurname(String[] names, String [] surnames){
        String concatenatedNames[]=new String[names.length];
        for(int i=0;i<names.length;i++)
        {
            concatenatedNames[i] =names[i].concat(" ").concat(surnames[i]) ;
        }
        return  concatenatedNames;
    }

    // Display the names
    public void displayStudentNames(String[] namesArray){
        String temp;
        for (int i=0; i<namesArray.length-1; i++)
        {
            for (int j=0;j<namesArray.length-1;j++)
            {
                if(namesArray[j].charAt(0)>namesArray[j+1].charAt(0))
                {
                    temp=namesArray[j];
                    namesArray[j]=namesArray[j+1];
                    namesArray[j+1]=temp;
                }
            }
        }
        for (int i=0;i<namesArray.length;i++)
        {
            System.out.print(namesArray[i]+" ");
        }
    }
    public static void main(String[] args) {
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();

        // Declare and Initialize values to the arrays
        String[] studentNames = {"Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria","Pam", "Kate", "Leo"};
        String[] studentSurnames = {"Smith","Johnson","Williams","Brown","James","Miller","Davis","Martin","Clark","King"};

        // Call the method to convert all the student names to upper case and display results
        System.out.println("The student names in uppercase :");
        String[] stringUpp = new String[studentNames.length];
        for (int i=0;i<studentNames.length;i++)
        {
            stringUpp[i] = oakBridgeSchool.convertToUpperCase(studentNames[i]);
            System.out.print(stringUpp[i]+", ");
        }
        System.out.println();

        // Call the method to sort names in alphabetical order and display results
        oakBridgeSchool.displayStudentNames(studentNames);
        System.out.println();

        // Call the method to find the shortest surname and display results
        String shortestSName = oakBridgeSchool.shortestSurname(studentSurnames);
        System.out.println("The shortest surname is: "+shortestSName);

        // Call the method to check if two names in the array are the same and display results
        boolean check=oakBridgeSchool.checkIfNamesAreRepeated(studentNames);
        System.out.println(check);

        // Call the method to concatenate name and surname with a space in between and display results
        System.out.println("The student full names (name and surname) :");
        for (int i=0;i<studentNames.length;i++)
        {
            String[] conNames = oakBridgeSchool.concatenateNameAndSurname(studentNames,studentSurnames);
            System.out.print(conNames[i]+", ");
        }

    }
}
