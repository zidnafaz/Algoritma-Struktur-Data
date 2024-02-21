public class Movie {
    public static void main(String[] args) {

        double[][] ratingMovie = {{4, 3, 4, 4},
                                  {1, 1, 2, 3},
                                  {1, 2, 3, 4}};
        
        rataRataRating(ratingMovie);
        
        System.out.println();

        int filmRatingTertinggi = cariFilmRatingTertinggi(ratingMovie);
        System.out.println("Film dengan rating tertinggi film ke : " + (filmRatingTertinggi + 1));
        
        int filmRatingTerendah = cariFilmRatingTerendah(ratingMovie);
        System.out.println("Film dengan rating terendah film ke : " + (filmRatingTerendah + 1));
    }
    
    public static void rataRataRating(double[][] ratingMovie) {
        for (int i = 0; i < ratingMovie.length; i++) {
            double totalRating = 0;
            for (int j = 0; j < ratingMovie[i].length; j++) {
                totalRating += ratingMovie[i][j];
            }
            double rataRata = totalRating / ratingMovie[i].length;
            System.out.println("Rata-rata rating film ke " + (i+1) + " : " + rataRata);
        }
    }
    
    public static int cariFilmRatingTertinggi(double[][] ratingMovie) {
        double maxRating = Double.MIN_VALUE;
        int filmTerbaik = -1;
        
        for (int i = 0; i < ratingMovie.length; i++) {
            double totalRating = 0;
            for (int j = 0; j < ratingMovie[i].length; j++) {
                totalRating += ratingMovie[i][j];
            }
            double rataRata = totalRating / ratingMovie[i].length;
            
            if (rataRata > maxRating) {
                maxRating = rataRata;
                filmTerbaik = i;
            }
        }
        
        return filmTerbaik;
    }
    
    public static int cariFilmRatingTerendah(double[][] ratingMovie) {
        double minRating = Double.MAX_VALUE;
        int filmTerburuk = -1;
        
        for (int i = 0; i < ratingMovie.length; i++) {
            double totalRating = 0;
            for (int j = 0; j < ratingMovie[i].length; j++) {
                totalRating += ratingMovie[i][j];
            }
            double rataRata = totalRating / ratingMovie[i].length;
            
            if (rataRata < minRating) {
                minRating = rataRata;
                filmTerburuk = i;
            }
        }
        
        return filmTerburuk;
    }
}