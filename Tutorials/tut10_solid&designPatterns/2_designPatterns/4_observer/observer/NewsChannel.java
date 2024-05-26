package observer;

public class NewsChannel implements Channel {
    private String news;
    private String channelName;

    public NewsChannel(String name){
        this.channelName = name;
    }

    @Override
    public void update(String news) {
        System.out.println("%s has been notified with news ==> %s".formatted(channelName, news));
        this.news = news;
    }

    // standard getter and setter
    public String getNews() {

        return this.news;
    } 
}