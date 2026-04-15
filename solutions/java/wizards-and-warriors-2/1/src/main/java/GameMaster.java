public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character ch){
        return "You're a level "+ch.getLevel()+" "+ch.getCharacterClass()+" with "+ch.getHitPoints()+" hit points.";
    }

    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination ds){
        return "You've arrived at "+ds.getName()+", which has "+ds.getInhabitants()+" inhabitants.";}

    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod th){
        return th==TravelMethod.valueOf("HORSEBACK")?"You're traveling to your destination on horseback.":"You're traveling to your destination by walking.";
    }

    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character ch, Destination ds, TravelMethod th){
        return describe(ch)+" "+describe(th)+" "+describe(ds);
    }

    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character ch, Destination ds){
        return describe(ch)+" You're traveling to your destination by walking. "+describe(ds);
    }
}
