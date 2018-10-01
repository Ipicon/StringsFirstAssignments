/**
 * Write a description of Part1 here.
 * StringsFirstAssignments
 * @author (Max Shulov) 
 * @version (9.18.18)
 */
public class Part1 {
    public String findSimpleGene(String dna)
    {
        String result = null;
        int ATG = dna.indexOf("ATG");
        if(ATG == -1)
            return "";
        int TAA = dna.indexOf("TAA",ATG + 3 );
        if(TAA == -1)
            return"";
        result = dna.substring(ATG,TAA + 3);
        if((TAA-ATG)%3 == 0)
            return result;
        return "";
    }
    public void testSimpleGene()
    {
        String dna = "GATATATAGTTAAGTATAA";
        System.out.println("The DNA is: " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("The gene is: " + gene);
        
        dna = "GTAGAATATATGGAATG";
        System.out.println("The DNA is: " + dna);
        gene = findSimpleGene(dna);
        System.out.println("The gene is: " + gene);
        
        dna = "GTATTAGTA";
        System.out.println("The DNA is: " + dna);
        gene = findSimpleGene(dna);
        System.out.println("The gene is: " + gene);
        
        dna = "TTAGATGGTAGATGGTTAAGTA";
        System.out.println("The DNA is: " + dna);
        gene = findSimpleGene(dna);
        System.out.println("The gene is: " + gene);
        
        dna = "ATGGTATTAA";
        System.out.println("The DNA is: " + dna);
        gene = findSimpleGene(dna);
        System.out.println("The gene is: " + gene);
    }
}
