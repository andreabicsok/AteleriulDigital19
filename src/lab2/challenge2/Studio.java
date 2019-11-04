package lab2.challenge2;

public class Studio {
    private String nume;
    private Film[] filme;

    public Studio(String nume, Film[] filme){
        this.nume= nume;
        this.filme =  filme;
    }
    public int getNrFilme(){
        return filme.length;
    }

    public Film getFilmByActor(String actorName){
        for(int i=0; i< filme.length; i++) {
            if (filme[i].getActorByName(actorName) != null){
                return filme[i];
            }
        }
       return null;
    }

    public String toString(){
        return "Nume:" + nume + "Film" + filme;
    }

    public String getName() {
        return nume;
    }
}
