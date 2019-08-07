class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuffer tempBuffer=new StringBuffer(dnaStrand.length());
        tempBuffer.append(dnaStrand);

        for(int i=0;i<tempBuffer.length();i++)
        {
            if(tempBuffer.charAt(i)=='G')
                tempBuffer.setCharAt(i,'C');
            else if(tempBuffer.charAt(i)=='C')
                tempBuffer.setCharAt(i,'G');
            else if(tempBuffer.charAt(i)=='T')
                tempBuffer.setCharAt(i,'A');
            else
                tempBuffer.setCharAt(i,'U');
        }
        return tempBuffer.toString();

    }

}
