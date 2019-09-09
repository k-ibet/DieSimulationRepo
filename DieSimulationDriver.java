public class DieSimulationDriver extends DieSimulation {
    public static void main(String[] args) {
        int i;
        float[] myArray = new float[1000];
        int intConvert[] = new int[1000];
        int facefreq[]=new int[6];
        int totalFreq = 0;
        float totalPerc = 0;
        // generating random numbers
        for (i = 0; i < 1000; i++) {
            myArray[i] = (float)Math.random();
            intConvert[i] = relIntegerNumber(myArray[i]);
        }
        // running function to convert the set of floats to ints
        for (i = 0; i < intConvert.length; i++) {
            if (intConvert[i]==1){
                facefreq[0]++;
            }
            if (intConvert[i]==2){
                facefreq[1]++;
            }
            if (intConvert[i]==3){
                facefreq[2]++;
            }
            if (intConvert[i]==4){
                facefreq[3]++;
            }
            if (intConvert[i]==5){
                facefreq[4]++;
            }
            if (intConvert[i]==6){
                facefreq[5]++;
            }
        }
        System.out.println("Face\tFrequency\tPercentage Frequency");
        for (i=0;i<facefreq.length;i++){
            totalFreq =  facefreq[i] + totalFreq;
            totalPerc = totalPerc + (float)((facefreq[i]*100.0)/1000);
            System.out.println(i+1 +"\t"+facefreq[i]+"\t\t"+(facefreq[i]*100.0)/1000);
        }
        System.out.println("Total Frequency of faces: " +totalFreq);
        System.out.printf("Total Percentage Frequency of faces: %.1f" ,totalPerc);
    }
}