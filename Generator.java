import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Pontus on 2015-12-07.
 */
public class Generator {

    private Random rand = new Random();


    public static void main(String[] args){

        Generator raggning = new Generator();

        raggning.print();

    }

    public void print(){
        for(int i = 0; i < 5; i++){
            System.out.println(generate());
            System.out.println();
        }
    }

    public String generate(){
        String sub = getSubstantive();
        String denDet = sub.substring(2, 3);
        String t = "";
        String adj = getAdjective();
        if(denDet.equals("t")){
            t = "t";
        }
        if(isVokal(adj) && t.length() == 1){
            adj = adj + "t";
        }



        String replik = (getGreeting() + " " + getCompliment() + "! " + capitalize(getRelativePronoun()) +
                denDet + " " + adj + t + " " + sub.substring(4) + " du har d�r. " + capitalize(doYouMind()) +
        " " + mineOrI(denDet) + " " + getVerb() + " " + getPreposition() + " de" + denDet + "?");

        return replik;
    }

    private String capitalize(String str){
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    private boolean isVokal(String str){
        String lastChar = str.substring(str.length()-1);
        String vocals = "aeiouy���";
        if(vocals.contains(lastChar)){
            return true;
        }

        return false;
    }

    /*
    ***********************************
    WORD DATA BANK
    ***********************************
     */
    private String getGreeting(){
        ArrayList<String> greetings = new ArrayList<>();

        greetings.add("Hej d�r");
        greetings.add("Tjenixen");
        greetings.add("Hall� d�r");
        greetings.add("Tjenare");
        greetings.add("Hej");
        greetings.add("Goddag");
        greetings.add("God kv�ll");
        greetings.add("Goder afton");
        greetings.add("Tjena");
        greetings.add("Tjo");

        return greetings.get(rand.nextInt(greetings.size()));
    }

    private String getCompliment(){
        ArrayList<String> c = new ArrayList<>();

        c.add("snygging");
        c.add("heting");
        c.add("ditt j�vla r�vh�l");
        c.add("kexet");
        c.add("bruden");
        c.add("gumman");
        c.add("grabben");
        c.add("du");
        c.add("biokemisten");

        return c.get(rand.nextInt(c.size()));
    }

    private String getRelativePronoun(){
        ArrayList<String> r = new ArrayList<>();

        r.add("vilke");
        r.add("sicke");

        return r.get(rand.nextInt(r.size()));
    }

    private String getAdjective(){
        ArrayList<String> adjectives = new ArrayList<>();

        adjectives.add("vacker");
        adjectives.add("superl�cker");
        adjectives.add("bl�");
        adjectives.add("genomskinlig");
        adjectives.add("sexig");
        adjectives.add("r�d");
        adjectives.add("flygande");
        adjectives.add("fantastisk");
        adjectives.add("underbar");

        return adjectives.get(rand.nextInt(adjectives.size()));
    }

    private String getSubstantive(){
        ArrayList<String> subs = new ArrayList<>();

        subs.add("den t�rta");
        subs.add("det l�r");
        subs.add("det h�r");
        subs.add("det kaffe");
        subs.add("den mun");
        subs.add("det leende");
        subs.add("den blus");
        subs.add("det mj�l");
        subs.add("den TV");
        subs.add("den k�rlek");
        subs.add("den smula");

        return subs.get(rand.nextInt(subs.size()));
    }

    private String doYouMind(){
        ArrayList<String> q = new ArrayList<>();

        q.add("har du n�got emot att");
        q.add("g�r det dig n�got att");
        q.add("bryr du dig om");
        q.add("skulle det g�ra n�got om");
        q.add("vad skulle du s�ga om");
        q.add("vad hade du gjort om");
        q.add("vad s�ger du om");

        return q.get(rand.nextInt(q.size()));
    }

    private String mineOrI(String tn){
        ArrayList<String> i = new ArrayList<>();
        String tOrN = "n";

        if(tn.equals("t")){
            tOrN = "tt";
        }

        i.add("jag");
        i.add("jag");
        i.add("jag");
        i.add("jag");
        i.add("mi" + tOrN + " " + getSubstantive().substring(4));
        i.add("mi" + tOrN + " " + getPresentVerb() + " " + getSubstantive().substring(4));

        return i.get(rand.nextInt(i.size()));
    }

    private String getVerb(){
        ArrayList<String> v = new ArrayList<>();

        v.add("hoppar");
        v.add("smeker");
        v.add("r�r");
        v.add("sl�r");
        v.add("tar");
        v.add("d�r");
        v.add("kramar");
        v.add("slaktar");

        return v.get(rand.nextInt(v.size()));
    }

    private String getPresentVerb(){
        ArrayList<String> v = new ArrayList<>();

        v.add("hoppande");
        v.add("skrikande");
        v.add("r�rande");
        v.add("flaxande");
        v.add("levande");
        v.add("fladdrande");
        v.add("sprutande");

        return v.get(rand.nextInt(v.size()));
    }

    private String getPreposition(){
        ArrayList<String> p = new ArrayList<>();

        p.add("med");
        p.add("med");
        p.add("med");
        p.add("med");
        p.add("med");
        p.add("under");
        p.add("�ver");
        p.add("tillsammans med");
        p.add("p�");
        p.add("p�");
        p.add("p�");
        p.add("p�");

        return p.get(rand.nextInt(p.size()));
    }

}
