import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> hashset=new HashSet<>();
        for (int i=0;i<cards.size();i++){hashset.add(cards.get(i));}
        return hashset;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.size()==0 || theirCollection.size()==0){return false;}
        
        Set<String> temp=new HashSet<>(myCollection);
        
        myCollection.removeAll(theirCollection);
        theirCollection.removeAll(temp);
        
        return (myCollection.size()==0 || theirCollection.size()==0 )?false:true;
        
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> res=new HashSet<>(collections.get(0));
        for (int i=1;i<collections.size();i++){res.retainAll(collections.get(i));}
        return res;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> res=new HashSet<>(collections.get(0));
        
            for (Set<String> set : collections) {
        for (String card : set) {
            res.add(card);
        }
    }


        return res;
    }
}
