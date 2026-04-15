public class GameMaster {

    public String describe(Character ch){
        return "You're a level "+ch.getLevel()+" "+ch.getCharacterClass()+" with "+ch.getHitPoints()+" hit points.";
    }

    public String describe(Destination ds){
        return "You've arrived at "+ds.getName()+", which has "+ds.getInhabitants()+" inhabitants.";}

    public String describe(TravelMethod th){
        return th==TravelMethod.valueOf("HORSEBACK")?"You're traveling to your destination on horseback.":"You're traveling to your destination by walking.";
    }

    public String describe(Character ch, Destination ds, TravelMethod th){
        return describe(ch)+" "+describe(th)+" "+describe(ds);
    }

    public String describe(Character ch, Destination ds){
        return describe(ch)+" "+describe(TravelMethod.WALKING)+" "+describe(ds);
    }
}
