package lesson42;

public class NewsApp {
    public static void main(String[] args) {
        AllNews allNews = new AllNews();
        allNews.getAllNews();

        ScienceNews scienceNews = new ScienceNews();
        scienceNews.getScienceNews();

        TechnologyNews technologyNews = new TechnologyNews();
        technologyNews.getTechnologyNews();

        SportsNews sportsNews = new SportsNews();
        sportsNews.getSportsNews();
    }
}